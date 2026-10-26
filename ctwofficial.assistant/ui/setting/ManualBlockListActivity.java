package com.ctwofficial.assistant.ui.setting;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class ManualBlockListActivity extends h.k {
    public static final /* synthetic */ int H = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f78short;
    public RecyclerView B;
    public FloatingActionButton C;
    public View D;
    public r E;
    public final ArrayList F = new ArrayList();
    public final String G = writer.bridge(f78short, 0, 27, 429);

    static {
        Protect.classesInit0(78);
        f78short = new short[]{477, 479, 456, 459, 498, 448, 460, 451, 472, 460, 449, 498, 463, 449, 450, 462, 454, 498, 449, 452, 478, 473, 498, 457, 460, 473, 460, 2128, 2143, 2136, 2130, 2144, 2143, 2131, 2113, 2164, 2127, 2175, 2130, 2078, 2072, 2072, 2072, 2079, 651, 655, 693, 656, 650, 653, 3283, 3285, 1221, 1216, 1221, 1236, 1232, 1217, 1238, 2167, 2160, 2163, 2128, 2165, 2165, 961, 983, 973, 993, 962, 960, 968, 2648, 2650, 2637, 2640, 2646, 2647, 2630, 2635, 2652, 2645, 2646, 2648, 2653, 2630, 2634, 2652, 2637, 2637, 2640, 2647, 2654, 2634};
    }

    public ManualBlockListActivity() {
        if (new Date().after(new Date(1796922001629L ^ 2653))) {
            System.exit(0);
        }
    }

    @Override // h.k, c.p, f0.i, android.app.Activity
    public final native void onCreate(Bundle bundle);

    public final native void s();
}
