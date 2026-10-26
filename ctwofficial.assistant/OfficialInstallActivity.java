package com.ctwofficial.assistant;

import android.os.Bundle;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class OfficialInstallActivity extends h.k {
    public static final /* synthetic */ int C = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f7short;
    public q2.m B;

    static {
        Protect.classesInit0(135);
        f7short = new short[]{2870, 2877, 2874, 2864, 2877, 2874, 2867, 1426, 1424, 1409, 1447, 1434, 1434, 1409, 1501, 1499, 1499, 1499, 1500, 1550, 1578, 1584, 1584, 1578, 1581, 1572, 1635, 1585, 1574, 1586, 1590, 1578, 1585, 1574, 1575, 1635, 1589, 1578, 1574, 1588, 1635, 1588, 1578, 1591, 1579, 1635, 1546, 1543, 1657, 1635};
    }

    public OfficialInstallActivity() {
        if (new Date().after(new Date(1796922000184L ^ 440))) {
            System.exit(0);
        }
    }

    @Override // h.k, c.p, f0.i, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // h.k, android.app.Activity
    public final native void onResume();
}
