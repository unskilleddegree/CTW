package com.ctwofficial.assistant.proteksi;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class o extends a7.h implements g7.p {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f55short;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f2489h;
    public final /* synthetic */ boolean i;

    static {
        Protect.classesInit0(139);
        f55short = new short[]{493, 486, 481, 491, 486, 481, 488};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(LoginActivity loginActivity, boolean z8, y6.d dVar) {
        super(2, dVar);
        this.f2489h = loginActivity;
        this.i = z8;
        if (new Date().after(new Date(1796922000147L ^ 403))) {
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
