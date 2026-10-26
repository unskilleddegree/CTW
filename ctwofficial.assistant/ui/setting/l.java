package com.ctwofficial.assistant.ui.setting;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ctwofficial.assistant.alexrange;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class l extends androidx.recyclerview.widget.s {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f97short;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f2651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BlockedListActivity f2652d;

    static {
        Protect.classesInit0(75);
        f97short = new short[]{2672, 2677, 2656, 2677};
    }

    public l(BlockedListActivity blockedListActivity, ArrayList arrayList) {
        h7.h.e(arrayList, alexrange.wolf(f97short, 0, 4, 2580));
        this.f2652d = blockedListActivity;
        this.f2651c = arrayList;
        if (new Date().after(new Date(1796922001038L ^ 1038))) {
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
