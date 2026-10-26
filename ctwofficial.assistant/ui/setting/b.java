package com.ctwofficial.assistant.ui.setting;

import android.view.View;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f84short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BlockZoneMapActivity f2584e;

    static {
        Protect.classesInit0(87);
        f84short = new short[]{2281, 2279, 2276, 2280, 2272, 2260, 2289, 2276, 2277, 2286, 2296, 2260, 2273, 2296, 2276, 2277, 481, 496, 486, 488, 491, 487, 495, 510, 491, 490, 481, 453, 455, 464, 461, 459, 458, 475, 470, 449, 456, 459, 453, 448, 475, 471, 449, 464, 464, 461, 458, 451, 471};
    }

    public /* synthetic */ b(BlockZoneMapActivity blockZoneMapActivity, int i) {
        this.f2583d = i;
        this.f2584e = blockZoneMapActivity;
        if (new Date().after(new Date(1796922004530L ^ 5810))) {
            System.exit(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
