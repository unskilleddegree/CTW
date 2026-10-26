package com.ctwofficial.assistant.proteksi;

import android.view.View;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f54short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f2485e;

    static {
        Protect.classesInit0(123);
        f54short = new short[]{964, 975, 968, 962, 975, 968, 961, 1394, 1392, 1377, 1350, 1377, 1383, 1404, 1403, 1394, 1341, 1339, 1339, 1339, 1340, 2615, 2577, 2567, 2576, 2639, 2595, 2565, 2567, 2572, 2582, 2699, 2745, 2745, 2723, 2745, 2750, 2735, 2724, 2697, 2718, 2717, 2791, 2699, 2746, 2746, 2789, 2811, 2788, 2810, 1540, 1574, 1574, 1568, 1589, 1585, 878, 895, 895, 867, 870, 876, 878, 891, 870, 864, 865, 800, 869, 892, 864, 865, 3326, 3327, 3308, 3315, 3321, 3327, 3269, 3315, 3326, 2289, 2272, 2276, 2280, 2266, 2284, 2273, 2231, 2220, 2192, 2231, 2225, 2218, 2221, 2212, 2283, 2285, 2285, 2285, 2282, 2494, 2479, 2479, 2483, 2486, 2492, 2494, 2475, 2486, 2480, 2481, 2544, 2485, 2476, 2480, 2481, 2532, 2559, 2492, 2487, 2494, 2477, 2476, 2490, 2475, 2530, 2474, 2475, 2489, 2546, 2535, 2803, 2796, 2800, 2807, 2331, 2333, 2314, 2331, 2332, 2330, 2305, 2310, 2319, 2368, 2374, 2374, 2374, 2369, 2756, 2755, 2761, 2754};
    }

    public /* synthetic */ m(LoginActivity loginActivity, int i) {
        this.f2484d = i;
        this.f2485e = loginActivity;
        if (new Date().after(new Date(1796922003334L ^ 3334))) {
            System.exit(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
