package com.ctwofficial.assistant.ui.setting.service;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.ctwofficial.assistant.databinding.slow;
import com.ctwofficial.assistant.proteksi.alexguard;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class BootInitWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f105short;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f2718k;

    static {
        Protect.classesInit0(195);
        f105short = new short[]{1555, 1540, 1544, 1503, 1486, 1501, 1486, 1474, 1500, 1650, 1662, 1660, 1599, 1650, 1637, 1638, 1662, 1655, 1655, 1656, 1650, 1656, 1648, 1661, 1599, 1648, 1634, 1634, 1656, 1634, 1637, 1648, 1663, 1637, 1599, 1648, 1650, 1637, 1656, 1662, 1663, 1599, 1602, 1605, 1616, 1603, 1605, 2841, 2831, 2846, 2859, 2825, 2846, 2819, 2821, 2820, 2882, 2884, 2884, 2884, 2883, 717, 740, 761, 750, 748, 761, 740, 766, 741, 751, 728, 750, 761, 765, 738, 744, 750, 712, 739, 746, 741, 741, 750, 743, 1325, 1338, 1318, 1315, 1323, 1383, 1377, 1377, 1377, 1382, 800, 815, 805, 819, 814, 808, 805, 879, 818, 820, 817, 817, 814, 819, 821, 879, 820, 818, 804, 786, 808, 805, 804, 770, 809, 800, 815, 815, 804, 813};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BootInitWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        h7.h.e(context, alexguard.alexdelta(f105short, 0, 3, 1648));
        h7.h.e(workerParameters, slow.anchor(f105short, 3, 6, 1455));
        this.f2718k = context;
        if (new Date().after(new Date(1796922001012L ^ 1268))) {
            System.exit(0);
        }
    }

    @Override // androidx.work.CoroutineWorker
    public final native h2.m f();
}
