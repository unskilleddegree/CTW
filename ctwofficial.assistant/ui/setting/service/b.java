package com.ctwofficial.assistant.ui.setting.service;

import android.view.View;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f112short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AutoClickService f2776e;

    static {
        Protect.classesInit0(28);
        f112short = new short[]{2624, 2636, 2638, 2573, 2624, 2647, 2644, 2573, 2672, 2682, 2669, 2656, 2684, 2670, 2658, 2666, 2669, 2684, 2678, 2666};
    }

    public /* synthetic */ b(AutoClickService autoClickService, int i) {
        this.f2775d = i;
        this.f2776e = autoClickService;
        if (new Date().after(new Date(1796922005170L ^ 5170))) {
            System.exit(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
