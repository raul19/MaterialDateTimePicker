package com.wdullaer.materialdatetimepicker.supportdate;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by rmore on 06/03/2017.
 */

public class SupportSimpleDayPickerView extends SupportDayPickerView {

    public SupportSimpleDayPickerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SupportSimpleDayPickerView(Context context, SupportDatePickerController controller) {
        super(context, controller);
    }

    @Override
    public SupportMonthAdapter createMonthAdapter(Context context, SupportDatePickerController controller) {
        return new SupportSimpleMonthAdapter(context, controller);
    }
}
