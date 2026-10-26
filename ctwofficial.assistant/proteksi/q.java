package com.ctwofficial.assistant.proteksi;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class q extends a7.h implements g7.p {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f57short;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f2493h;
    public final /* synthetic */ y7.x i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f2494j;

    static {
        Protect.classesInit0(141);
        f57short = new short[]{551, 544, 565, 544, 545, 551, 2543, 2537, 2559, 2559, 2553, 2543, 2543, 506, 511, 490, 511, 1207, 1215, 1193, 1193, 1211, 1213, 1215, 1168, 1170, 1155, 1188, 1155, 1157, 1182, 1177, 1168, 1247, 1241, 1241, 1241, 1246};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(LoginActivity loginActivity, y7.x xVar, String str, y6.d dVar) {
        super(2, dVar);
        this.f2493h = loginActivity;
        this.i = xVar;
        this.f2494j = str;
        if (new Date().after(new Date(1796922006226L ^ 6226))) {
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
