package com.ctwofficial.assistant.ui.setting;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class ManualEnRouteActivity extends h.k {
    public static final /* synthetic */ int H = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f79short;
    public RecyclerView B;
    public FloatingActionButton C;
    public View D;
    public v E;
    public final ArrayList F = new ArrayList();
    public final String G = writer.bridge(f79short, 0, 29, 2055);

    static {
        Protect.classesInit0(10);
        f79short = new short[]{2167, 2165, 2146, 2145, 2136, 2154, 2150, 2153, 2162, 2150, 2155, 2136, 2146, 2153, 2165, 2152, 2162, 2163, 2146, 2136, 2155, 2158, 2164, 2163, 2136, 2147, 2150, 2163, 2150, 2655, 2640, 2647, 2653, 2671, 2640, 2652, 2638, 2683, 2624, 2672, 2653, 2577, 2583, 2583, 2583, 2576, 2169, 2173, 2119, 2146, 2168, 2175, 2094, 2088, 3132, 3129, 3132, 3117, 3113, 3128, 3119, 1958, 1953, 1954, 1921, 1956, 1956, 2165, 2147, 2169, 2133, 2166, 2164, 2172, 941, 943, 952, 933, 931, 930, 947, 958, 937, 928, 931, 941, 936, 947, 959, 937, 952, 952, 933, 930, 939, 959};
    }

    public ManualEnRouteActivity() {
        if (new Date().after(new Date(1796922003330L ^ 3330))) {
            System.exit(0);
        }
    }

    @Override // h.k, c.p, f0.i, android.app.Activity
    public final native void onCreate(Bundle bundle);

    public final native void s();
}
