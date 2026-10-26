package com.ctwofficial.assistant.Network;

import android.os.Bundle;
import h.k;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class RoutingActivity extends k {
    public static final /* synthetic */ int B = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f5short;

    static {
        Protect.classesInit0(114);
        f5short = new short[]{458, 453, 450, 456, 506, 453, 457, 475, 494, 469, 485, 456, 388, 386, 386, 386, 389};
    }

    public RoutingActivity() {
        if (new Date().after(new Date(1796922001613L ^ 2637))) {
            System.exit(0);
        }
    }

    @Override // h.k, c.p, f0.i, android.app.Activity
    public final native void onCreate(Bundle bundle);
}
