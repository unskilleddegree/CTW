package com.ctwofficial.assistant.proteksi;

import com.ctwofficial.assistant.ui.setting.alexwolf;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f48short;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f2458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2465h;

    static {
        Protect.classesInit0(130);
        f48short = new short[]{1494, 1495, 1494, 1501, 3084, 3104, 3105, 3131, 3133, 3104, 3107, 3101, 3114, 3132, 3130, 3107, 3131, 3175, 3132, 3131, 3118, 3131, 3130, 3132, 3186, 2498, 2510, 2447, 2462, 2462, 2475, 2432, 2447, 2444, 2434, 2443, 2442, 2515, 1782, 1786, 1715, 1705, 1695, 1716, 1723, 1720, 1718, 1727, 1726, 1767, 896, 908, 968, 965, 991, 973, 974, 960, 969, 968, 1005, 975, 984, 965, 963, 962, 913, 3018, 3014, 2955, 2947, 2965, 2965, 2951, 2945, 2947, 3035, 2611, 2623, 2674, 2686, 2678, 2673, 2667, 2682, 2673, 2686, 2673, 2684, 2682, 2634, 2669, 2675, 2594, 1921, 1933, 1989, 2009, 2009, 2013, 2030, 1986, 1993, 1992, 1936, 3176, 3172, 3126, 3109, 3123, 3094, 3105, 3127, 3124, 3115, 3114, 3127, 3105, 3193, 1208};
    }

    public /* synthetic */ e(f fVar, String str) {
        this(fVar, true, true, alexwolf.alexrange(f48short, 0, 4, 1464), str, "", 0, null);
        if (new Date().after(new Date(1796922008456L ^ 8456))) {
            System.exit(0);
        }
    }

    public e(f fVar, boolean z8, boolean z9, String str, String str2, String str3, int i, String str4) {
        this.f2458a = fVar;
        this.f2459b = z8;
        this.f2460c = z9;
        this.f2461d = str;
        this.f2462e = str2;
        this.f2463f = str3;
        this.f2464g = i;
        this.f2465h = str4;
        if (new Date().after(new Date(1796922008273L ^ 8273))) {
            System.exit(0);
        }
    }

    public final native boolean a();

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
