package com.ctwofficial.assistant;

import android.view.View;
import android.widget.AdapterView;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class v0 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f160short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2968e;

    static {
        Protect.classesInit0(151);
        f160short = new short[]{3026, 3014, 3015, 3036, 3025, 3034, 3031, 3052, 3014, 3011, 3009, 3034, 3024, 3030, 3052, 3015, 3026, 3009, 3028, 3030, 3015};
    }

    public /* synthetic */ v0(int i, Object obj) {
        this.f2967d = i;
        this.f2968e = obj;
        if (new Date().after(new Date(1796922000375L ^ 375))) {
            System.exit(0);
        }
    }

    private final native void a(AdapterView adapterView);

    private final native void b(AdapterView adapterView);

    private final native void c(AdapterView adapterView);

    private final native void d(AdapterView adapterView);

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final native void onItemSelected(AdapterView adapterView, View view, int i, long j3);

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final native void onNothingSelected(AdapterView adapterView);
}
