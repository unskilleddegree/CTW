package com.ctwofficial.assistant.data;

import com.ctwofficial.assistant.databinding.slow;
import h7.h;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f20short;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f2284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f2285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f2287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f2288f;

    static {
        Protect.classesInit0(106);
        f20short = new short[]{287, 280, 286, 265, 265, 280, 290, 269, 257, 265, 763, 725, 726, 730, 722, 739, 726, 727, 732, 657, 720, 733, 644, 3034, 3030, 2970, 2967, 2946, 3019, 2995, 3007, 3059, 3057, 3064, 2978, 2879, 2867, 2913, 2930, 2935, 2938, 2918, 2912, 2910, 2934, 2919, 2934, 2913, 2912, 2862, 2010, 2006, 1925, 1922, 1924, 1939, 1939, 1922, 1976, 1943, 1947, 1939, 1995, 2342, 2346, 2411, 2406, 2403, 2411, 2425, 2415, 2425, 2368, 2425, 2405, 2404, 2359, 1680};
    }

    public a(String str, double d9, double d10, int i, String str2, String str3) {
        h.e(str2, slow.anchor(f20short, 0, 10, 364));
        this.f2283a = str;
        this.f2284b = d9;
        this.f2285c = d10;
        this.f2286d = i;
        this.f2287e = str2;
        this.f2288f = str3;
        if (new Date().after(new Date(1796922004148L ^ 4148))) {
            System.exit(0);
        }
    }

    public final native double a();

    public final native double b();

    public final native int c();

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
