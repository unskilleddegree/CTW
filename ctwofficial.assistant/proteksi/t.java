package com.ctwofficial.assistant.proteksi;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class t extends a7.h implements g7.p {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f60short;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2507h;
    public final /* synthetic */ LoginActivity i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f2508j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f2509k;

    static {
        Protect.classesInit0(142);
        f60short = new short[]{1178, 1176, 1161, 1198, 1161, 1167, 1172, 1171, 1178, 1237, 1235, 1235, 1235, 1236};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(LoginActivity loginActivity, boolean z8, String str, y6.d dVar, int i) {
        super(2, dVar);
        this.f2507h = i;
        this.i = loginActivity;
        this.f2508j = z8;
        this.f2509k = str;
        if (new Date().after(new Date(1796922006193L ^ 6193))) {
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
