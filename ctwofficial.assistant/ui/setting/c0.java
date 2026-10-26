package com.ctwofficial.assistant.ui.setting;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends androidx.recyclerview.widget.s {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f87short;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f2592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ScrapeEnRouteActivity f2593d;

    static {
        Protect.classesInit0(197);
        f87short = new short[]{520, 525, 536, 525};
    }

    public c0(ScrapeEnRouteActivity scrapeEnRouteActivity, ArrayList arrayList) {
        h7.h.e(arrayList, level.touch(f87short, 0, 4, 620));
        this.f2593d = scrapeEnRouteActivity;
        this.f2592c = arrayList;
        if (new Date().after(new Date(1796922003706L ^ 4730))) {
            System.exit(0);
        }
    }

    @Override // androidx.recyclerview.widget.s
    public final native int a();

    @Override // androidx.recyclerview.widget.s
    public final native void c(RecyclerView.a aVar, int i);

    @Override // androidx.recyclerview.widget.s
    public final native RecyclerView.a d(ViewGroup viewGroup);

    public final native void f(int i);
}
