package com.ctwofficial.assistant.ui.setting.service;

import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.ctwofficial.assistant.CrashLog;
import com.ctwofficial.assistant.alexrange;
import com.ctwofficial.assistant.databinding.eagle;
import com.ctwofficial.assistant.databinding.slow;
import com.ctwofficial.assistant.proteksi.alexguard;
import com.ctwofficial.assistant.proteksi.locked;
import com.ctwofficial.assistant.proteksi.store;
import com.ctwofficial.assistant.ui.setting.alexwolf;
import com.ctwofficial.assistant.ui.setting.level;
import com.ctwofficial.assistant.ui.setting.writer;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f123short;

    static {
        Protect.classesInit0(38);
        f123short = new short[]{3153, 3178, 3183, 3178, 3179, 3187, 3178, 3108, 3186, 3181, 3191, 3181, 3174, 3181, 3176, 3181, 3184, 3197, 3108, 2314, 2363, 2344, 2363, 2359, 2367, 2350, 2367, 2344, 2426, 2345, 2346, 2367, 2361, 2355, 2364, 2355, 2367, 2366, 2426, 2363, 2345, 2426, 2356, 2357, 2356, 2423, 2356, 2351, 2358, 2358, 2426, 2355, 2345, 2426, 2356, 2351, 2358, 2358, 2400, 2426, 2359, 2367, 2350, 2354, 2357, 2366, 2426, 3092, 3132, 3120, 3168, 3185, 3170, 3185, 3197, 3189, 3172, 3189, 3170, 3120, 2122, 2124, 2119, 2141, 2124, 2139, 2134, 2128, 1767, 1761, 1770, 1776, 1761, 1782, 1787, 1788, 1164, 1162, 1153, 1179, 1162, 1181, 604, 607, 589, 603, 594, 599, 592, 603, 2092, 2081, 2106, 2106, 2081, 2083, 1877, 1870, 1856, 1871, 1875, 1940, 1935, 1936, 1434, 1427, 1424, 1410, 2699, 2698, 2699, 2688, 2601, 2610, 2603, 2603, 2735, 2750, 2742, 2731, 2740, 2729, 2746, 2729, 2738, 2743, 2722, 2724, 2734, 2741, 2742, 2750, 2735, 2750, 2729, 2750, 2751, 1510, 1518, 1535, 1518, 1529, 1518, 1519, 3067, 3066, 3041, 3050, 3047, 3066, 3060, 3064, 3068, 3067, 3058, 1918, 1893, 1894, 1902, 1919, 1902, 1913, 1902, 1903, 897, 909, 908, 908, 903, 897, 918, 903, 902, 2824, 2825, 2834, 2841, 2836, 2819, 2839, 2835, 2831, 2836, 2819, 2818, 1543, 1564, 1541, 1541, 2102, 2109, 2103, 2092, 2103, 2108, 2096, 2086, 2110, 2102, 2109, 2087, 2433, 2458, 2435, 2435, 2835, 2846, 2846, 2845, 2836, 2832, 2847, 2587, 2560, 2584, 2583, 2576, 2567, 2306, 2309, 2307, 2328, 2335, 2326, 2454, 2457, 2453, 2461, 3283, 3288, 3282, 3273, 3289, 3284, 3292, 3283, 3285, 3266, 2842, 2845, 2847, 2833, 2838, 2823, 2839, 2842, 2834, 2845, 2843, 2828, 2200, 2195, 2201, 2178, 2204, 2191, 2191, 2204, 2180, 418, 421, 423, 425, 430, 447, 417, 434, 434, 417, 441};
    }

    public static final native void a(View view, int i);

    public static native int b(int i);

    public static native int c(View view);

    public static final native boolean d(int i);

    public static /* synthetic */ boolean e(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw null;
    }

    public static native float f(float f7, float f9, float f10, float f11);

    public static native int g(int i, int i5, int i9);

    public static native int h(int i, int i5, String str);

    public static native Rect i(AccessibilityNodeInfo accessibilityNodeInfo);

    public static native ClassCastException j(Iterator it);

    public static native String k(int i, int i5, String str, String str2);

    public static native String l(int i, String str);

    public static native String m(int i, String str, String str2);

    public static native String n(RecyclerView recyclerView, StringBuilder sb);

    public static native String o(String str, String str2);

    public static native String p(String str, String str2, String str3);

    public static native String q(StringBuilder sb, String str, String str2);

    public static /* synthetic */ void r(int i) {
        if (i != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        h7.h.g(nullPointerException, h7.h.class.getName());
        throw nullPointerException;
    }

    public static /* synthetic */ void s(int i, String str) {
        if (i == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = h7.h.class.getName();
            int i5 = 0;
            while (!stackTrace[i5].getClassName().equals(name)) {
                i5++;
            }
            while (stackTrace[i5].getClassName().equals(name)) {
                i5++;
            }
            StackTraceElement stackTraceElement = stackTrace[i5];
            NullPointerException nullPointerException = new NullPointerException(writer.bridge(f123short, 19, 48, 2394) + stackTraceElement.getClassName() + writer.bridge(f123short, 67, 1, 3130) + stackTraceElement.getMethodName() + alexrange.wolf(f123short, 68, 12, 3088) + str);
            h7.h.g(nullPointerException, h7.h.class.getName());
            throw nullPointerException;
        }
    }

    public static /* synthetic */ void t(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z8 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z8) {
                    executorService.shutdownNow();
                    z8 = true;
                }
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ String u(int i) {
        switch (i) {
            case 1:
                return alexguard.alexdelta(f123short, 128, 4, 2757);
            case 2:
                return writer.bridge(f123short, 124, 4, 1494);
            case 3:
                return writer.bridge(f123short, 121, 3, 1984);
            case 4:
                return store.alexraven(f123short, 116, 5, 1799);
            case 5:
                return writer.bridge(f123short, 110, 6, 2158);
            case 6:
                return locked.zone(f123short, 102, 8, 542);
            case 7:
                return store.alexraven(f123short, 96, 6, 1231);
            case CrashLog.$stable /* 8 */:
                return alexguard.alexdelta(f123short, 88, 8, 1700);
            case 9:
                return level.touch(f123short, 80, 8, 2057);
            default:
                throw null;
        }
    }

    public static /* synthetic */ String v(int i) {
        switch (i) {
            case 1:
                return locked.zone(f123short, 193, 12, 2886);
            case 2:
                return alexrange.wolf(f123short, 184, 9, 962);
            case 3:
                return alexguard.alexdelta(f123short, 175, 9, 1835);
            case 4:
                return alexguard.alexdelta(f123short, 164, 11, 2997);
            case 5:
                return eagle.queue(f123short, 157, 7, 1451);
            case 6:
                return locked.zone(f123short, 136, 21, 2811);
            default:
                return locked.zone(f123short, 132, 4, 2631);
        }
    }

    public static /* synthetic */ String w(int i) {
        switch (i) {
            case 1:
                return slow.anchor(f123short, 279, 11, 480);
            case 2:
                return alexwolf.alexrange(f123short, 270, 9, 2269);
            case 3:
                return eagle.queue(f123short, 258, 12, 2904);
            case 4:
                return alexrange.wolf(f123short, 248, 10, 3222);
            case 5:
                return slow.anchor(f123short, 244, 4, 2520);
            case 6:
                return slow.anchor(f123short, 238, 6, 2385);
            case 7:
                return slow.anchor(f123short, 232, 6, 2645);
            case CrashLog.$stable /* 8 */:
                return alexrange.wolf(f123short, 225, 7, 2897);
            case 9:
                return slow.anchor(f123short, 221, 4, 2511);
            case 10:
                return store.alexraven(f123short, 209, 12, 2163);
            default:
                return slow.anchor(f123short, 205, 4, 1641);
        }
    }
}
