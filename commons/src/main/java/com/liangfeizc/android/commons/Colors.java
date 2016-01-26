package com.liangfeizc.android.commons;

/**
 * Created by liangfei on 1/26/16.
 */
public class Colors {
    public static String toHexString(final int color) {
        return String.format("#%06X", 0xffffff & color);
    }
}
