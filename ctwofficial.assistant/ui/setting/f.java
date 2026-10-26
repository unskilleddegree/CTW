package com.ctwofficial.assistant.ui.setting;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class f extends a7.h implements g7.p {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f90short;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2602h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2603j;

    static {
        Protect.classesInit0(82);
        f90short = new short[]{2768, 2770, 2783, 2783, 2707, 2759, 2780, 2707, 2708, 2753, 2774, 2752, 2758, 2782, 2774, 2708, 2707, 2769, 2774, 2773, 2780, 2753, 2774, 2707, 2708, 2778, 2781, 2757, 2780, 2776, 2774, 2708, 2707, 2756, 2778, 2759, 2779, 2707, 2768, 2780, 2753, 2780, 2758, 2759, 2778, 2781, 2774, 2672, 2683, 2684, 2678, 2683, 2684, 2677};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BlockZoneMapActivity blockZoneMapActivity, int i, y6.d dVar) {
        super(2, dVar);
        this.f2602h = 0;
        this.f2603j = blockZoneMapActivity;
        this.i = i;
        if (new Date().after(new Date(1796922003003L ^ 3259))) {
            System.exit(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, y6.d dVar, int i) {
        super(2, dVar);
        this.f2602h = i;
        this.f2603j = obj;
        if (new Date().after(new Date(1796922005679L ^ 6703))) {
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
