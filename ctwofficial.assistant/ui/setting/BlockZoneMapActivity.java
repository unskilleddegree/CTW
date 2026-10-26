package com.ctwofficial.assistant.ui.setting;

import android.location.Geocoder;
import android.os.Bundle;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class BlockZoneMapActivity extends h.k implements o4.e, o4.a, o4.b, o4.c {
    public static final /* synthetic */ int L = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f75short;
    public com.ctwofficial.assistant.databinding.a B;
    public q2.e C;
    public k4.a E;
    public Geocoder F;
    public q4.d G;
    public q4.b H;
    public LatLng K;
    public i0.c D = i0.c.f4633e;
    public final ArrayList I = new ArrayList();
    public int J = 900;

    static {
        Protect.classesInit0(21);
        f75short = new short[]{2210, 2217, 2222, 2212, 2217, 2222, 2215, 565, 558, 567, 567, 635, 568, 570, 565, 565, 564, 559, 635, 569, 574, 635, 568, 570, 552, 559, 635, 559, 564, 635, 565, 564, 565, 630, 565, 558, 567, 567, 635, 559, 546, 555, 574, 635, 570, 565, 575, 553, 564, 562, 575, 629, 557, 562, 574, 556, 629, 525, 562, 574, 556, 540, 553, 564, 558, 555, 629, 534, 570, 553, 572, 562, 565, 535, 570, 546, 564, 558, 559, 523, 570, 553, 570, 566, 552, 2192, 2194, 2179, 2234, 2198, 2183, 2230, 2180, 2190, 2201, 2196, 2263, 2202, 2178, 2180, 2179, 2263, 2197, 2194, 2263, 2196, 2198, 2203, 2203, 2194, 2195, 2263, 2200, 2201, 2263, 2179, 2207, 2194, 2263, 2202, 2198, 2206, 2201, 2263, 2179, 2207, 2181, 2194, 2198, 2195, 2265, 1552, 1588, 1582, 1582, 1588, 1587, 1594, 1661, 1583, 1592, 1580, 1576, 1588, 1583, 1592, 1593, 1661, 1579, 1588, 1592, 1578, 1661, 1578, 1588, 1577, 1589, 1661, 1556, 1561, 1639, 1661, 798, 779, 796, 771, 775, 797, 797, 775, 769, 768, 797, 485, 496, 483, 492, 502, 464, 487, 497, 503, 494, 502, 497, 2007, 2005, 1988, 2019, 1988, 1986, 2009, 2014, 2007, 1944, 1950, 1950, 1950, 1945, 2399, 2429, 2417, 2425, 2414, 2429, 2377, 2412, 2424, 2429, 2408, 2425, 2394, 2429, 2431, 2408, 2419, 2414, 2405, 2364, 2421, 2415, 2364, 2418, 2419, 2408, 2364, 2421, 2418, 2421, 2408, 2421, 2429, 2416, 2421, 2406, 2425, 2424, 2052, 2063, 2056, 2050, 2063, 2056, 2049, 2586, 2569, 2575, 2585, 2584, 2608, 2579, 2591, 2589, 2568, 2581, 2579, 2578, 2623, 2576, 2581, 2585, 2578, 2568};
    }

    public BlockZoneMapActivity() {
        if (new Date().after(new Date(1796922004979L ^ 6003))) {
            System.exit(0);
        }
    }

    @Override // h.k, c.p, f0.i, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // h.k, c.p, android.app.Activity
    public final native void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);

    public final native void s(LatLng latLng);

    public final native void t();

    public final native void u(LatLng latLng);

    public final native void v(boolean z8);

    public final native void w();

    public final native void x();
}
