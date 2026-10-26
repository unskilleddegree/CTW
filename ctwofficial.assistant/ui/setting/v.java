package com.ctwofficial.assistant.ui.setting;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ctwofficial.assistant.proteksi.alexguard;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class v extends androidx.recyclerview.widget.s {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f157short;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f2956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ManualEnRouteActivity f2957d;

    static {
        Protect.classesInit0(67);
        f157short = new short[]{449, 476, 461, 453, 475};
    }

    public v(ManualEnRouteActivity manualEnRouteActivity, ArrayList arrayList) {
        h7.h.e(arrayList, alexguard.alexdelta(f157short, 0, 5, 424));
        this.f2957d = manualEnRouteActivity;
        this.f2956c = arrayList;
        if (new Date().after(new Date(1796922006560L ^ 7840))) {
            System.exit(0);
        }
    }

    @Override // androidx.recyclerview.widget.s
    public final native int a();

    @Override // androidx.recyclerview.widget.s
    public final native void c(RecyclerView.a aVar, int i);

    @Override // androidx.recyclerview.widget.s
    public final native RecyclerView.a d(ViewGroup viewGroup);
}
