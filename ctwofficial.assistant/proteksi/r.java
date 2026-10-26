package com.ctwofficial.assistant.proteksi;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class r extends a7.h implements g7.p {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f58short;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2495h;
    public final /* synthetic */ Object i;

    static {
        Protect.classesInit0(140);
        f58short = new short[]{2664, 2666, 2683, 2652, 2683, 2685, 2662, 2657, 2664, 2599, 2593, 2593, 2593, 2598};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj, y6.d dVar, int i) {
        super(2, dVar);
        this.f2495h = i;
        this.i = obj;
        if (new Date().after(new Date(1796922009524L ^ 9524))) {
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
