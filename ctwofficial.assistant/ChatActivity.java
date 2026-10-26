package com.ctwofficial.assistant;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class ChatActivity extends h.k {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ int f2198a0 = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f0short;
    public RecyclerView H;
    public EditText I;
    public ImageButton J;
    public ImageButton K;
    public ProgressBar L;
    public View M;
    public ImageButton N;
    public m R;
    public boolean T;
    public boolean V;
    public int Y;
    public final u6.e B = new u6.e(new i(0));
    public final u6.e C = new u6.e(new i(1));
    public final u6.e D = new u6.e(new i(2));
    public final u6.e E = new u6.e(new i(3));
    public final u6.e F = new u6.e(new i(4));
    public final u6.e G = new u6.e(new i(5));
    public final int O = 100;
    public final y7.t P = new y7.t();
    public final Handler Q = new Handler(Looper.getMainLooper());
    public final ArrayList S = new ArrayList();
    public String U = "";
    public String W = "";
    public String X = "";
    public final androidx.lifecycle.x Z = new androidx.lifecycle.x(6, this);

    static {
        Protect.classesInit0(93);
        f0short = new short[]{1765, 1767, 1782, 1429, 1428, 1423, 1426, 1437, 1426, 1432, 1434, 1423, 1426, 1428, 1429, 1349, 1374, 1351, 1351, 1291, 1352, 1354, 1349, 1349, 1348, 1375, 1291, 1353, 1358, 1291, 1352, 1354, 1368, 1375, 1291, 1375, 1348, 1291, 1349, 1348, 1349, 1286, 1349, 1374, 1351, 1351, 1291, 1375, 1362, 1371, 1358, 1291, 1354, 1349, 1359, 1369, 1348, 1346, 1359, 1285, 1354, 1371, 1371, 1285, 1381, 1348, 1375, 1346, 1357, 1346, 1352, 1354, 1375, 1346, 1348, 1349, 1382, 1354, 1349, 1354, 1356, 1358, 1369, 2018, 2025, 2016, 2037, 2014, 2028, 2020, 2031, 2037, 2024, 2030, 2031, 2014, 2018, 2025, 2016, 2031, 2031, 2020, 2029, 2535, 2534, 2557, 2528, 2543, 2518, 2528, 2541, 431, 436, 432, 446, 437, 638, 613, 609, 623, 612, 597, 613, 632, 597, 615, 619, 611, 614, 2788, 2793, 2811, 2812, 2775, 2785, 2796, 849, 846, 850, 853, 1990, 1993, 1987, 2005, 1992, 1998, 1987, 1929, 2004, 2007, 1986, 1986, 1988, 1999, 1929, 1986, 2015, 2003, 2005, 1990, 1929, 2037, 2018, 2036, 2034, 2027, 2035, 2036, 2905, 2888, 2929, 2905, 2895, 2895, 2909, 2907, 2905, 576, 1388, 1379, 1380, 1390, 1372, 1379, 1391, 1405, 1352, 1395, 1347, 1390, 1314, 1316, 1316, 1316, 1315, 2182, 2176, 2198, 2177, 2220, 2179, 2177, 2198, 2197, 2176, 1895, 1916, 1912, 1910, 1917, 1727, 1704, 1710, 1716, 1710, 1697, 1704, 1727, 1678, 1701, 1708, 1721, 2957, 2971, 2945, 3004, 2951, 2958, 2973, 2954, 2979, 2944, 2956, 472, 462, 468, 503, 467, 473, 577, 599, 589, 624, 582, 589, 583, 899, 917, 911, 931, 896, 898, 906, 262, 269, 260, 273, 292, 257, 260, 277, 273, 256, 279, 1429, 1428, 1423, 1426, 1437, 1426, 1432, 1434, 1423, 1426, 1428, 1429, 1460, 1455, 1462, 1462, 1530, 1465, 1467, 1460, 1460, 1461, 1454, 1530, 1464, 1471, 1530, 1465, 1467, 1449, 1454, 1530, 1454, 1461, 1530, 1460, 1461, 1460, 1527, 1460, 1455, 1462, 1462, 1530, 1454, 1443, 1450, 1471, 1530, 1467, 1460, 1470, 1448, 1461, 1459, 1470, 1524, 1467, 1450, 1450, 1524, 1428, 1461, 1454, 1459, 1468, 1459, 1465, 1467, 1454, 1459, 1461, 1460, 1431, 1467, 1460, 1467, 1469, 1471, 1448, 1940, 1923, 1934, 1943, 1927, 2422, 2413, 2409, 2407, 2412, 2397, 2413, 2416, 2397, 2415, 2403, 2411, 2414, 2336, 2338, 2343, 2362, 2363, 2364, 2365, 2366, 2368, 2395, 2397, 2398, 2400, 2427, 2429, 2428, 2351, 2396, 2367, 2339, 2342, 2337, 2340, 2344, 2345, 2348, 2430, 2581, 2583, 2578, 2575, 2574, 2569, 2568, 2571, 2677, 2670, 2664, 2667, 2645, 2638, 2632, 2633, 2586, 2665, 2570, 2582, 2579, 2580, 2577, 2589, 2588, 2585, 2635, 2895, 2896, 2892, 2891, 1433, 1435, 1414, 1422, 1435, 1420, 1434, 1434, 1445, 1414, 1416, 1421, 1408, 1415, 1422, 837, 846, 853, 774, 844, 832, 837, 846, 853, 774, 1728, 1755, 1759, 1745, 1754, 1771, 1755, 1734, 1771, 1753, 1749, 1757, 1752, 1095, 1103, 1113, 1113, 1099, 1101, 1103, 1152, 1155, 1167, 1165, 1176, 1157, 1155, 1154, 1203, 1152, 1165, 1166, 1161, 1152, 1976, 1959, 1979, 1980, 1633, 1648, 1609, 1633, 1655, 1655, 1637, 1635, 1633, 736, 738, 767, 759, 738, 757, 739, 739, 732, 767, 753, 756, 761, 766, 759};
    }

    public ChatActivity() {
        if (new Date().after(new Date(1796922003735L ^ 5015))) {
            System.exit(0);
        }
    }

    public static final native void s(ChatActivity chatActivity);

    public static final native void t(ChatActivity chatActivity, String str, String str2);

    public static final native void u(ChatActivity chatActivity, int i);

    @Override // h.k, c.p, android.app.Activity
    public final native void onActivityResult(int i, int i5, Intent intent);

    @Override // h.k, c.p, f0.i, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // h.k, android.app.Activity
    public final native void onDestroy();

    @Override // h.k, android.app.Activity
    public final native void onPause();

    @Override // h.k, android.app.Activity
    public final native void onResume();

    public final native void v();

    public final native String w(double d9, double d10);

    public final native void x(String str, String str2);

    public final native void y();
}
