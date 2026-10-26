package com.ctwofficial.assistant;

import android.app.Application;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class CtwApplication extends Application {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f2short;

    static {
        Protect.classesInit0(9);
        f2short = new short[]{507, 493, 507, 507, 481, 487, 486, 471, 495, 509, 489, 506, 492, 471, 491, 489, 491, 480, 493, 1456, 1469, 1455, 1448, 1411, 1450, 1469, 1456, 1461, 1464, 1411, 1469, 1448};
    }

    public CtwApplication() {
        if (new Date().after(new Date(1796922009118L ^ 9374))) {
            System.exit(0);
        }
    }

    @Override // android.app.Application
    public final native void onCreate();
}
