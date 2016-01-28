package com.liangfeizc.android.commons;

import java.io.File;

/**
 * Created by liangfei on 16/1/28.
 */
public class Files {
    public static String getFileName(final String path) {
        final int separatorIndex = path.lastIndexOf(File.separator);
        return (separatorIndex < 0) ? path : path.substring(separatorIndex + 1, path.length());
    }

    public static String getFileDir(final String path) {
        final int separatorIndex = path.lastIndexOf(File.separator);
        return (separatorIndex < 0) ? path : path.substring(0, separatorIndex);
    }
}
