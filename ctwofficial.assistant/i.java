package com.ctwofficial.assistant;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements g7.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2362d;

    static {
        Protect.classesInit0(169);
    }

    public /* synthetic */ i(int i) {
        this.f2362d = i;
        if (new Date().after(new Date(1796922003567L ^ 4847))) {
            System.exit(0);
        }
    }

    @Override // g7.a
    public final native Object a();
}
