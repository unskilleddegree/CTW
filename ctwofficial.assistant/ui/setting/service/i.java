package com.ctwofficial.assistant.ui.setting.service;

import java.util.ArrayList;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f125short;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f2816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f2817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f2820f;

    static {
        Protect.classesInit0(35);
        f125short = new short[]{310, 280, 283, 279, 287, 302, 283, 282, 273, 348, 285, 272, 329, 1799, 1803, 1863, 1866, 1887, 1814, 2659, 2671, 2595, 2593, 2600, 2674, 656, 668, 718, 733, 728, 725, 713, 719, 753, 729, 712, 729, 718, 719, 641, 1704, 1700, 1768, 1765, 1766, 1761, 1768, 1721, 1809, 1821, 1884, 1873, 1876, 1884, 1870, 1880, 1870, 1792, 535};
    }

    public i(String str, double d9, double d10, float f7, String str2, ArrayList arrayList) {
        this.f2815a = str;
        this.f2816b = d9;
        this.f2817c = d10;
        this.f2818d = f7;
        this.f2819e = str2;
        this.f2820f = arrayList;
        if (new Date().after(new Date(1796922003693L ^ 4717))) {
            System.exit(0);
        }
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
