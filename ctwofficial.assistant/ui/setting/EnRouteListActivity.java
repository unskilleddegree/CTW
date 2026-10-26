package com.ctwofficial.assistant.ui.setting;

import android.os.Bundle;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class EnRouteListActivity extends h.k {
    public static final /* synthetic */ int G = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f77short;
    public RecyclerView B;
    public TextView C;
    public MaterialButton D;
    public n E;
    public final ArrayList F = new ArrayList();

    static {
        Protect.classesInit0(161);
        f77short = new short[]{2139, 2132, 2131, 2137, 2155, 2132, 2136, 2122, 2175, 2116, 2164, 2137, 2069, 2067, 2067, 2067, 2068, 1208, 1212, 1158, 1187, 1209, 1214, 2806, 2791, 2785, 2790, 2791, 2806, 2793, 2812, 2813, 2806, 1627, 1161, 2032, 2007, 1924, 1922, 1926, 1939, 1925, 2032, 2001, 1266, 1040, 1030, 1052, 1073, 1054, 1047, 1043, 1024, 1075, 1054, 1054, 3288, 2206, 2369, 2384, 2390, 2385, 2384, 2369, 2398, 2379, 2378, 2369, 1789, 1791, 1768, 1781, 1779, 1778, 1763, 1774, 1785, 1776, 1779, 1789, 1784, 1763, 1775, 1785, 1768, 1768, 1781, 1778, 1787, 1775, 1893, 1895, 1874, 1918, 1892, 1919, 1893, 876, 873, 876, 893, 889, 872, 895};
    }

    public EnRouteListActivity() {
        if (new Date().after(new Date(1796922008968L ^ 9992))) {
            System.exit(0);
        }
    }

    @Override // h.k, c.p, f0.i, android.app.Activity
    public final native void onCreate(Bundle bundle);

    public final native void s();

    public final native void t();
}
