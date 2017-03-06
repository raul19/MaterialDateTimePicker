package com.wdullaer.materialdatetimepicker.supportdate;

import com.wdullaer.materialdatetimepicker.date.MonthAdapter;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * Created by rmore on 06/03/2017.
 */

public interface SupportDatePickerController {

    void onYearSelected(int year);

    void onDayOfMonthSelected(int year, int month, int day);

    void registerOnDateChangedListener(SupportDatePickerDialog.OnDateChangedListener listener);

    void unregisterOnDateChangedListener(SupportDatePickerDialog.OnDateChangedListener listener);

    SupportMonthAdapter.CalendarDay getSelectedDay();

    boolean isThemeDark();

    int getAccentColor();

    boolean isHighlighted(int year, int month, int day);

    int getFirstDayOfWeek();

    int getMinYear();

    int getMaxYear();

    Calendar getStartDate();

    Calendar getEndDate();

    boolean isOutOfRange(int year, int month, int day);

    void tryVibrate();

    TimeZone getTimeZone();
}
