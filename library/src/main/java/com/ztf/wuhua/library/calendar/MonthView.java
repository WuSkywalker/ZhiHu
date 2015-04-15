package com.ztf.wuhua.library.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ztf.wuhua.library.R;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.List;

/**
 * Created by andyhua on 15-4-14.
 */
public class MonthView extends LinearLayout {
    private static final String TAG = "MonthView";

    private TextView title;
    private CalendarGridView grid;
    private List<CalendarCellDecorator> decorators;

    /**
     * @param context
     * @param attrs
     */
    public MonthView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * @param parent
     * @param inflater
     * @param weekdayNameFormat
     * @param listener
     * @param today
     * @param dividerColor
     * @param dayBackgroundResId
     * @param dayTextColorResId
     * @param titleTextColor
     * @param displayHeader
     * @param headerTextColor
     * @return
     */
    public static MonthView create(ViewGroup parent, LayoutInflater inflater,
                                   DateFormat weekdayNameFormat, Listener listener, Calendar today, int dividerColor,
                                   int dayBackgroundResId, int dayTextColorResId, int titleTextColor, boolean displayHeader,
                                   int headerTextColor) {
        return create(parent, inflater, weekdayNameFormat, listener, today, dividerColor,
                dayBackgroundResId, dayTextColorResId, titleTextColor, displayHeader, headerTextColor, null);
    }

    /**
     * @param parent
     * @param inflater
     * @param weekdayNameFormat
     * @param listener
     * @param today
     * @param dividerColor
     * @param dayBackgroundResId
     * @param dayTextColorResId
     * @param titleTextColor
     * @param displayHeader
     * @param headerTextColor
     * @param decorators
     * @return
     */
    public static MonthView create(ViewGroup parent, LayoutInflater inflater, DateFormat weekdayNameFormat,
                                   Listener listener, Calendar today, int dividerColor, int dayBackgroundResId,
                                   int dayTextColorResId, int titleTextColor, boolean displayHeader,
                                   int headerTextColor, List<CalendarCellDecorator> decorators) {

        final MonthView view = (MonthView) inflater.inflate(R.layout.month, parent, false);
        return view;
    }

    /**
     * @param color
     */
    public void setDividerColor(int color) {
        this.grid.setDividerColor(color);
    }

    /**
     *
     * @param resId
     */
    public void setDayBackground(int resId) {
        this.grid.setDayBackground(resId);
    }

    /**
     *
     * @param resId
     */
    public void setDayTextColor(int resId){
        this.grid.setDayT
    }
    /**
     * @return
     */
    public List<CalendarCellDecorator> getDecorators() {
        return decorators;
    }

    /**
     * @param decorators
     */
    public void setDecorators(List<CalendarCellDecorator> decorators) {
        this.decorators = decorators;
    }

    /**
     *
     */
    public interface Listener {
        void handleClick(MonthCellDescriptor cell);
    }
}
