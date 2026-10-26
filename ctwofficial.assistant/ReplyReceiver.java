package com.ctwofficial.assistant;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class ReplyReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f9short;

    static {
        Protect.classesInit0(108);
        f9short = new short[]{2903, 2908, 2901, 2880, 2923, 2905, 2897, 2906, 2880, 2909, 2907, 2906, 2923, 2903, 2908, 2901, 2906, 2906, 2897, 2904, 1255, 1254, 1277, 1248, 1263, 1248, 1258, 1256, 1277, 1248, 1254, 1255, 3044, 3071, 3046, 3046, 2986, 3049, 3051, 3044, 3044, 3045, 3070, 2986, 3048, 3055, 2986, 3049, 3051, 3065, 3070, 2986, 3070, 3045, 2986, 3044, 3045, 3044, 2983, 3044, 3071, 3046, 3046, 2986, 3070, 3059, 3066, 3055, 2986, 3051, 3044, 3054, 3064, 3045, 3043, 3054, 2980, 3051, 3066, 3066, 2980, 3012, 3045, 3070, 3043, 3052, 3043, 3049, 3051, 3070, 3043, 3045, 3044, 3015, 3051, 3044, 3051, 3053, 3055, 3064, 3307, 3303, 3302, 3324, 3309, 3312, 3324, 1333, 1330, 1320, 1337, 1330, 1320, 3284, 3290, 3270, 3296, 3275, 3290, 3271, 3275, 3296, 3277, 3290, 3279, 3283, 3270, 1052, 1050, 1036, 1051, 1078, 1049, 1051, 1036, 1039, 1050, 1012, 1007, 1003, 997, 1006, 3287, 3286, 3277, 3280, 3295, 3302, 3280, 3293, 306, 304, 289, 262, 289, 295, 316, 315, 306, 381, 379, 379, 379, 380, 1204, 1199, 1195, 1189, 1198, 1183, 1199, 1202, 1183, 1197, 1185, 1193, 1196, 2440, 2432, 2454, 2454, 2436, 2434, 2432, 1199, 1196, 1184, 1186, 1207, 1194, 1196, 1197, 1180, 1199, 1186, 1185, 1190, 1199, 1188, 1179, 1171, 1234, 1212, 1181, 1158, 1179, 1172, 1179, 1177, 1171, 1153, 1179, 2792, 2807, 2795, 2796};
    }

    public ReplyReceiver() {
        if (new Date().after(new Date(1796922004582L ^ 5862))) {
            System.exit(0);
        }
    }

    public static native void a(int i, Context context, String str);

    @Override // android.content.BroadcastReceiver
    public final native void onReceive(Context context, Intent intent);
}
