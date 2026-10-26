package com.ctwofficial.assistant.proteksi;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class p extends a7.h implements g7.p {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f56short;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2490h;
    public y7.x i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f2492k;

    static {
        Protect.classesInit0(138);
        f56short = new short[]{451, 466, 466, 462, 459, 449, 451, 470, 459, 461, 460, 397, 456, 465, 461, 460, 663, 693, 693, 691, 678, 674, 2793, 2779, 2779, 2753, 2779, 2780, 2765, 2758, 2795, 2812, 2815, 2693, 2793, 2776, 2776, 2695, 2713, 2694, 2712, 854, 880, 870, 881, 814, 834, 868, 870, 877, 887, 570, 568, 565, 565, 633, 557, 566, 633, 638, 555, 572, 554, 556, 564, 572, 638, 633, 571, 572, 575, 566, 555, 572, 633, 638, 560, 567, 559, 566, 562, 572, 638, 633, 558, 560, 557, 561, 633, 570, 566, 555, 566, 556, 557, 560, 567, 572, 1810, 1854, 1855, 1829, 1844, 1855, 1829, 1916, 1797, 1832, 1825, 1844, 1283, 1676, 1674, 1681, 1689, 1684, 1703, 1693, 1686, 1689, 1690, 1684, 1693, 1692};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(LoginActivity loginActivity, y6.d dVar, int i) {
        super(2, dVar);
        this.f2490h = i;
        this.f2492k = loginActivity;
        if (new Date().after(new Date(1796922005758L ^ 6782))) {
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
