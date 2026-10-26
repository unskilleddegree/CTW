package com.ctwofficial.assistant.ui.setting.service;

import com.ctwofficial.assistant.databinding.slow;
import com.ctwofficial.assistant.ui.setting.level;
import java.util.ArrayList;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public abstract class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h7.m f2950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h7.m f2951b;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f155short;

    static {
        Protect.classesInit0(74);
        f155short = new short[]{1521, 1510, 1456, 1520, 1415, 1413, 1450, 1523, 1432, 1413, 1450, 1523, 1410, 1520, 1507, 1527, 1524, 1412, 1064, 1087, 1129, 1065, 1118, 1116, 1139, 1066, 1090, 1116, 1139, 1066, 1115, 1065, 1082, 1070, 1069, 1117, 2765, 2753, 2766, 2757, 2763, 2777, 2755, 2777, 2783, 2803};
        f2950a = new h7.m(slow.anchor(f155short, 0, 18, 1497));
        f2951b = new h7.m(level.touch(f155short, 18, 18, 1024));
    }

    public static final native y0 a(ArrayList arrayList, String str);
}
