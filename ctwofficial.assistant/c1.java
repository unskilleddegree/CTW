package com.ctwofficial.assistant;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class c1 extends a7.h implements g7.p {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f17short;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2276h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SplashActivity f2277j;

    static {
        Protect.classesInit0(166);
        f17short = new short[]{1978, 1976, 1973, 1973, 2041, 1965, 1974, 2041, 2046, 1963, 1980, 1962, 1964, 1972, 1980, 2046, 2041, 1979, 1980, 1983, 1974, 1963, 1980, 2041, 2046, 1968, 1975, 1967, 1974, 1970, 1980, 2046, 2041, 1966, 1968, 1965, 1969, 2041, 1978, 1974, 1963, 1974, 1964, 1965, 1968, 1975, 1980, 504, 499, 500, 510, 499, 500, 509, 1883, 1881, 1876, 1876, 1816, 1868, 1879, 1816, 1823, 1866, 1885, 1867, 1869, 1877, 1885, 1823, 1816, 1882, 1885, 1886, 1879, 1866, 1885, 1816, 1823, 1873, 1878, 1870, 1879, 1875, 1885, 1823, 1816, 1871, 1873, 1868, 1872, 1816, 1883, 1879, 1866, 1879, 1869, 1868, 1873, 1878, 1885, 2537, 2530, 2533, 2543, 2530, 2533, 2540, 589, 591, 578, 578, 526, 602, 577, 526, 521, 604, 587, 605, 603, 579, 587, 521, 526, 588, 587, 584, 577, 604, 587, 526, 521, 583, 576, 600, 577, 581, 587, 521, 526, 601, 583, 602, 582, 526, 589, 577, 604, 577, 603, 602, 583, 576, 587, 543, 532, 531, 537, 532, 531, 538};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(SplashActivity splashActivity, y6.d dVar, int i) {
        super(2, dVar);
        this.f2276h = i;
        this.f2277j = splashActivity;
        if (new Date().after(new Date(1796922002452L ^ 3732))) {
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
