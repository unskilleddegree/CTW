package com.ctwofficial.assistant.ui.setting.service;

import com.ctwofficial.assistant.ui.setting.writer;
import java.util.ArrayList;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f116short;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f2782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f2785d;

    static {
        Protect.classesInit0(149);
        f116short = new short[]{3094, 3092, 3099, 3089, 3100, 3089, 3092, 3073, 3088, 1765, 1749, 1753, 1732, 1747, 1746, 1781, 1751, 1752, 1746, 1759, 1746, 1751, 1730, 1747, 1694, 1749, 1751, 1752, 1746, 1759, 1746, 1751, 1730, 1747, 1675, 1173, 1177, 1226, 1242, 1238, 1227, 1244, 1156, 486, 490, 442, 421, 441, 419, 446, 419, 444, 431, 408, 431, 427, 441, 421, 420, 441, 503, 1140, 1144, 1078, 1085, 1087, 1081, 1068, 1073, 1070, 1085, 1034, 1085, 1081, 1067, 1079, 1078, 1067, 1125, 986};
    }

    public c0(y yVar, int i, ArrayList arrayList, ArrayList arrayList2) {
        h7.h.e(yVar, writer.bridge(f116short, 0, 9, 3189));
        this.f2782a = yVar;
        this.f2783b = i;
        this.f2784c = arrayList;
        this.f2785d = arrayList2;
        if (new Date().after(new Date(1796922008520L ^ 8520))) {
            System.exit(0);
        }
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
