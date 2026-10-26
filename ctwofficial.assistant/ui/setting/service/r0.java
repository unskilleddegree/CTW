package com.ctwofficial.assistant.ui.setting.service;

import com.google.android.gms.maps.model.LatLng;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends a7.h implements g7.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2889h;
    public /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2890j;

    static {
        Protect.classesInit0(184);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(androidx.lifecycle.n nVar, y6.d dVar) {
        super(2, dVar);
        this.f2889h = 2;
        this.f2890j = nVar;
        if (new Date().after(new Date(1796922001731L ^ 3011))) {
            System.exit(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(MyForegroundService myForegroundService, LatLng latLng, y6.d dVar, int i) {
        super(2, dVar);
        this.f2889h = i;
        this.i = myForegroundService;
        this.f2890j = latLng;
        if (new Date().after(new Date(1796922005793L ^ 7073))) {
            System.exit(0);
        }
    }

    @Override // g7.p
    public final native Object c(Object obj, Object obj2);

    @Override // a7.a
    public final native y6.d g(Object obj, y6.d dVar);

    @Override // a7.a
    public final native Object h(Object obj);
}
