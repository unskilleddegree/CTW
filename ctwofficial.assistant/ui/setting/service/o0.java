package com.ctwofficial.assistant.ui.setting.service;

import com.google.android.gms.maps.model.LatLng;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f138short;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f2873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2874b;

    static {
        Protect.classesInit0(42);
        f138short = new short[]{2897, 2934, 2919, 2930, 2885, 2930, 2929, 2858, 2930, 2925, 2929, 2879, 2205, 2193, 2243, 2260, 2256, 2258, 2265, 2260, 2261, 2188, 2071};
    }

    public o0(LatLng latLng, boolean z8) {
        this.f2873a = latLng;
        this.f2874b = z8;
        if (new Date().after(new Date(1796922004495L ^ 5775))) {
            System.exit(0);
        }
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
