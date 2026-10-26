package com.ctwofficial.assistant;

import android.view.View;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f27short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f2370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f2371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f2372g;

    static {
        Protect.classesInit0(167);
        f27short = new short[]{3174, 3172, 3189, 3138, 3182, 3183, 3189, 3172, 3193, 3189, 3113, 3119, 3119, 3119, 3112, 2274, 2272, 2289, 2246, 2282, 2283, 2289, 2272, 2301, 2289, 2221, 2219, 2219, 2219, 2220};
    }

    public /* synthetic */ k(m mVar, l lVar, String str, String str2, int i) {
        this.f2369d = i;
        this.f2370e = lVar;
        this.f2371f = str;
        this.f2372g = str2;
        if (new Date().after(new Date(1796922003425L ^ 3425))) {
            System.exit(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
