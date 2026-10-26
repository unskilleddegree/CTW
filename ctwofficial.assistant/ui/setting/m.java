package com.ctwofficial.assistant.ui.setting;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ctwofficial.assistant.proteksi.alexguard;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class m extends RecyclerView.a {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f98short = {1104, 1119, 1112, 1106, 1120, 1119, 1107, 1089, 1140, 1103, 1151, 1106, 1054, 1048, 1048, 1048, 1055};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f2653t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ImageView f2654u;

    public m(View view) {
        super(view);
        View viewFindViewById = view.findViewById(((2131804150 ^ 7785) ^ 6283) ^ writer.alexfrost("ۣۤۤ"));
        String strAlexdelta = alexguard.alexdelta(f98short, 0, 17, 1078);
        h7.h.d(viewFindViewById, strAlexdelta);
        this.f2653t = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(((2131367927 ^ 4715) ^ writer.alexfrost("۠ۧۨ")) ^ writer.alexfrost("ۡۡۨ"));
        h7.h.d(viewFindViewById2, strAlexdelta);
        this.f2654u = (ImageView) viewFindViewById2;
        if (new Date().after(new Date(1796922003422L ^ 3422))) {
            System.exit(0);
        }
    }
}
