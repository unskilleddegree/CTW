package com.ctwofficial.assistant.ui.setting;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class ScrapeEnRouteActivity extends h.k {
    public static final /* synthetic */ int G = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f81short;
    public RecyclerView B;
    public c0 C;
    public final ArrayList D = new ArrayList();
    public final String E = alexwolf.alexrange(f81short, 0, 26, 2708);
    public final h.b0 F = new h.b0(2, this);

    static {
        Protect.classesInit0(173);
        f81short = new short[]{2791, 2805, 2786, 2801, 2800, 2763, 2791, 2807, 2790, 2805, 2788, 2801, 2800, 2763, 2801, 2810, 2790, 2811, 2785, 2784, 2801, 2763, 2808, 2813, 2791, 2784, 1554, 1565, 1562, 1552, 1570, 1565, 1553, 1539, 1590, 1549, 1597, 1552, 1628, 1626, 1626, 1626, 1629, 433, 437, 400, 416, 433, 418, 435, 422, 423, 2290, 2278, 2299, 2297, 2270, 2279, 2299, 2298, 2236, 2234, 2234, 2234, 2237, 1155, 1167, 1165, 1230, 1155, 1172, 1175, 1230, 1153, 1155, 1172, 1161, 1167, 1166, 1230, 1203, 1187, 1202, 1185, 1200, 1189, 1215, 1202, 1189, 1203, 1205, 1196, 1204, 1194, 1190, 1188, 1255, 1194, 1213, 1214, 1255, 1192, 1194, 1213, 1184, 1190, 1191, 1255, 1178, 1181, 1160, 1179, 1181, 1174, 1178, 1162, 1179, 1160, 1177, 1152, 1159, 1166, 891, 877, 892, 856, 873, 875, 867, 873, 879, 877, 800, 806, 806, 806, 801, 2063, 2069, 2073, 2051, 2056, 2068, 2057, 2067, 2066, 2051, 2073, 2069, 2053, 2068, 2055, 2070, 2051};
    }

    public ScrapeEnRouteActivity() {
        if (new Date().after(new Date(1796922004435L ^ 4435))) {
            System.exit(0);
        }
    }

    @Override // h.k, c.p, f0.i, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // h.k, android.app.Activity
    public final native void onDestroy();
}
