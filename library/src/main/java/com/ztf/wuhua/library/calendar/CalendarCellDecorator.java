package com.ztf.wuhua.library.calendar;

import java.util.Date;

/**
 * Created by andyhua on 15-4-14.
 */
public interface CalendarCellDecorator {
    static final String TAG = "CalendarCellDecorator";

    void decorate(CalendarCellView cellView, Date date);
}
