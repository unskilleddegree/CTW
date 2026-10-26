package com.ctwofficial.assistant;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ctwofficial.assistant.ui.setting.writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class m extends androidx.recyclerview.widget.s {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f31short;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f2387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f2388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f2389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ChatActivity f2390f;

    static {
        Protect.classesInit0(183);
        f31short = new short[]{2309, 2318, 2311, 2322, 2325, 2008, 882, 884, 895, 869, 884, 867, 2663, 2674, 2674, 2672, 3085, 3081, 1142, 1132, 1151, 1120, 1296, 1302, 1302, 1374, 1301, 1302, 1302, 1259, 1255, 1270, 1266, 1279, 1270, 1251, 3097, 3076, 3082, 3087, 3078, 3082, 3099, 1303, 1307, 1304, 1307, 1286, 1358, 1286, 1297, 1296, 1288, 1867, 1863, 1876, 1869, 1859, 1876, 1877, 1657, 1655, 1643, 2105, 2102, 2108, 2090, 2103, 2097, 2108, 2166, 2097, 2102, 2092, 2109, 2102, 2092, 2166, 2105, 2107, 2092, 2097, 2103, 2102, 2166, 2062, 2065, 2077, 2063, 2328, 2891, 2821, 2889, 378, 286, 317, 313, 307, 289, 315, 379, 470, 474, 472, 411, 466, 474, 474, 466, 473, 464, 411, 468, 475, 465, 455, 474, 476, 465, 411, 468, 453, 453, 454, 411, 472, 468, 453, 454, 2107, 2090, 2099, 2654, 1161, 1165, 1181, 1162, 1153, 860, 858, 845, 860, 859, 861, 838, 833, 840, 775, 769, 769, 769, 774, 2803, 2801, 2784, 2775, 2811, 2810, 2784, 2801, 2796, 2784, 2748, 2746, 2746, 2746, 2749, 1042, 1040, 1025, 1076, 1029, 1029, 1049, 1052, 1046, 1044, 1025, 1052, 1050, 1051, 1084, 1051, 1043, 1050, 1117, 1115, 1115, 1115, 1116, 1774, 1762, 1760, 1699, 1770, 1762, 1762, 1770, 1761, 1768, 1699, 1772, 1763, 1769, 1791, 1762, 1764, 1769, 1699, 1770, 1768, 1762, 1699, 1740, 1757, 1732, 1746, 1734, 1736, 1748, 2997, 2999, 2982, 2945, 2982, 2976, 3003, 3004, 2997, 3066, 3068, 3068, 3068, 3067, 2769, 2781, 2764, 2767, 2706, 2779, 2771, 2771, 2779, 2768, 2777, 2706, 2783, 2771, 2769, 2707, 2784, 2691, 2765, 2689, 2708, 2791, 2705, 2700, 2705, 2693, 2706, 2785, 2711, 2709, 2704, 2708, 2791, 2705, 2700, 2705, 2693, 2706, 2785, 2711, 2709, 1886, 1874, 1872, 1869, 1876, 1873, 1880, 1813, 1811, 1811, 1811, 1812, 3311, 3299, 3318, 3297, 3306, 3303, 3312, 3242, 3244, 3244, 3244, 3243, 2341, 2323, 2313, 2396, 2335, 2333, 2322, 2322, 2323, 2312, 2396, 2319, 2312, 2333, 2318, 2312, 2396, 2333, 2396, 2320, 2323, 2333, 2328, 2396, 2323, 2322, 2396, 2333, 2396, 2322, 2323, 2312, 2396, 2309, 2329, 2312, 2396, 2333, 2312, 2312, 2333, 2335, 2324, 2329, 2328, 2396, 2346, 2325, 2329, 2315, 2396, 2323, 2318, 2396, 2333, 2396, 2362, 2318, 2333, 2331, 2321, 2329, 2322, 2312, 2396, 2315, 2324, 2329, 2318, 2329, 2396, 2331, 2329, 2312, 2365, 2335, 2312, 2325, 2314, 2325, 2312, 2309, 2388, 2389, 2396, 2318, 2329, 2312, 2313, 2318, 2322, 2319, 2396, 2322, 2313, 2320, 2320, 2396, 2388, 2315, 2324, 2325, 2335, 2324, 2396, 2313, 2319, 2313, 2333, 2320, 2320, 2309, 2396, 2323, 2335, 2335, 2313, 2318, 2319, 2396, 2315, 2324, 2329, 2322, 2396, 2331, 2329, 2312, 2365, 2335, 2312, 2325, 2314, 2325, 2312, 2309, 2388, 2389, 2396, 2325, 2319, 2396, 2335, 2333, 2320, 2320, 2329, 2328, 2396, 2334, 2329, 2330, 2323, 2318, 2329, 2396, 2312, 2324, 2329, 2396, 2362, 2318, 2333, 2331, 2321, 2329, 2322, 2312, 2396, 2325, 2319, 2396, 2333, 2312, 2312, 2333, 2335, 2324, 2329, 2328, 2396, 2323, 2318, 2396, 2333, 2330, 2312, 2329, 2318, 2396, 2312, 2324, 2329, 2396, 2362, 2318, 2333, 2331, 2321, 2329, 2322, 2312, 2396, 2325, 2319, 2396, 2328, 2329, 2319, 2312, 2318, 2323, 2309, 2329, 2328, 2389, 2386, 1329, 1334, 1333, 1341, 1340, 1323};
    }

    public m(ChatActivity chatActivity, ArrayList arrayList, c cVar, c cVar2) {
        h7.h.e(arrayList, writer.bridge(f31short, 0, 5, 2406));
        this.f2390f = chatActivity;
        this.f2387c = arrayList;
        this.f2388d = cVar;
        this.f2389e = cVar2;
        if (new Date().after(new Date(1796922004120L ^ 4120))) {
            System.exit(0);
        }
    }

    public static native String f(String str, String str2, String str3);

    public static native void g(Context context, String str, String str2);

    @Override // androidx.recyclerview.widget.s
    public final native int a();

    @Override // androidx.recyclerview.widget.s
    public final native void c(RecyclerView.a aVar, int i);

    @Override // androidx.recyclerview.widget.s
    public final native RecyclerView.a d(ViewGroup viewGroup);

    @Override // androidx.recyclerview.widget.s
    public final native void e(RecyclerView.a aVar);
}
