package com.ctwofficial.assistant.ui;

import android.view.View;
import java.util.Date;
import np.manager.Protect;
import r0.d2;
import r0.t;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements t {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f74short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f2571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2575h;

    static {
        Protect.classesInit0(14);
        f74short = new short[]{533, 522, 518, 532, 2377, 2379, 2394, 2407, 2368, 2397, 2379, 2394, 2397, 2310, 2304, 2304, 2304, 2311};
    }

    public /* synthetic */ a(boolean z8, int i, int i5, int i9, int i10) {
        this.f2571d = z8;
        this.f2572e = i;
        this.f2573f = i5;
        this.f2574g = i9;
        this.f2575h = i10;
        if (new Date().after(new Date(1796921999670L ^ 950))) {
            System.exit(0);
        }
    }

    @Override // r0.t
    public final native d2 f(View view, d2 d2Var);
}
