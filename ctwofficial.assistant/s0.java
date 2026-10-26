package com.ctwofficial.assistant;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 implements g7.a {

    /* JADX INFO: renamed from: short */
    private static final short[] f70short;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2558d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ MainActivity f2559e;

    static {
        Protect.classesInit0(12);
        f70short = new short[]{3107, 3109, 3123, 3108, 3081, 3110, 3108, 3123, 3120, 3109};
    }

    public /* synthetic */ s0(MainActivity mainActivity) {
        i10 = i;
        this.f2559e = mainActivity;
        if (new Date().after(new Date(1796922004220L ^ 4220))) {
            System.exit(0);
        }
    }

    @Override // g7.a
    public final native Object a();
}
