package com.ctwofficial.assistant.proteksi;

import android.content.Context;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y7.t f2441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExecutorService f2442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f2443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f2444d;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f46short;

    static {
        Protect.classesInit0(128);
        f46short = new short[]{1353, 1371, 1369, 1332, 1323, 1332, 1320, 623, 608, 617, 617, 609, 634, 623, 593, 611, 623, 615, 610, 2021, 2020, 2039, 2024, 2018, 2020, 2014, 2024, 2021, 1605, 1619, 1605, 1605, 1631, 1625, 1624, 1641, 1602, 1625, 1629, 1619, 1624, 1067, 1072, 1076, 1082, 1073, 1916, 1914, 1900, 1915, 1878, 1913, 1915, 1900, 1903, 1914, 1901, 1900, 1919, 1888, 1898, 1900, 1878, 1888, 1901, 1878, 1896, 1914, 1914, 1888, 1917, 1900, 1895, 1628, 1613, 1615, 1607, 1613, 1611, 1609, 1651, 1602, 1613, 1601, 1609, 528, 530, 515, 551, 534, 532, 540, 534, 528, 530, 569, 534, 538, 530, 607, 601, 601, 601, 606, 2447, 2460, 2443, 2442, 2448, 2454, 2455, 2470, 2455, 2456, 2452, 2460, 590, 605, 586, 587, 593, 599, 598, 615, 603, 599, 604, 605, 438, 1242, 1227, 1227, 1252, 1229, 1246, 1225, 1224, 1234, 1236, 1237, 2189, 2205, 2190, 2177, 2187, 3189, 3191, 3196, 3197, 3188, 1321, 1320, 1339, 1316, 1326, 1320, 1298, 1315, 1324, 1312, 1320, 421, 425, 422, 445, 430, 425, 427, 444, 445, 442, 429, 442, 2602, 2597, 2607, 2617, 2596, 2594, 2607, 2580, 2621, 2606, 2617, 2616, 2594, 2596, 2597, 1017, 1006, 993, 981, 995, 996, 1022, 2943, 2924, 2912, 2898, 2937, 2914, 2937, 2924, 2913, 2898, 2912, 2927, 716, 735, 723, 737, 735, 712, 735, 727, 722, 735, 732, 722, 731, 737, 723, 732, 947, 948, 943, 946, 929, 935, 933, 927, 948, 943, 948, 929, 940, 927, 941, 930, 1579, 1580, 1591, 1578, 1593, 1599, 1597, 1543, 1593, 1582, 1593, 1585, 1588, 1593, 1594, 1588, 1597, 1543, 1589, 1594, 3089, 3090, 3097, 420, 422, 433, 428, 435, 428, 433, 444, 410, 433, 444, 437, 416, 1590, 1588, 1571, 1598, 1569, 1598, 1571, 1582, 1544, 1571, 1598, 1571, 1595, 1586, 568, 570, 557, 560, 559, 560, 557, 544, 518, 573, 572, 557, 568, 560, 565, 1533, 1506, 1534, 1529, 2362, 2332, 2314, 2333, 2370, 2350, 2312, 2314, 2305, 2331, 1551, 1597, 1597, 1575, 1597, 1594, 1579, 1568, 1549, 1562, 1561, 1635, 1551, 1598, 1598, 1633, 1663, 1632, 1662, 2275, 2241, 2241, 2247, 2258, 2262, 1478, 1495, 1495, 1483, 1486, 1476, 1478, 1491, 1486, 1480, 1481, 1416, 1485, 1492, 1480, 1481, 1363, 1743, 1741, 1754, 1735, 1729, 1728, 2937, 2933, 2942, 2943, 1720, 1712, 1702, 1702, 1716, 1714, 1712, 2582, 2581, 2586, 2586, 2577, 2576, 901, 900, 919, 904, 898, 900, 926, 899, 896, 911, 911, 900, 901, 3087, 3102, 3081, 3094, 3090, 3093, 3098, 3087, 3102, 766, 751, 751, 736, 763, 758, 748, 766, 765, 755, 762, 763, 1108, 1095, 1104, 1105, 1099, 1101, 1100, 1117, 1094, 1099, 1105, 1091, 1088, 1102, 1095, 1094};
        y7.s sVar = new y7.s();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        sVar.a(15L);
        sVar.b(15L);
        sVar.c(15L);
        f2441a = new y7.t(sVar);
        f2442b = Executors.newSingleThreadExecutor();
        f2443c = new ConcurrentLinkedQueue();
        f2444d = new AtomicBoolean(false);
    }

    public static native void a(Context context);

    public static native boolean b(Context context, b bVar);
}
