package com.ctwofficial.assistant;

import android.view.View;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f11short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ChatActivity f2258e;

    static {
        Protect.classesInit0(162);
        f11short = new short[]{1665, 1678, 1668, 1682, 1679, 1673, 1668, 1742, 1680, 1669, 1682, 1677, 1673, 1683, 1683, 1673, 1679, 1678, 1742, 1697, 1699, 1699, 1701, 1715, 1715, 1727, 1702, 1705, 1710, 1701, 1727, 1708, 1711, 1699, 1697, 1716, 1705, 1711, 1710, 1666, 1677, 1671, 1681, 1676, 1674, 1671, 1741, 1680, 1683, 1670, 1670, 1664, 1675, 1741, 1666, 1664, 1687, 1674, 1676, 1677, 1741, 1713, 1702, 1696, 1708, 1700, 1709, 1706, 1721, 1702, 1724, 1712, 1715, 1702, 1702, 1696, 1707, 2527, 2512, 2522, 2508, 2513, 2519, 2522, 2448, 2509, 2510, 2523, 2523, 2525, 2518, 2448, 2523, 2502, 2506, 2508, 2527, 2448, 2546, 2559, 2544, 2553, 2539, 2559, 2553, 2555, 2529, 2547, 2545, 2554, 2555, 2546, 3092, 3072, 3095, 3095, 3117, 3092, 3101, 3072, 3103, 2788, 2795, 2785, 2807, 2794, 2796, 2785, 2731, 2806, 2805, 2784, 2784, 2790, 2797, 2731, 2784, 2813, 2801, 2807, 2788, 2731, 2761, 2756, 2763, 2754, 2768, 2756, 2754, 2752, 2923, 2916, 2926, 2936, 2917, 2915, 2926, 2852, 2937, 2938, 2927, 2927, 2921, 2914, 2852, 2927, 2930, 2942, 2936, 2923, 2852, 2906, 2904, 2885, 2887, 2906, 2910, 1227, 1249, 1268, 1249, 1259, 1249, 1262, 1184, 1267, 1253, 1267, 1269, 1249, 1268, 1269, 1198, 1198, 1198, 1531, 1496, 1500, 1494, 1476, 1502, 1431, 1507, 1502, 1491, 1494, 1500, 1431, 1523, 1502, 1500, 1490, 1475, 1494, 1503, 1474, 1502, 1770, 1787, 1730, 1770, 1788, 1788, 1774, 1768, 1770};
    }

    public /* synthetic */ a(ChatActivity chatActivity, int i) {
        this.f2257d = i;
        this.f2258e = chatActivity;
        if (new Date().after(new Date(1796922004551L ^ 5831))) {
            System.exit(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
