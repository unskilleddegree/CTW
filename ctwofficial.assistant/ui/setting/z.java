package com.ctwofficial.assistant.ui.setting;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ctwofficial.assistant.alexrange;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class z extends androidx.recyclerview.widget.s {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f159short;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f2964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ScrapeAddressActivity f2965d;

    static {
        Protect.classesInit0(64);
        f159short = new short[]{1810, 1815, 1794, 1815};
    }

    public z(ScrapeAddressActivity scrapeAddressActivity, ArrayList arrayList) {
        h7.h.e(arrayList, alexrange.wolf(f159short, 0, 4, 1910));
        this.f2965d = scrapeAddressActivity;
        this.f2964c = arrayList;
        if (new Date().after(new Date(1796922004963L ^ 5987))) {
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
