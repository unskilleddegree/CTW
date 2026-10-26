package com.ctwofficial.assistant.ui.setting.service;

import android.content.ContextWrapper;
import android.widget.SeekBar;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f136short;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ContextWrapper f2867b;

    static {
        Protect.classesInit0(19);
        f136short = new short[]{308, 290, 290, 300, 261, 294, 309, 2703, 2692, 2691, 2697, 2692, 2691, 2698, 1904, 1906, 1856, 1889, 1896, 1893, 1917, 1864, 1893, 1894, 1889, 1896, 932, 934, 925, 945, 936, 916, 953, 931, 932, 945, 958, 947, 949, 924, 945, 946, 949, 956, 2891, 2889, 2930, 2910, 2887, 2927, 2893, 2902, 2908, 2906, 2932, 2890, 2893, 2902, 2893, 2931, 2910, 2909, 2906, 2899, 1544, 1546, 1585, 1557, 1554, 1580, 1550, 1557, 1567, 1561, 1591, 1545, 1550, 1557, 1550, 1584, 1565, 1566, 1561, 1552, 2716, 2718, 2725, 2697, 2704, 2744, 2714, 2689, 2699, 2701, 2724, 2697, 2698, 2701, 2692, 1021, 1023, 964, 992, 999, 985, 1019, 992, 1002, 1004, 965, 1000, 1003, 1004, 997, 1941, 1943, 1964, 1928, 1935, 1971, 1920, 1941, 1928, 1935, 1926, 1965, 1920, 1923, 1924, 1933, 1422, 1432, 1432, 1430, 1471, 1436, 1423, 994, 1012, 1012, 1018, 979, 1008, 995, 1422, 1423, 1414, 1419, 1427, 1461, 1432, 1423, 1420, 1432, 1423, 1433, 1410, 3005, 2993, 2984, 2959, 2996, 3001, 2979, 2980, 2993, 3006, 2995, 2997, 682, 678, 703, 664, 695, 693, 686, 676, 674, 664, 684, 690, 693, 686, 693, 639, 635, 636, 589, 610, 608, 635, 625, 631, 589, 633, 615, 608, 635, 608, 1038, 1026, 1051, 1084, 1043, 1041, 1034, 1024, 1030, 2592, 2596, 2595, 2578, 2621, 2623, 2596, 2606, 2600, 2038, 2034, 2037, 2034, 2038, 2042, 2039, 1988, 2025, 2042, 2031, 2034, 2037, 2044};
    }

    public /* synthetic */ n0(ContextWrapper contextWrapper, int i) {
        this.f2866a = i;
        this.f2867b = contextWrapper;
        if (new Date().after(new Date(1796922003296L ^ 3552))) {
            System.exit(0);
        }
    }

    private final native void a(SeekBar seekBar);

    private final native void b(SeekBar seekBar);

    private final native void c(SeekBar seekBar);

    private final native void d(SeekBar seekBar);

    private final native void e(SeekBar seekBar);

    private final native void f(SeekBar seekBar);

    private final native void g(SeekBar seekBar);

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final native void onProgressChanged(SeekBar seekBar, int i, boolean z8);

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final native void onStartTrackingTouch(SeekBar seekBar);

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final native void onStopTrackingTouch(SeekBar seekBar);
}
