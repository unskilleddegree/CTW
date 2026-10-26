package com.ctwofficial.assistant.ui.setting.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f121short;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f2804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2806e;

    static {
        Protect.classesInit0(137);
        f121short = new short[]{3000, 2959, 2969, 2975, 2950, 2974, 3010, 2974, 2949, 2945, 2959, 2948, 2969, 3031, 1363, 1375, 1289, 1310, 1299, 1290, 1306, 1292, 1346, 3038, 3026, 2946, 2944, 2971, 2961, 2967, 3023, 2512, 2524, 2447, 2451, 2441, 2446, 2463, 2457, 2497, 1786, 1782, 1700, 1715, 1719, 1701, 1721, 1720, 1771, 1009};
    }

    public f0(List list, ArrayList arrayList, Integer num, String str, String str2) {
        this.f2802a = list;
        this.f2803b = arrayList;
        this.f2804c = num;
        this.f2805d = str;
        this.f2806e = str2;
        if (new Date().after(new Date(1796922004201L ^ 4201))) {
            System.exit(0);
        }
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
