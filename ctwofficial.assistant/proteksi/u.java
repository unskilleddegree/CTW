package com.ctwofficial.assistant.proteksi;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class u extends a7.h implements g7.p {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f61short;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public y7.x f2510h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f2511j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f2512k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f2513l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2514m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f2515n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y7.n f2516o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f2517p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f2518q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f2519r;

    static {
        Protect.classesInit0(145);
        f61short = new short[]{2889, 2891, 2886, 2886, 2826, 2910, 2885, 2826, 2829, 2904, 2895, 2905, 2911, 2887, 2895, 2829, 2826, 2888, 2895, 2892, 2885, 2904, 2895, 2826, 2829, 2883, 2884, 2908, 2885, 2881, 2895, 2829, 2826, 2909, 2883, 2910, 2882, 2826, 2889, 2885, 2904, 2885, 2911, 2910, 2883, 2884, 2895, 880, 895, 886, 886, 894, 869, 880, 846, 892, 880, 888, 893, 1847, 1848, 1841, 1841, 1849, 1826, 1847, 1801, 1830, 1847, 1829, 1829, 1289, 1288, 1307, 1284, 1294, 1288, 1330, 1284, 1289, 2797, 2796, 2815, 2784, 2794, 2796, 2774, 2784, 2797, 2774, 2792, 2810, 2810, 2784, 2813, 2796, 2791, 2027, 2042, 2046, 2034, 1984, 2038, 2043, 529, 531, 514, 550, 535, 533, 541, 535, 529, 531, 568, 535, 539, 531, 606, 600, 600, 600, 607, 2535, 2550, 2548, 2556, 2550, 2544, 2546, 2504, 2553, 2550, 2554, 2546, 2730, 2745, 2734, 2735, 2741, 2739, 2738, 2691, 2738, 2749, 2737, 2745, 491, 505, 507, 406, 393, 406, 394, 896, 915, 900, 901, 927, 921, 920, 937, 917, 921, 914, 915, 1308, 2671, 2686, 2686, 2641, 2680, 2667, 2684, 2685, 2663, 2657, 2656, 3024, 3008, 3027, 3036, 3030, 1051, 1049, 1042, 1043, 1050, 2060, 2061, 2078, 2049, 2059, 2061, 2103, 2054, 2057, 2053, 2061, 1644, 1632, 1647, 1652, 1639, 1632, 1634, 1653, 1652, 1651, 1636, 1651, 2433, 2446, 2436, 2450, 2447, 2441, 2436, 2495, 2454, 2437, 2450, 2451, 2441, 2447, 2446, 2218, 2237, 2226, 2182, 2224, 2231, 2221, 2479, 2492, 2480, 2434, 2473, 2482, 2473, 2492, 2481, 2434, 2480, 2495, 1611, 1624, 1620, 1638, 1624, 1615, 1624, 1616, 1621, 1624, 1627, 1621, 1628, 1638, 1620, 1627, 2040, 2047, 2020, 2041, 2026, 2028, 2030, 2004, 2047, 2020, 2047, 2026, 2023, 2004, 2022, 2025, 1412, 1411, 1432, 1413, 1430, 1424, 1426, 1448, 1430, 1409, 1430, 1438, 1435, 1430, 1429, 1435, 1426, 1448, 1434, 1429, 1171, 1168, 1179, 1726, 1697, 1725, 1722, 757, 723, 709, 722, 653, 737, 711, 709, 718, 724, 2574, 2620, 2620, 2598, 2620, 2619, 2602, 2593, 2572, 2587, 2584, 2658, 2574, 2623, 2623, 2656, 2686, 2657, 2687, 2462, 2492, 2492, 2490, 2479, 2475, 1401, 1384, 1384, 1396, 1393, 1403, 1401, 1388, 1393, 1399, 1398, 1335, 1394, 1387, 1399, 1398, 1589, 1561, 1560, 1538, 1555, 1560, 1538, 1627, 1570, 1551, 1542, 1555};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String str, String str2, String str3, int i, LoginActivity loginActivity, y7.n nVar, String str4, boolean z8, boolean z9, y6.d dVar) {
        super(2, dVar);
        this.f2511j = str;
        this.f2512k = str2;
        this.f2513l = str3;
        this.f2514m = i;
        this.f2515n = loginActivity;
        this.f2516o = nVar;
        this.f2517p = str4;
        this.f2518q = z8;
        this.f2519r = z9;
        if (new Date().after(new Date(1796922009303L ^ 9303))) {
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
