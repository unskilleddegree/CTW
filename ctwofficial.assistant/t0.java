package com.ctwofficial.assistant;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f71short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MainActivity f2566e;

    static {
        Protect.classesInit0(181);
        f71short = new short[]{269, 271, 312, 282, 269, 272, 271, 284, 308, 284, 276, 283, 284, 267, 266, 314, 278, 268, 279, 269, 2014, 2012, 2018, 1999, 1995, 1998, 1999, 2008, 2040, 1999, 1993, 1989, 1988, 1988, 1999, 1993, 2014, 2041, 2014, 1995, 2014, 2015, 2009, 1261, 1243, 1229, 1239, 1182, 1279, 1232, 1242, 1247, 1182, 1226, 1243, 1234, 1247, 1238, 1182, 1244, 1243, 1228, 1247, 1237, 1238, 1239, 1228, 1168, 1182, 1261, 1239, 1234, 1247, 1237, 1247, 1232, 1182, 1234, 1233, 1241, 1239, 1232, 1182, 1237, 1243, 1235, 1244, 1247, 1234, 1239, 1168};
    }

    public /* synthetic */ t0(MainActivity mainActivity, int i) {
        this.f2565d = i;
        this.f2566e = mainActivity;
        if (new Date().after(new Date(1796922005920L ^ 6944))) {
            System.exit(0);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
