package com.ctwofficial.assistant.proteksi;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* JADX INFO: renamed from: short */
    private static final short[] f62short;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f2521e;

    static {
        Protect.classesInit0(144);
        f62short = new short[]{2390, 2400, 2423, 2419, 2400, 2423, 2341, 2417, 2400, 2423, 2409, 2404, 2409, 2416, 2341, 2409, 2404, 2408, 2404, 2341, 2408, 2400, 2423, 2400, 2422, 2421, 2410, 2411, 2422, 2347, 2341, 2390, 2412, 2409, 2404, 2414, 2404, 2411, 2341, 2406, 2410, 2407, 2404, 2341, 2414, 2400, 2408, 2407, 2404, 2409, 2412, 2347, 567, 522, 519, 514, 520, 579, 519, 514, 531, 514, 535, 579, 535, 518, 529, 523, 534, 513, 534, 525, 516, 579, 520, 518, 579, 528, 518, 529, 533, 518, 529, 589, 579, 563, 518, 529, 522, 520, 528, 514, 579, 520, 524, 525, 518, 520, 528, 522, 579, 522, 525, 535, 518, 529, 525, 518, 535, 589, 1390, 1388, 1405, 1370, 1405, 1403, 1376, 1383, 1390, 1313, 1319, 1319, 1319, 1312};
    }

    public /* synthetic */ v() {
        z8 = z;
        if (new Date().after(new Date(1796922007254L ^ 7254))) {
            System.exit(0);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
