package com.ctwofficial.assistant.proteksi;

import android.content.Context;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f64short;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g7.l f2532e;

    static {
        Protect.classesInit0(132);
        f64short = new short[]{1647, 1626, 1617, 1627, 1622, 1617, 1624, 1641, 1630, 1619, 1622, 1627, 1630, 1611, 1622, 1616, 1617, 1559, 1628, 1616, 1617, 1611, 1626, 1607, 1611, 1538, 2160, 2172, 2106, 2099, 2094, 2111, 2105, 2145, 3142, 3146, 3083, 3081, 3102, 3075, 3100, 3075, 3102, 3091, 3134, 3091, 3098, 3087, 3159, 2138, 2134, 2071, 2069, 2050, 2079, 2048, 2079, 2050, 2063, 2082, 2079, 2050, 2074, 2067, 2123, 2072, 2051, 2074, 2074, 2138, 2134, 2071, 2069, 2050, 2079, 2048, 2079, 2050, 2063, 2098, 2067, 2050, 2071, 2079, 2074, 2123, 2430, 2418, 2353, 2355, 2366, 2366, 2352, 2355, 2353, 2361, 2415, 807};
    }

    public x(Context context, boolean z8, String str, String str2, g7.l lVar) {
        this.f2528a = context;
        this.f2529b = z8;
        this.f2530c = str;
        this.f2531d = str2;
        this.f2532e = lVar;
        if (new Date().after(new Date(1796922006194L ^ 6194))) {
            System.exit(0);
        }
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
