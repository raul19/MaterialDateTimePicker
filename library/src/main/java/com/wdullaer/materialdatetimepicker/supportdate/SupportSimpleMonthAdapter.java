package com.wdullaer.materialdatetimepicker.supportdate;

import android.content.Context;

/**
 * Created by rmore on 06/03/2017.
 */

public class SupportSimpleMonthAdapter extends SupportMonthAdapter {

    public SupportSimpleMonthAdapter(Context context, SupportDatePickerController controller) {
        super(context, controller);
    }

    @Override
    public SupportMonthView createMonthView(Context context) {
        final SupportMonthView monthView = new SupportSimpleMonthView(context, null, mController);
        return monthView;
    }
}
