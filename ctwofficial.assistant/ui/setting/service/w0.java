package com.ctwofficial.assistant.ui.setting.service;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends y0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f150short;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2924c;

    static {
        Protect.classesInit0(146);
        f150short = new short[]{2083, 2063, 2062, 2054, 2057, 2066, 2061, 2053, 2052, 2120, 2066, 2049, 2071, 2141, 2401, 2413, 2336, 2344, 2361, 2344, 2367, 2366, 2416, 2010, 2006, 1925, 1945, 1923, 1924, 1941, 1939, 1995, 2727};
    }

    public w0(int i, String str, String str2) {
        this.f2922a = str;
        this.f2923b = i;
        this.f2924c = str2;
        if (new Date().after(new Date(1796922000772L ^ 1796))) {
            System.exit(0);
        }
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
