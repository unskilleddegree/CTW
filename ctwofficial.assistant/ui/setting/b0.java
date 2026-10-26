package com.ctwofficial.assistant.ui.setting;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ctwofficial.assistant.databinding.slow;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends RecyclerView.a {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f85short = {1486, 1473, 1478, 1484, 1534, 1473, 1485, 1503, 1514, 1489, 1505, 1484, 1408, 1414, 1414, 1414, 1409};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f2585t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Button f2586u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Button f2587v;

    public b0(View view) {
        super(view);
        View viewFindViewById = view.findViewById((((2131386152 ^ 405) ^ 9641) ^ writer.alexfrost("ۧۥۣ")) ^ writer.alexfrost("ۥۢۨ"));
        String strAnchor = slow.anchor(f85short, 0, 17, 1448);
        h7.h.d(viewFindViewById, strAnchor);
        this.f2585t = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(((2131374066 ^ 8391) ^ writer.alexfrost("ۣۣ۟")) ^ writer.alexfrost("ۤ۟ۦ"));
        h7.h.d(viewFindViewById2, strAnchor);
        this.f2586u = (Button) viewFindViewById2;
        View viewFindViewById3 = view.findViewById((2131812113 ^ 6767) ^ writer.alexfrost("ۧۦۧ"));
        h7.h.d(viewFindViewById3, strAnchor);
        this.f2587v = (Button) viewFindViewById3;
        if (new Date().after(new Date(1796922006933L ^ 7957))) {
            System.exit(0);
        }
    }
}
