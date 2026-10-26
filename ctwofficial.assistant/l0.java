package com.ctwofficial.assistant;

import android.view.View;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f30short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MainActivity f2386e;

    static {
        Protect.classesInit0(92);
        f30short = new short[]{2717, 2705, 2707, 2768, 2717, 2698, 2697, 2768, 2751, 2749, 2730, 2743, 2737, 2736, 2721, 2732, 2747, 2738, 2737, 2751, 2746, 2721, 2733, 2747, 2730, 2730, 2743, 2736, 2745, 2733, 2876, 2858, 2875, 2847, 2862, 2860, 2852, 2862, 2856, 2858, 2919, 2913, 2913, 2913, 2918};
    }

    public /* synthetic */ l0(MainActivity mainActivity, int i) {
        this.f2385d = i;
        this.f2386e = mainActivity;
        if (new Date().after(new Date(1796922004999L ^ 5255))) {
            System.exit(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
