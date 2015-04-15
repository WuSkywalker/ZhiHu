package com.ztf.wuhua.library.calendar;

import android.util.Log;
import com.ztf.wuhua.library.BuildConfig;

/**
 * Created by andyhua on 15-4-14.
 */
public final class Logcat {
    private static final String TAG = "Logcat";

    /**
     * @param message
     */
    public static void d(String message) {
        if (BuildConfig.DEBUG) {
            Log.d(TAG, message);
        }
    }

    /**
     * @param message
     * @param args
     */
    public static void d(String message, Object... args) {
        if (BuildConfig.DEBUG) {
            d(String.format(message, args));
        }
    }
}
