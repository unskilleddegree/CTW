package com.ctwofficial.assistant;

import android.content.Context;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z0 implements Runnable {

    /* JADX INFO: renamed from: short */
    private static final short[] f166short;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2988d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Context f2989e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f2990f;

    static {
        Protect.classesInit0(104);
        f166short = new short[]{1597, 1569, 1569, 1573, 1574, 1647, 1658, 1658, 1590, 1569, 1570, 1656, 1594, 1587, 1587, 1596, 1590, 1596, 1588, 1593, 1659, 1590, 1594, 1592, 1658, 1592, 1584, 1592, 1591, 1584, 1575, 1658, 1588, 1574, 1574, 1596, 1574, 1569, 1584, 1595, 1658, 1568, 1573, 1585, 1588, 1569, 1584, 1658, 1812, 1819, 1809, 1799, 1818, 1820, 1809, 1883, 1820, 1819, 1793, 1808, 1819, 1793, 1883, 1812, 1814, 1793, 1820, 1818, 1819, 1883, 1827, 1852, 1840, 1826};
    }

    public /* synthetic */ z0() {
        i13 = i;
        context8 = context;
        str12 = str;
        if (new Date().after(new Date(1796922005432L ^ 5432))) {
            System.exit(0);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
