package com.ctwofficial.assistant.ui.setting;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class k extends RecyclerView.a {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f96short = {1898, 1893, 1890, 1896, 1882, 1893, 1897, 1915, 1870, 1909, 1861, 1896, 1828, 1826, 1826, 1826, 1829};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f2647t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ImageView f2648u;

    public k(View view) {
        super(view);
        View viewFindViewById = view.findViewById((((2131366054 ^ 3415) ^ 2501) ^ writer.alexfrost("ۡۡۥ")) ^ writer.alexfrost("ۣۤ۟"));
        String strBridge = writer.bridge(f96short, 0, 17, 1804);
        h7.h.d(viewFindViewById, strBridge);
        this.f2647t = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById((((2131363545 ^ 1492) ^ 7802) ^ writer.alexfrost("۟ۡۨ")) ^ writer.alexfrost("ۤۦۧ"));
        h7.h.d(viewFindViewById2, strBridge);
        this.f2648u = (ImageView) viewFindViewById2;
        if (new Date().after(new Date(1796922003466L ^ 4746))) {
            System.exit(0);
        }
    }
}
