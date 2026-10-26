package com.ctwofficial.assistant.proteksi;

import android.content.Context;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class DeviceSpecUtils {
    public static final int $stable = 0;
    public static final DeviceSpecUtils INSTANCE;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f39short;

    static {
        Protect.classesInit0(25);
        f39short = new short[]{1933, 1931, 1934, 1934, 1937, 1932, 1930, 1947, 1946, 1921, 1951, 1948, 1943, 1933, 2556, 2544, 2545, 2539, 2554, 2535, 2539, 2435, 2444, 2438, 2448, 2445, 2443, 2438, 2493, 2443, 2438, 3306, 3302, 3303, 3325, 3308, 3313, 3325, 721, 723, 708, 729, 710, 729, 708, 713, 2041, 2037, 2036, 2030, 2047, 2018, 2030, 2633, 2635, 2652, 2625, 2654, 2625, 2652, 2641, 898, 896, 913, 929, 900, 913, 900, 929, 908, 919, 896, 902, 913, 906, 919, 924, 973, 971, 971, 971, 972, 2891, 2889, 2904, 2920, 2893, 2904, 2893, 2920, 2885, 2910, 2889, 2895, 2904, 2883, 2910, 2901, 2820, 2818, 2818, 2818, 2821};
        INSTANCE = new DeviceSpecUtils();
    }

    private DeviceSpecUtils() {
        if (new Date().after(new Date(1796922008794L ^ 9818))) {
            System.exit(0);
        }
    }

    public final native String getAbi();

    public final native String getAndroidVersion();

    public final native String getBrand();

    public final native String getDeviceId(Context context);

    public final native String getDeviceName();

    public final native String getManufacturer();

    public final native String getModel();

    public final native long getRamAvailableMb(Context context);

    public final native long getRamTotalMb(Context context);

    public final native int getSdkInt();

    public final native long getStorageAvailableMb();

    public final native long getStorageTotalMb();
}
