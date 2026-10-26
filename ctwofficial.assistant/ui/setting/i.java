package com.ctwofficial.assistant.ui.setting;

import android.view.View;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f94short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f2637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h.k f2639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.s f2640h;

    static {
        Protect.classesInit0(79);
        f94short = new short[]{497, 499, 484, 505, 511, 510, 495, 482, 501, 508, 511, 497, 500, 495, 483, 501, 484, 484, 505, 510, 503, 483, 2182, 1516, 942, 1504, 1319, 1334, 1328, 1335, 1334, 1319, 1336, 1325, 1324, 1319, 436, 421, 435, 445, 446, 434, 442, 427, 446, 447, 436};
    }

    public /* synthetic */ i(h.k kVar, String str, androidx.recyclerview.widget.s sVar, int i, int i5) {
        this.f2636d = i5;
        this.f2639g = kVar;
        this.f2637e = str;
        this.f2640h = sVar;
        this.f2638f = i;
        if (new Date().after(new Date(1796922004156L ^ 4156))) {
            System.exit(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
