package com.ztf.wuhua.library.calendar;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.ztf.wuhua.library.R;

/**
 * ViewGroup that draws a grid of calendar cells. All children must be {@link CalendarRowView}s.
 * The first row is assumed to be a header and no divider is drawn above it.
 * <p/>
 * Created by andyhua on 15-4-14.
 */
public class CalendarGridView extends ViewGroup {
    private static final String TAG = "CalendarGridView";

    /**
     * The grid lines don't exactly line up on certain devices (Nexus 7, Nexus 5). Fudging the
     * co-ordinates by half a point seems to fix this without breaking other devices.
     */
    private static final float FLOAT_FUDGE = 0.5f;

    private final Paint dividerPaint = new Paint();
    private int oldWidthMeasureSize;
    private int oldNumRows;

    /**
     * @param context
     * @param attrs
     */
    public CalendarGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
        dividerPaint.setColor(getResources().getColor(R.color.calendar_divider));
    }

    /**
     *
     * @param color
     */
    public void setDividerColor(int color){
        this.dividerPaint.setColor(color);
    }

    /**
     *
     * @param color
     */
    public void setDayBackground(int color){
        for (int i = 0; i < getChildCount(); i++){
            (CalendarRowView)getChildAt(i).setC
        }
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
