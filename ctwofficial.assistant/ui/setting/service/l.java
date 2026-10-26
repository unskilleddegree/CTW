package com.ctwofficial.assistant.ui.setting.service;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f131short;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2847c;

    static {
        Protect.classesInit0(34);
        f131short = new short[]{1544, 1599, 1593, 1589, 1576, 1598, 1599, 1598, 1563, 1593, 1582, 1587, 1589, 1588, 1650, 1580, 1587, 1599, 1581, 1555, 1598, 1639, 435, 447, 487, 418, 1274, 1270, 1199, 1259, 958, 946, 1011, 1009, 998, 1019, 1021, 1020, 966, 1003, 994, 1015, 943, 930, 955};
    }

    public l(int i, int i5, String str) {
        this.f2845a = str;
        this.f2846b = i;
        this.f2847c = i5;
        if (new Date().after(new Date(1796922008024L ^ 9048))) {
            System.exit(0);
        }
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
