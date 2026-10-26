package com.ctwofficial.assistant.ui.setting;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.ArrayList;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class SharedSettingsActivity extends h.k {
    public static final /* synthetic */ int Q = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f82short;
    public RecyclerView B;
    public SwipeRefreshLayout C;
    public EditText D;
    public View F;
    public View G;
    public TextView H;
    public Spinner I;
    public i0 M;
    public final y7.t E = new y7.t();
    public final ArrayList J = new ArrayList();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public int N = 1;
    public int O = 10;
    public int P = 1;

    static {
        Protect.classesInit0(84);
        f82short = new short[]{1424, 1426, 1411, 1459, 1426, 1425, 1430, 1410, 1435, 1411, 1503, 1497, 1497, 1497, 1502, 3004, 2983, 2948, 2983, 3007, 2989, 3002, 2955, 2985, 3003, 2989, 3040, 3046, 3046, 3046, 3041, 1423, 1408, 1415, 1421, 1471, 1408, 1420, 1438, 1451, 1424, 1440, 1421, 1473, 1479, 1479, 1479, 1472, 1835, 1839, 1813, 1840, 1834, 1837, 1267, 1266, 1266, 2740, 2743, 2743, 378, 379, 421, 423, 2913, 2914, 554, 558, 885, 880, 2487, 2484, 2477, 2474, 2474, 2465, 2486, 2440, 2477, 2473, 2477, 2480, 2654, 2639, 2664, 2654, 2650, 2633, 2648, 2643, 2598, 2608, 2602, 2570, 2593, 2620, 2608, 2875, 2861, 2871, 2825, 2859, 2876, 2863, 2985, 2989, 2995, 2986, 3007, 2952, 3007, 3004, 2984, 3007, 2985, 2994, 2809, 2813, 2787, 2810, 2799, 2776, 2799, 2796, 2808, 2799, 2809, 2786, 3111, 3109, 3075, 3122, 3124, 3126, 3098, 3133, 3125, 3132, 1619, 1622, 1619, 1602, 1606, 1623, 1600, 1355, 1373, 1351, 1383, 1356, 1361, 1373, 414, 392, 402, 428, 398, 409, 394, 1064, 1068, 1046, 1075, 1065, 1070};
    }

    public SharedSettingsActivity() {
        if (new Date().after(new Date(1796922001697L ^ 2977))) {
            System.exit(0);
        }
    }

    public static final native void s(SharedSettingsActivity sharedSettingsActivity, String str);

    @Override // h.k, c.p, f0.i, android.app.Activity
    public final native void onCreate(Bundle bundle);

    public final native void t();

    public final native void u();
}
