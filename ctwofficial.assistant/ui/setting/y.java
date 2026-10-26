package com.ctwofficial.assistant.ui.setting;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ctwofficial.assistant.alexrange;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class y extends RecyclerView.a {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f158short = {1758, 1745, 1750, 1756, 1774, 1745, 1757, 1743, 1786, 1729, 1777, 1756, 1680, 1686, 1686, 1686, 1681};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f2961t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Button f2962u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Button f2963v;

    public y(View view) {
        super(view);
        View viewFindViewById = view.findViewById((2131810416 ^ 4623) ^ writer.alexfrost("ۣۨ۠"));
        String strWolf = alexrange.wolf(f158short, 0, 17, 1720);
        h7.h.d(viewFindViewById, strWolf);
        this.f2961t = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(((((2131369640 ^ 5302) ^ 5212) ^ 4676) ^ writer.alexfrost("ۣۦۨ")) ^ writer.alexfrost("ۤۤۢ"));
        h7.h.d(viewFindViewById2, strWolf);
        this.f2962u = (Button) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(((((2131774290 ^ 7191) ^ 9727) ^ 5201) ^ writer.alexfrost("ۢۡ")) ^ writer.alexfrost("ۣۤۡ"));
        h7.h.d(viewFindViewById3, strWolf);
        this.f2963v = (Button) viewFindViewById3;
        if (new Date().after(new Date(1796922004829L ^ 6109))) {
            System.exit(0);
        }
    }
}
