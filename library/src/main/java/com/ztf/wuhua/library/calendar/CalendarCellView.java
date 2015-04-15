package com.ztf.wuhua.library.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.ztf.wuhua.library.R;

/**
 * Created by andyhua on 15-4-14.
 */
public class CalendarCellView extends TextView {
    private static final String TAG = "CalendarCellView";

    private static final int[] STATE_SELECTABLE = {
            R.attr.state_selectable
    };

    private static final int[] STATE_CURRENT_MONTH = {
            R.attr.state_current_month
    };

    private static final int[] STATE_TODAY = {
            R.attr.state_today
    };

    private static final int[] STATE_HIGHLIGHTED = {
            R.attr.state_highlighted
    };

    private static final int[] STATE_RANGE_FIRST = {
            R.attr.state_range_first
    };

    private static final int[] STATE_RANGE_MIDDLE = {
            R.attr.state_range_middle
    };

    private static final int[] STATE_RANGE_LAST = {
            R.attr.state_range_last
    };


    private boolean isSelectable = false;
    private boolean isCurrentMonth = false;
    private boolean isToday = false;
    private boolean isHighLighted = false;

    private MonthCellDescriptor.RangeState rangeState = MonthCellDescriptor.RangeState.NONE;

    /**
     * @param context
     * @param attrs
     */
    public CalendarCellView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * @return
     */
    public boolean isSelectable() {
        return isSelectable;
    }

    /**
     * @param isSelectable
     */
    public void setSelectable(boolean isSelectable) {
        this.isSelectable = isSelectable;
        refreshDrawableState();
    }

    /**
     * @return
     */
    public boolean isCurrentMonth() {
        return isCurrentMonth;
    }

    /**
     * @param isCurrentMonth
     */
    public void setCurrentMonth(boolean isCurrentMonth) {
        this.isCurrentMonth = isCurrentMonth;
        refreshDrawableState();
    }

    /**
     * @return
     */
    public boolean isToday() {
        return isToday;
    }

    /**
     * @param isToday
     */
    public void setToday(boolean isToday) {
        this.isToday = isToday;
        refreshDrawableState();
    }

    /**
     * @return
     */
    public boolean isHighLighted() {
        return isHighLighted;
    }

    /**
     * @param isHighLighted
     */
    public void setHighLighted(boolean isHighLighted) {
        this.isHighLighted = isHighLighted;
        refreshDrawableState();
    }

    /**
     * @return
     */
    public MonthCellDescriptor.RangeState getRangeState() {
        return rangeState;
    }

    /**
     * @param rangeState
     */
    public void setRangeState(MonthCellDescriptor.RangeState rangeState) {
        this.rangeState = rangeState;
        refreshDrawableState();
    }

    /**
     * @param extraSpace
     * @return
     */
    @Override
    protected int[] onCreateDrawableState(int extraSpace) {
        final int[] drawableState = super.onCreateDrawableState(extraSpace + 5);

        if (isSelectable) {
            mergeDrawableStates(drawableState, STATE_SELECTABLE);
        }

        if (isCurrentMonth) {
            mergeDrawableStates(drawableState, STATE_CURRENT_MONTH);
        }

        if (isToday) {
            mergeDrawableStates(drawableState, STATE_TODAY);
        }

        if (isHighLighted) {
            mergeDrawableStates(drawableState, STATE_HIGHLIGHTED);
        }

        if (rangeState == MonthCellDescriptor.RangeState.FIRST) {
            mergeDrawableStates(drawableState, STATE_RANGE_FIRST);
        } else if (rangeState == MonthCellDescriptor.RangeState.MIDDLE) {
            mergeDrawableStates(drawableState, STATE_RANGE_MIDDLE);
        } else if (rangeState == MonthCellDescriptor.RangeState.LAST) {
            mergeDrawableStates(drawableState, STATE_RANGE_LAST);
        }

        return drawableState;
    }
}
