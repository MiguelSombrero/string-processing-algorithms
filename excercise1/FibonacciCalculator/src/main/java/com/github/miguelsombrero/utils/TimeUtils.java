package com.github.miguelsombrero.utils;

public class TimeUtils {

    public static long getTime() {
        return System.currentTimeMillis();
    }

    public static long runningTime(long start) {
        return (getTime() - start);
    }

    public static boolean maxTimeExceeded(long start, long maxTime) {
        return (runningTime(start) >= maxTime);
    }
}
