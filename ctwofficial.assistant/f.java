package com.ctwofficial.assistant;

import java.util.Date;
import java.util.concurrent.CountDownLatch;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f23short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2347g;

    static {
        Protect.classesInit0(172);
        f23short = new short[]{1247, 1271, 1269, 1264, 1267, 1241, 1269, 1271, 1258, 1275, 1262, 1210, 1276, 1269, 1268, 1262, 1210, 1258, 1256, 1269, 1260, 1267, 1278, 1279, 1256, 1210, 1268, 1269, 1262, 1210, 1275, 1260, 1275, 1267, 1270, 1275, 1272, 1270, 1279, 1210, 1269, 1268, 1210, 1262, 1266, 1267, 1257, 1210, 1278, 1279, 1260, 1267, 1273, 1279, 1204, 1853, 1803, 1821, 1799, 1870, 1802, 1799, 1818, 1793, 1794, 1807, 1797, 1870, 1821, 1803, 1820, 1816, 1803, 1820, 1856, 2163, 2152, 2156, 2146, 2153, 2168, 2146, 2154, 2167, 2163, 2174, 1912, 1904, 1912, 1911, 1904, 1895, 1898, 1904, 1912, 1893, 1889, 1900, 2745, 2742, 2751, 2751, 2743, 2732, 2745, 2727, 2741, 2745, 2737, 2740, 2727, 2749, 2741, 2728, 2732, 2721, 3193, 3183, 3193, 3193, 3171, 3173, 3172, 3189, 3192, 3183, 3194, 3174, 3179, 3177, 3183, 3182, 1898, 1899, 1912, 1895, 1901, 1899, 1905, 1916, 1899, 1918, 1890, 1903, 1901, 1899, 1898, 1436, 1438, 1438, 1426, 1416, 1427, 1417, 1410, 1432, 1413, 1421, 1428, 1423, 1432, 1433, 638, 630, 638, 625, 630, 609, 620, 630, 619, 611, 634, 609, 630, 631, 1184, 1186, 1186, 1198, 1204, 1199, 1205, 1214, 1187, 1197, 1198, 1186, 1194, 1188, 1189, 2132, 2140, 2132, 2139, 2140, 2123, 2118, 2122, 2124, 2122, 2121, 2140, 2135, 2141, 2140, 2141, 2076, 2061, 2057, 2053, 2071, 2061, 2064, 2072, 2049, 2074, 2061, 2060, 2636, 2653, 2649, 2645, 2631, 2650, 2644, 2647, 2651, 2643, 2653, 2652, 1812, 1794, 1812, 1812, 1806, 1800, 1801, 1816, 1806, 1801, 1809, 1798, 1803, 1806, 1795, 3114, 3115, 3128, 3111, 3117, 3115, 3121, 3107, 3111, 3133, 3107, 3119, 3130, 3117, 3110, 314, 315, 296, 311, 317, 315, 289, 316, 319, 304, 304, 315, 314, 2644, 2639, 2677, 2640, 2640, 2629, 2642, 2659, 2625, 2643, 2629, 2568, 2574, 2574, 2574, 2569};
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i) {
        this.f2344d = i;
        this.f2345e = obj;
        this.f2347g = obj2;
        this.f2346f = obj3;
        if (new Date().after(new Date(1796922006554L ^ 7834))) {
            System.exit(0);
        }
    }

    public /* synthetic */ f(Object obj, String str, String str2, int i) {
        this.f2344d = i;
        this.f2345e = obj;
        this.f2346f = str;
        this.f2347g = str2;
        if (new Date().after(new Date(1796922004025L ^ 4281))) {
            System.exit(0);
        }
    }

    public /* synthetic */ f(String str, CrashLog crashLog, CountDownLatch countDownLatch) {
        this.f2344d = 2;
        this.f2346f = str;
        this.f2345e = crashLog;
        this.f2347g = countDownLatch;
        if (new Date().after(new Date(1796922004076L ^ 4332))) {
            System.exit(0);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
