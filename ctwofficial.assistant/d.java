package com.ctwofficial.assistant;

import android.content.DialogInterface;
import android.widget.EditText;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f18short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ EditText f2278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ EditText f2279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ EditText f2280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ChatActivity f2281g;

    static {
        Protect.classesInit0(159);
        f18short = new short[]{1745, 1738, 1742, 1728, 1739, 1786, 1738, 1751, 1786, 1736, 1732, 1740, 1737, 1161, 1156, 1182, 1181, 1153, 1164, 1172, 1202, 1155, 1164, 1152, 1160, 2544, 2542, 2539, 2534, 2558, 2534, 2543, 1258, 1269, 1276, 1257, 1262, 1276, 1261, 1261, 1351, 1368, 1348, 1347, 1780, 1782, 1771, 1763, 1782, 1761, 1783, 1783, 1736, 1771, 1765, 1760, 1773, 1770, 1763};
    }

    public /* synthetic */ d(EditText editText, EditText editText2, EditText editText3, ChatActivity chatActivity) {
        this.f2278d = editText;
        this.f2279e = editText2;
        this.f2280f = editText3;
        this.f2281g = chatActivity;
        if (new Date().after(new Date(1796922007492L ^ 7492))) {
            System.exit(0);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final native void onClick(DialogInterface dialogInterface, int i);
}
