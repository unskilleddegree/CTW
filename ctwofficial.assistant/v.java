package com.ctwofficial.assistant;

import java.util.Comparator;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2966a;

    static {
        Protect.classesInit0(189);
    }

    public /* synthetic */ v(int i) {
        this.f2966a = i;
        if (new Date().after(new Date(1796922008620L ^ 9900))) {
            System.exit(0);
        }
    }

    @Override // java.util.Comparator
    public final native int compare(Object obj, Object obj2);
}
