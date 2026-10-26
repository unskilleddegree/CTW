package com.ctwofficial.assistant.proteksi;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class s extends a7.h implements g7.p {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f59short;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f2496h;
    public final /* synthetic */ y7.x i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f2497j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y7.n f2498k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f2499l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f2500m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f2501n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f2502o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f2503p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f2504q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f2505r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f2506s;

    static {
        Protect.classesInit0(143);
        f59short = new short[]{1139, 1139, 1067, 1052, 1034, 1033, 1046, 1047, 1091, 1139, 2771, 2774, 2754, 2759, 2770, 2755, 2210, 2222, 2214, 2209, 2235, 2218, 2209, 2222, 2209, 2220, 2218, 2113, 2120, 2133, 2116, 2114, 2168, 2116, 2123, 2120, 2132, 2114, 1356, 1373, 1358, 1372, 1351, 2866, 2851, 2868, 2859, 2863, 2856, 2855, 2866, 2851, 1686, 1677, 1710, 1677, 1685, 1671, 1680, 1697, 1667, 1681, 1671, 1738, 1740, 1740, 1740, 1739, 3131, 3108, 3104, 3079, 3104, 3110, 3133, 3130, 3123, 3196, 3194, 3194, 3194, 3197, 2681, 2683, 2666, 2637, 2666, 2668, 2679, 2672, 2681, 2614, 2608, 2608, 2608, 2615, 1230, 1273, 1263, 1260, 1267, 1266, 1263, 1273, 1212, 1278, 1267, 1272, 1253, 1212, 1271, 1267, 1263, 1267, 1266, 1275, 1751, 939, 1321, 2427, 1374, 3052, 3051, 3070, 3051, 3050, 3052, 300, 288, 299, 298, 3138, 3136, 3159, 3146, 3148, 3149, 2788, 2793, 2803, 2785, 2786, 2796, 2789, 2788, 2783, 2785, 2787, 2804, 2793, 2799, 2798, 2376, 2372, 2380, 2379, 2385, 2368, 2379, 2372, 2379, 2374, 2368, 2426, 2384, 2391, 2377, 2631, 2639, 2649, 2649, 2635, 2637, 2639, 1435, 1432, 1431, 1431, 1436, 1437, 2954, 2955, 2968, 2951, 2957, 2955, 2961, 2956, 2959, 2944, 2944, 2955, 2954, 3170, 3189, 3189, 3176, 3189, 1968, 1963, 1967, 1953, 1962, 1852, 1843, 1850, 1850, 1842, 1833, 1852, 1794, 1844, 1849, 1940, 1925, 1921, 1933, 1983, 1929, 1924, 757, 762, 755, 755, 763, 736, 757, 715, 753, 748, 740, 752, 757, 736, 753, 1946, 1947, 1928, 1943, 1949, 1947, 1953, 1943, 1946, 2608, 2623, 2614, 2614, 2622, 2597, 2608, 2574, 2620, 2608, 2616, 2621, 1013, 995, 1013, 1013, 1007, 1001, 1000, 985, 1010, 1001, 1005, 995, 1000, 927, 899, 899, 903, 900, 973, 984, 984, 916, 899, 896, 986, 920, 913, 913, 926, 916, 926, 918, 923, 985, 916, 920, 922, 984, 922, 914, 922, 917, 914, 901, 984, 918, 900, 900, 926, 900, 899, 914, 921, 984, 898, 903, 915, 918, 899, 914, 984, 2457, 2454, 2460, 2442, 2455, 2449, 2460, 2518, 2449, 2454, 2444, 2461, 2454, 2444, 2518, 2457, 2459, 2444, 2449, 2455, 2454, 2518, 2478, 2481, 2493, 2479, 1084, 1025, 1050, 1052, 1033, 1037, 1040, 1046, 1047, 1091, 1113, 1002, 1011, 1007, 1006, 997, 984, 963, 965, 976, 980, 969, 975, 974, 922, 896};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str, y7.x xVar, LoginActivity loginActivity, y7.n nVar, String str2, boolean z8, String str3, String str4, int i, String str5, String str6, boolean z9, y6.d dVar) {
        super(2, dVar);
        this.f2496h = str;
        this.i = xVar;
        this.f2497j = loginActivity;
        this.f2498k = nVar;
        this.f2499l = str2;
        this.f2500m = z8;
        this.f2501n = str3;
        this.f2502o = str4;
        this.f2503p = i;
        this.f2504q = str5;
        this.f2505r = str6;
        this.f2506s = z9;
        if (new Date().after(new Date(1796922000088L ^ 88))) {
            System.exit(0);
        }
    }

    @Override // g7.p
    public final native Object c(Object obj, Object obj2);

    @Override // a7.a
    public final native y6.d g(Object obj, y6.d dVar);

    @Override // a7.a
    public final native Object h(Object obj);
}
