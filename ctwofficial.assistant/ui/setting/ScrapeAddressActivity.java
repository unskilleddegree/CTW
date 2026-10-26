package com.ctwofficial.assistant.ui.setting;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class ScrapeAddressActivity extends h.k {
    public static final /* synthetic */ int G = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f80short;
    public RecyclerView B;
    public z C;
    public final ArrayList D = new ArrayList();
    public final String E = level.touch(f80short, 0, 18, 1064);
    public final h.b0 F = new h.b0(1, this);

    static {
        Protect.classesInit0(20);
        f80short = new short[]{1115, 1097, 1118, 1101, 1100, 1143, 1115, 1099, 1114, 1097, 1112, 1101, 1100, 1143, 1092, 1089, 1115, 1116, 552, 551, 544, 554, 536, 551, 555, 569, 524, 567, 519, 554, 614, 608, 608, 608, 615, 2157, 2153, 2124, 2172, 2157, 2174, 2159, 2170, 2171, 1881, 1869, 1872, 1874, 1909, 1868, 1872, 1873, 1815, 1809, 1809, 1809, 1814, 392, 388, 390, 453, 392, 415, 412, 453, 394, 392, 415, 386, 388, 389, 453, 440, 424, 441, 426, 443, 430, 436, 441, 430, 440, 446, 423, 447, 983, 987, 985, 922, 983, 960, 963, 922, 981, 983, 960, 989, 987, 986, 922, 999, 992, 1013, 998, 992, 1003, 999, 1015, 998, 1013, 996, 1021, 1018, 1011, 1924, 1938, 1923, 1959, 1942, 1940, 1948, 1942, 1936, 1938, 2015, 2009, 2009, 2009, 2014};
    }

    public ScrapeAddressActivity() {
        if (new Date().after(new Date(1796922005321L ^ 5577))) {
            System.exit(0);
        }
    }

    @Override // h.k, c.p, f0.i, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // h.k, android.app.Activity
    public final native void onDestroy();
}
