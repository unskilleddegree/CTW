package com.ctwofficial.assistant;

import android.widget.TextView;
import com.ctwofficial.assistant.ui.setting.SharedSettingsActivity;
import com.google.android.material.button.MaterialButton;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r0 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f69short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2552d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TextView f2553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextView f2554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f2555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2556h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2557j;

    static {
        Protect.classesInit0(4);
        f69short = new short[]{2733, 2745, 2744, 2723, 2734, 2725, 2728, 2707, 2730, 2729, 2733, 2744, 2745, 2750, 2729, 2751, 1887, 1874, 1249, 1270, 1275, 1250, 1266, 1779, 1777, 1780, 1769, 1768, 1775, 1774, 1773, 1683, 1672, 1678, 1677, 1715, 1704, 1710, 1711, 1788, 1679, 1772, 1776, 1781, 1778, 1783, 1787, 1786, 1791, 1709, 1978, 1976, 1981, 1952, 1953, 1958, 1959, 1956, 2010, 1985, 1991, 1988, 2042, 2017, 2023, 2022, 1973, 1990, 1957, 1977, 1980, 1979, 1982, 1970, 1971, 1974, 2020, 1083, 1060, 1080, 1087, 2336, 2356, 2345, 2347, 2316, 2357, 2345, 2344, 2414, 2408, 2408, 2408, 2415, 1267, 1271, 1264, 1217, 1262, 1260, 1271, 1277, 1275, 2885, 2889, 2896, 2935, 2904, 2906, 2881, 2891, 2893, 2908, 2896, 2889, 2926, 2901, 2904, 2882, 2885, 2896, 2911, 2898, 2900, 2368, 2369, 2376, 2373, 2397, 2427, 2390, 2369, 2370, 2390, 2369, 2391, 2380, 585, 589, 586, 589, 585, 581, 584, 635, 598, 581, 592, 589, 586, 579, 3159, 3148, 3144, 3142, 3149, 547, 556, 549, 549, 557, 566, 547, 541, 562, 547, 561, 561, 1290, 1285, 1292, 1292, 1284, 1311, 1290, 1332, 1286, 1290, 1282, 1287, 1986, 2009, 1984, 1984, 418, 416, 433, 551, 598, 636, 636, 636, 636, 543, 563, 560, 560, 569, 575, 552, 565, 563, 562, 559, 626, 553, 562, 561, 563, 568, 565, 8826, 628, 528, 565, 562, 567, 569, 568, 532, 573, 559, 564, 529, 573, 556, 628, 552, 564, 565, 559, 629, 629, 598, 636, 636, 545, 3021, 3062, 3071, 3052, 3067, 3066, 3021, 3057, 3051, 3056, 3066, 3053, 2381, 2395, 2397, 2394, 2369, 2371, 2417, 2397, 2369, 2395, 2368, 2378, 2417, 2395, 2396, 2375, 2277, 2291, 2293, 2290, 2281, 2283, 2265, 2293, 2281, 2291, 2280, 2274, 2265, 2280, 2279, 2283, 2275, 1275, 1216, 1225, 1242, 1229, 1228, 1170, 1160, 1189, 1188, 1215, 1186, 1197, 1186, 1192, 1194, 1215, 1186, 1188, 1189, 1172, 1208, 1188, 1214, 1189, 1199, 1172, 1188, 1209, 1199, 1198, 1209, 2654, 2648, 2638, 2638, 2632, 2654, 2654, 363, 380, 267, 265, 270, 381, 376, 3116, 3108, 3122, 3122, 3104, 3110, 3108};
    }

    public /* synthetic */ r0(SharedSettingsActivity sharedSettingsActivity, com.ctwofficial.assistant.ui.setting.g0 g0Var, TextView textView, TextView textView2, MaterialButton materialButton, h.h hVar) {
        this.f2556h = sharedSettingsActivity;
        this.i = g0Var;
        this.f2553e = textView;
        this.f2554f = textView2;
        this.f2555g = materialButton;
        this.f2557j = hVar;
        if (new Date().after(new Date(1796922002015L ^ 2271))) {
            System.exit(0);
        }
    }

    public /* synthetic */ r0(y7.x xVar, String str, TextView textView, MainActivity mainActivity, TextView textView2, MaterialButton materialButton) {
        this.f2556h = xVar;
        this.i = str;
        this.f2553e = textView;
        this.f2557j = mainActivity;
        this.f2554f = textView2;
        this.f2555g = materialButton;
        if (new Date().after(new Date(1796922008660L ^ 9940))) {
            System.exit(0);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
