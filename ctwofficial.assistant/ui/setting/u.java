package com.ctwofficial.assistant.ui.setting;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class u extends RecyclerView.a {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f156short = {849, 862, 857, 851, 865, 862, 850, 832, 885, 846, 894, 851, 799, 793, 793, 793, 798};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f2954t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ImageView f2955u;

    public u(View view) {
        super(view);
        View viewFindViewById = view.findViewById(((((2131392051 ^ 6540) ^ 4111) ^ 5056) ^ writer.alexfrost("ۡۡۥ")) ^ writer.alexfrost("ۦۤۢ"));
        String str = level.touch(f156short, 0, 17, 823);
        h7.h.d(viewFindViewById, str);
        this.f2954t = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(((((2131381251 ^ 8113) ^ 8316) ^ 2143) ^ writer.alexfrost("ۥۣۧ")) ^ writer.alexfrost("ۣۧ۠"));
        h7.h.d(viewFindViewById2, str);
        this.f2955u = (ImageView) viewFindViewById2;
        if (new Date().after(new Date(1796922003927L ^ 4951))) {
            System.exit(0);
        }
    }
}
