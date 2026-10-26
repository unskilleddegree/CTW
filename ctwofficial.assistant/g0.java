package com.ctwofficial.assistant;

import android.widget.CompoundButton;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f26short;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f2359b;

    static {
        Protect.classesInit0(113);
        f26short = new short[]{2125, 2138, 2139, 2139, 2112, 2113, 2169, 2118, 2122, 2136, 2378, 2307, 2328, 2307, 2309, 2323, 2322, 2390, 2304, 2327, 2308, 2376, 2830, 2826, 2836, 2825, 2846, 2837, 2872, 2835, 2863, 2834, 2824, 2825, 2840, 2864, 2844, 2835, 2824, 2844, 2833, 1313, 1317, 1339, 1318, 1329, 1338, 1303, 1340, 1280, 1341, 1319, 1318, 1335, 1281, 1329, 1312, 1331, 1314, 1335, 739, 743, 761, 740, 755, 760, 722, 764, 767, 755, 763, 714, 767, 766, 757, 733, 753, 766, 741, 753, 764, 3185, 3189, 3179, 3190, 3169, 3178, 3136, 3182, 3181, 3169, 3177, 3160, 3181, 3180, 3175, 3153, 3169, 3184, 3171, 3186, 3175, 1386, 1390, 1392, 1389, 1402, 1393, 1368, 1388, 1389, 1398, 1403, 1392, 1405, 1368, 1397, 1397, 1353, 1387, 1392, 1402, 1404};
    }

    public /* synthetic */ g0(MainActivity mainActivity, int i) {
        this.f2358a = i;
        this.f2359b = mainActivity;
        if (new Date().after(new Date(1796922005948L ^ 6972))) {
            System.exit(0);
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final native void onCheckedChanged(CompoundButton compoundButton, boolean z8);
}
