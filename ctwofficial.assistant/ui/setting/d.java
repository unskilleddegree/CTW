package com.ctwofficial.assistant.ui.setting;

import com.google.android.gms.maps.model.LatLng;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a7.h implements g7.p {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f88short;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2594h;
    public final /* synthetic */ BlockZoneMapActivity i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ LatLng f2595j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2596k;

    static {
        Protect.classesInit0(85);
        f88short = new short[]{2599, 2597, 2600, 2600, 2660, 2608, 2603, 2660, 2659, 2614, 2593, 2615, 2609, 2601, 2593, 2659, 2660, 2598, 2593, 2594, 2603, 2614, 2593, 2660, 2659, 2605, 2602, 2610, 2603, 2607, 2593, 2659, 2660, 2611, 2605, 2608, 2604, 2660, 2599, 2603, 2614, 2603, 2609, 2608, 2605, 2602, 2593, 646, 657, 658, 737, 667, 686, 687, 676, 737, 642, 681, 676, 674, 682, 1912, 1908, 2672, 2678, 2657, 2672, 2679, 2673, 2666, 2669, 2660, 2603, 2605, 2605, 2605, 2602, 2273, 2273, 2273};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i, BlockZoneMapActivity blockZoneMapActivity, LatLng latLng, y6.d dVar) {
        super(2, dVar);
        this.i = blockZoneMapActivity;
        this.f2595j = latLng;
        this.f2596k = i;
        if (new Date().after(new Date(1796922003062L ^ 3318))) {
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
