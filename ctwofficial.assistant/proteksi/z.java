package com.ctwofficial.assistant.proteksi;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f66short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g7.l f2540e;

    static {
        Protect.classesInit0(134);
        f66short = new short[]{3281, 3290, 3275, 3272, 3280, 3277, 3284, 3264, 3290, 3277, 3277, 3280, 3277, 1185, 1175, 1152, 1156, 1175, 1152, 1234, 1153, 1175, 1183, 1175, 1180, 1158, 1171, 1152, 1171, 1234, 1158, 1179, 1174, 1171, 1177, 1234, 1174, 1171, 1154, 1171, 1158, 1234, 1174, 1179, 1178, 1159, 1168, 1159, 1180, 1173, 1179, 1244, 1104, 1089, 1106, 1107, 1093, 1119, 1093, 1106, 1106, 1103, 1106, 2810, 2765, 2779, 2776, 2759, 2758, 2779, 2696, 2782, 2761, 2756, 2753, 2764, 2761, 2779, 2753, 2696, 2779, 2765, 2778, 2782, 2765, 2778, 2696, 2780, 2753, 2764, 2761, 2755, 2696, 2764, 2761, 2776, 2761, 2780, 2696, 2764, 2753, 2776, 2778, 2759, 2779, 2765, 2779, 2694, 508, 507, 483, 500, 505, 508, 497, 490, 487, 496, 486, 485, 506, 507, 486, 496, 1461, 1410, 1428, 1431, 1416, 1417, 1428, 1479, 1425, 1414, 1419, 1422, 1411, 1414, 1428, 1422, 1479, 1428, 1410, 1429, 1425, 1410, 1429, 1479, 1427, 1422, 1411, 1414, 1420, 1479, 1425, 1414, 1419, 1422, 1411, 1481};
    }

    public /* synthetic */ z(g7.l lVar, int i) {
        this.f2539d = i;
        this.f2540e = lVar;
        if (new Date().after(new Date(1796922009304L ^ 9304))) {
            System.exit(0);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
