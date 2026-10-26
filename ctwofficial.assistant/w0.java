package com.ctwofficial.assistant;

import android.view.View;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w0 implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f162short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ OfficialInstallActivity f2972e;

    static {
        Protect.classesInit0(158);
        f162short = new short[]{598, 602, 585, 592, 606, 591, 2397, 2396, 2381, 2392, 2384, 2389, 2378, 1290, 1287, 1429, 1417, 1417, 1421, 1422, 2540, 2544, 2557, 2533, 2482, 2555, 2547, 2547, 2555, 2544, 2553, 2482, 2559, 2547, 2545, 372, 296, 303, 308, 297, 318, 372, 314, 299, 299, 296, 372, 319, 318, 303, 314, 306, 311, 296, 2734, 2721, 2731, 2749, 2720, 2726, 2731, 2785, 2726, 2721, 2747, 2730, 2721, 2747, 2785, 2734, 2732, 2747, 2726, 2720, 2721, 2785, 2713, 2694, 2698, 2712, 1572, 1576, 1578, 1641, 1574, 1577, 1571, 1589, 1576, 1582, 1571, 1641, 1585, 1570, 1577, 1571, 1582, 1577, 1568};
    }

    public /* synthetic */ w0(OfficialInstallActivity officialInstallActivity, int i) {
        this.f2971d = i;
        this.f2972e = officialInstallActivity;
        if (new Date().after(new Date(1796922009380L ^ 9636))) {
            System.exit(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
