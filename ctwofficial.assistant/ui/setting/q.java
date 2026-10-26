package com.ctwofficial.assistant.ui.setting;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ctwofficial.assistant.proteksi.alexguard;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class q extends RecyclerView.a {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f101short = {2838, 2841, 2846, 2836, 2854, 2841, 2837, 2823, 2866, 2825, 2873, 2836, 2904, 2910, 2910, 2910, 2905};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f2662t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ImageView f2663u;

    public q(View view) {
        super(view);
        View viewFindViewById = view.findViewById(((2131807853 ^ 672) ^ 1781) ^ writer.alexfrost("ۨۤۥ"));
        String strAlexdelta = alexguard.alexdelta(f101short, 0, 17, 2928);
        h7.h.d(viewFindViewById, strAlexdelta);
        this.f2662t = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById((((2131367954 ^ 207) ^ 7414) ^ writer.alexfrost("ۣۢ۠")) ^ writer.alexfrost("ۢۤ۠"));
        h7.h.d(viewFindViewById2, strAlexdelta);
        this.f2663u = (ImageView) viewFindViewById2;
        if (new Date().after(new Date(1796922008081L ^ 8337))) {
            System.exit(0);
        }
    }
}
