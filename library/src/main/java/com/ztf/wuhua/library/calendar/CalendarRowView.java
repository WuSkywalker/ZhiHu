package com.ztf.wuhua.library.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/**
 * TableRow that draws a divider between each cell. To be used with {@link CalendarGridView}.
 * Created by andyhua on 15-4-14.
 */
public class CalendarRowView extends ViewGroup implements View.OnClickListener {
    private static final String TAG = "CalendarRowView";

    private boolean isHeaderRow;
    private MonthView.Listener listener;

    /**
     * @param context
     * @param attrs
     */
    public CalendarRowView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * @param child
     * @param index
     * @param params
     */
    @Override
    public void addView(View child, int index, LayoutParams params) {
        child.setOnClickListener(this);
        super.addView(child, index, params);
    }

    /**
     * @param widthMeasureSpec
     * @param heightMeasureSpec
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    /**
     * @param v
     */
    @Override
    public void onClick(View v) {

    }

    /**
     * @param changed
     * @param l
     * @param t
     * @param r
     * @param b
     */
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }
}
