package com.ctwofficial.assistant.ui.setting;

import android.os.Bundle;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class BlockedListActivity extends h.k {
    public static final /* synthetic */ int F = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f76short;
    public RecyclerView B;
    public TextView C;
    public l D;
    public final ArrayList E = new ArrayList();

    static {
        Protect.classesInit0(191);
        f76short = new short[]{816, 831, 824, 818, 768, 831, 819, 801, 788, 815, 799, 818, 894, 888, 888, 888, 895, 2887, 2883, 2937, 2908, 2886, 2881, 1348, 1365, 1347, 1357, 1358, 1346, 1354, 1371, 1358, 1359, 1348, 1934, 2775, 3021, 1599, 3115, 3130, 3116, 3106, 3105, 3117, 3109, 3124, 3105, 3104, 3115, 2249, 2251, 2281, 2258, 2249, 2268, 2257, 2517, 2512, 2517, 2500, 2496, 2513, 2502};
    }

    public BlockedListActivity() {
        if (new Date().after(new Date(1796922008642L ^ 9922))) {
            System.exit(0);
        }
    }

    @Override // h.k, c.p, f0.i, android.app.Activity
    public final native void onCreate(Bundle bundle);

    public final native void s();

    public final native void t();
}
