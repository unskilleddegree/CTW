package com.ctwofficial.assistant.proteksi;

import android.content.Context;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f42short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f2427e;

    static {
        Protect.classesInit0(125);
        f42short = new short[]{1405, 1394, 1400, 1390, 1395, 1397, 1400, 1380, 1330, 1405, 1388, 1388, 1407, 1395, 1393, 1388, 1405, 1384, 1330, 1405, 1388, 1388, 1330, 1373, 1388, 1388, 1360, 1395, 1407, 1405, 1392, 1401, 1391, 1361, 1401, 1384, 1405, 1400, 1405, 1384, 1405, 1364, 1395, 1392, 1400, 1401, 1390, 1359, 1401, 1390, 1386, 1397, 1407, 1401, 1391, 1388, 1376, 1378, 1391, 1382};
    }

    public /* synthetic */ a(Context context, int i) {
        this.f2426d = i;
        this.f2427e = context;
        if (new Date().after(new Date(1796922008219L ^ 8219))) {
            System.exit(0);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
