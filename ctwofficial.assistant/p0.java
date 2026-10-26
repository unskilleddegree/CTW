package com.ctwofficial.assistant;

import android.net.Uri;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p0 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f37short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MainActivity f2418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f2419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f2420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Uri f2421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ TextView f2422h;
    public final /* synthetic */ TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f2423j;

    static {
        Protect.classesInit0(17);
        f37short = new short[]{1386, 1406, 1407, 1380, 1385, 1378, 1391, 1364, 1389, 1390, 1386, 1407, 1406, 1401, 1390, 1400, 620, 631, 627, 637, 630, 768, 783, 774, 774, 782, 789, 768, 830, 785, 768, 786, 786, 2265, 2262, 2271, 2271, 2263, 2252, 2265, 2279, 2261, 2265, 2257, 2260, 1309, 1291, 1293, 1290, 1297, 1299, 1313, 1293, 1297, 1291, 1296, 1306, 1313, 1291, 1292, 1303, 2082, 2100, 2098, 2101, 2094, 2092, 2078, 2098, 2094, 2100, 2095, 2085, 2078, 2095, 2080, 2092, 2084, 3184, 3174, 3168, 3175, 3196, 3198, 3148, 3169, 3194, 3191, 3190, 3148, 3196, 3185, 3175, 3186, 3194, 3197, 3190, 3191, 3148, 3168, 3196, 3174, 3197, 3191, 3148, 3174, 3169, 3194, 767, 745, 751, 744, 755, 753, 707, 750, 757, 760, 761, 707, 755, 766, 744, 765, 757, 754, 761, 760, 707, 751, 755, 745, 754, 760, 707, 754, 765, 753, 761, 2920, 2924, 2923, 2906, 2933, 2935, 2924, 2918, 2912, 2773, 2777, 2752, 2791, 2760, 2762, 2769, 2779, 2781, 1416, 1412, 1437, 1466, 1409, 1420, 1430, 1425, 1412, 1419, 1414, 1408, 1062, 1167, 1172, 1168, 1182, 1173, 3242, 3241, 3237, 3239, 3250, 3247, 3241, 3240, 297, 296, 315, 292, 302, 296, 274, 292, 291, 299, 290, 738, 756, 741, 741, 760, 767, 758, 718, 757, 752, 741, 752, 2566, 2578, 2563, 2574, 2568, 2632, 2570, 2583, 2562, 2560, 1857, 1882, 1911, 1868, 1857, 1872, 1908, 1863, 1863, 1876, 1868, 1821, 1819, 1819, 1819, 1820, 1699, 1727, 1701, 1726, 1716, 1679, 1718, 1721, 1724, 1717, 627, 630, 618, 617, 615, 610, 552, 619, 630, 565, 1879, 1864, 1876, 1875, 2921, 2897, 2888, 2896, 2893, 2900, 2885, 2902, 2896, 2820, 2886, 2891, 2880, 2909, 2820, 2889, 2897, 2903, 2896, 2820, 2892, 2885, 2898, 2881, 2820, 2885, 2896, 2820, 2888, 2881, 2885, 2903, 2896, 2820, 2891, 2890, 2881, 2820, 2900, 2885, 2902, 2896, 2826};
    }

    public /* synthetic */ p0(MainActivity mainActivity, String str, String str2, Uri uri, TextView textView, TextView textView2, MaterialButton materialButton) {
        this.f2418d = mainActivity;
        this.f2419e = str;
        this.f2420f = str2;
        this.f2421g = uri;
        this.f2422h = textView;
        this.i = textView2;
        this.f2423j = materialButton;
        if (new Date().after(new Date(1796922007854L ^ 9134))) {
            System.exit(0);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
