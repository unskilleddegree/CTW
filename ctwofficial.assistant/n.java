package com.ctwofficial.assistant;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f33short;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2402g;

    static {
        Protect.classesInit0(182);
        f33short = new short[]{1179, 1200, 1209, 1196, 1173, 1213, 1195, 1195, 1209, 1215, 1213, 1264, 1201, 1212, 1253, 1347, 1359, 1282, 1290, 1308, 1308, 1294, 1288, 1290, 1362, 1985, 1997, 1921, 1922, 1934, 1932, 1945, 1924, 1922, 1923, 2000, 2301, 2289, 2229, 2224, 2213, 2228, 2284, 2930, 2942, 2874, 2871, 2861, 2862, 2866, 2879, 2855, 2832, 2879, 2867, 2875, 2915, 1732, 1736, 1669, 1677, 1669, 1674, 1677, 1690, 1697, 1676, 1749, 921, 917, 988, 966, 1009, 976, 985, 976, 961, 976, 977, 904, 1133};
    }

    public n(int i, String str, String str2, String str3, String str4, String str5, boolean z8) {
        this.f2396a = i;
        this.f2397b = str;
        this.f2398c = str2;
        this.f2399d = str3;
        this.f2400e = str4;
        this.f2401f = str5;
        this.f2402g = z8;
        if (new Date().after(new Date(1796922001457L ^ 2737))) {
            System.exit(0);
        }
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
