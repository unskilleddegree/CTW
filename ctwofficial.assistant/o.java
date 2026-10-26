package com.ctwofficial.assistant;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f34short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ChatActivity f2409e;

    static {
        Protect.classesInit0(180);
        f34short = new short[]{3021, 3023, 3026, 3034, 3023, 3032, 3022, 3022, 3057, 3026, 3036, 3033, 3028, 3027, 3034};
    }

    public /* synthetic */ o(ChatActivity chatActivity, int i) {
        this.f2408d = i;
        this.f2409e = chatActivity;
        if (new Date().after(new Date(1796922006887L ^ 8167))) {
            System.exit(0);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
