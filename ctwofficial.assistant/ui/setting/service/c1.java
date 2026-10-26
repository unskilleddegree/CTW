package com.ctwofficial.assistant.ui.setting.service;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class c1 extends com.bumptech.glide.d {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f117short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2787e;

    static {
        Protect.classesInit0(150);
        f117short = new short[]{724, 751, 736, 759, 736, 744, 749, 736, 739, 749, 740, 681, 755, 740, 736, 754, 750, 751, 700, 2063, 2051, 2126, 2124, 2125, 2118, 2138, 2144, 2124, 2134, 2125, 2135, 2078, 1936};
    }

    public c1(int i, String str) {
        this.f2786d = str;
        this.f2787e = i;
        if (new Date().after(new Date(1796922000691L ^ 1971))) {
            System.exit(0);
        }
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
