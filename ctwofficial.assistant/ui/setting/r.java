package com.ctwofficial.assistant.ui.setting;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ctwofficial.assistant.proteksi.alexguard;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class r extends androidx.recyclerview.widget.s {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f102short;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f2664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ManualBlockListActivity f2665d;

    static {
        Protect.classesInit0(69);
        f102short = new short[]{2072, 2053, 2068, 2076, 2050};
    }

    public r(ManualBlockListActivity manualBlockListActivity, ArrayList arrayList) {
        h7.h.e(arrayList, alexguard.alexdelta(f102short, 0, 5, 2161));
        this.f2665d = manualBlockListActivity;
        this.f2664c = arrayList;
        if (new Date().after(new Date(1796922009343L ^ 9343))) {
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
