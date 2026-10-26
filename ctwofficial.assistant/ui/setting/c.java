package com.ctwofficial.assistant.ui.setting;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a7.h implements g7.p {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f86short;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ BlockZoneMapActivity f2588h;
    public final /* synthetic */ LatLng i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h7.m f2590k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2591l;

    static {
        Protect.classesInit0(86);
        f86short = new short[]{1720, 1717, 1711, 1708, 1712, 1725, 1701, 1680, 1725, 1726, 1721, 1712, 2371, 2392, 2404, 2371, 2373, 2398, 2393, 2384, 2335, 2329, 2329, 2329, 2334, 850, 860, 863, 851, 859, 879, 842, 863, 862, 853, 835, 879, 858, 835, 863, 862, 3265, 3280, 3270, 3272, 3275, 3271, 3279, 3294, 3275, 3274, 3265, 3007, 1216, 2251, 2284, 2239, 2233, 2237, 2216, 2238, 2251, 2282, 946, 894, 857, 846, 852, 861, 847, 853, 848, 797, 796, 1672, 1746, 1735, 1734, 1737, 1672, 1756, 1741, 1754, 1755, 1729, 1733, 1752, 1737, 1734, 1672, 1664, 1774, 1735, 1754, 1733, 1737, 1756, 1672, 1790, 1737, 1732, 1729, 1740, 1665, 1670, 1920, 1922, 1941, 1928, 1934, 1935, 1950, 1939, 1924, 1933, 1934, 1920, 1925, 1950, 1938, 1924, 1941, 1941, 1928, 1935, 1926, 1938};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BlockZoneMapActivity blockZoneMapActivity, LatLng latLng, int i, h7.m mVar, ArrayList arrayList, y6.d dVar) {
        super(2, dVar);
        this.f2588h = blockZoneMapActivity;
        this.i = latLng;
        this.f2589j = i;
        this.f2590k = mVar;
        this.f2591l = arrayList;
        if (new Date().after(new Date(1796922008602L ^ 9882))) {
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
