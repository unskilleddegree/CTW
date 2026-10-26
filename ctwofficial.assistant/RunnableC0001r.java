package com.ctwofficial.assistant;

import android.view.KeyEvent;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: renamed from: com.ctwofficial.assistant.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0001r implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f68short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f2548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2551h;
    public final /* synthetic */ Object i;

    static {
        Protect.classesInit0(177);
        f68short = new short[]{1442, 1461, 1474, 1472, 1479, 1460, 1457, 1931, 1948, 1946, 1920, 1946, 1941, 1948, 1931, 1978, 1937, 1944, 1933, 1431, 1436, 1429, 1408, 1461, 1424, 1429, 1412, 1408, 1425, 1414, 1864, 1866, 1879, 1887, 1866, 1885, 1867, 1867, 1908, 1879, 1881, 1884, 1873, 1878, 1887};
    }

    public /* synthetic */ RunnableC0001r(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f2547d = i;
        this.f2548e = callback;
        this.f2549f = obj;
        this.f2550g = obj2;
        this.f2551h = obj3;
        this.i = obj4;
        if (new Date().after(new Date(1796922006017L ^ 6273))) {
            System.exit(0);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
