package com.ctwofficial.assistant;

import android.annotation.SuppressLint;
import android.os.Bundle;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"CustomSplashScreen"})
public final class SplashActivity extends h.k {
    public static final /* synthetic */ int D = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f10short;
    public a4.c B;
    public boolean C;

    static {
        Protect.classesInit0(62);
        f10short = new short[]{1679, 1722, 1713, 1720, 1720, 1706, 1713, 1726, 1791, 1682, 1722, 1714, 1725, 1706, 1716, 1726, 1791, 1694, 1708, 1708, 1718, 1708, 1707, 1722, 1713, 1791, 1692, 1675, 1672, 1791, 1783, 1676, 1711, 1715, 1726, 1708, 1719, 1782, 1816, 1833, 1845, 1840, 1842, 1848, 1834, 1840, 1913, 1853, 1840, 1844, 1836, 1845, 1848, 1840, 1913, 1833, 1848, 1853, 1848, 1913, 1802, 1833, 1845, 1848, 1834, 1841, 1816, 1850, 1837, 1840, 1839, 1840, 1837, 1824, 973, 978, 967, 972, 1021, 963, 978, 978, 640, 651, 652, 646, 651, 652, 645, 658, 656, 641, 679, 666, 666, 641, 733, 731, 731, 731, 732, 955, 939, 937, 932, 941, 912, 1967, 1983, 1981, 1968, 1977, 1925, 2447, 2434, 2462, 2438, 2447, 2758, 2786, 2808, 2808, 2786, 2789, 2796, 2731, 2809, 2798, 2810, 2814, 2786, 2809, 2798, 2799, 2731, 2813, 2786, 2798, 2812, 2731, 2812, 2786, 2815, 2787, 2731, 2754, 2767, 2737, 2731};
    }

    public SplashActivity() {
        if (new Date().after(new Date(1796922006280L ^ 6536))) {
            System.exit(0);
        }
    }

    @Override // h.k, c.p, f0.i, android.app.Activity
    public final native void onCreate(Bundle bundle);
}
