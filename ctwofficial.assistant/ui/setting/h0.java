package com.ctwofficial.assistant.ui.setting;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ctwofficial.assistant.proteksi.store;
import com.google.android.material.button.MaterialButton;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends RecyclerView.a {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f93short = {1043, 1052, 1051, 1041, 1059, 1052, 1040, 1026, 1079, 1036, 1084, 1041, 1117, 1115, 1115, 1115, 1116};
    public final TextView A;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f2629t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f2630u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f2631v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f2632w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f2633x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final MaterialButton f2634y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ImageView f2635z;

    public h0(View view) {
        super(view);
        View viewFindViewById = view.findViewById(((((2131393602 ^ 201) ^ 7405) ^ 292) ^ writer.alexfrost("ۣۧ۟")) ^ writer.alexfrost("۟ۥۧ"));
        String strAlexraven = store.alexraven(f93short, 0, 17, 1141);
        h7.h.d(viewFindViewById, strAlexraven);
        this.f2629t = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(((((2131371536 ^ 8810) ^ 7803) ^ 4559) ^ writer.alexfrost("ۥۨۡ")) ^ writer.alexfrost("ۣ۟ۢ"));
        h7.h.d(viewFindViewById2, strAlexraven);
        this.f2630u = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById((((2131809196 ^ 8653) ^ 9279) ^ 7562) ^ writer.alexfrost("ۨ۠ۢ"));
        h7.h.d(viewFindViewById3, strAlexraven);
        this.f2631v = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(((2131799746 ^ 3826) ^ 4501) ^ writer.alexfrost("ۢۤۦ"));
        h7.h.d(viewFindViewById4, strAlexraven);
        this.f2632w = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById((((2131387072 ^ 5667) ^ 5154) ^ writer.alexfrost("ۨ۠ۢ")) ^ writer.alexfrost("۠ۤۧ"));
        h7.h.d(viewFindViewById5, strAlexraven);
        this.f2633x = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById((((2131788130 ^ 8287) ^ 3854) ^ 6028) ^ writer.alexfrost("ۤ۟۟"));
        h7.h.d(viewFindViewById6, strAlexraven);
        this.f2634y = (MaterialButton) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(((2131392787 ^ 2914) ^ writer.alexfrost("ۦ۠ۨ")) ^ writer.alexfrost("ۢۡۢ"));
        h7.h.d(viewFindViewById7, strAlexraven);
        this.f2635z = (ImageView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById((2131794289 ^ 8446) ^ writer.alexfrost("ۤۧۨ"));
        h7.h.d(viewFindViewById8, strAlexraven);
        this.A = (TextView) viewFindViewById8;
        if (new Date().after(new Date(1796922001147L ^ 1147))) {
            System.exit(0);
        }
    }
}
