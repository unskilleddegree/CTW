package com.ctwofficial.assistant;

import android.view.View;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y0 implements View.OnClickListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f164short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ PermissionActivity f2985e;

    static {
        Protect.classesInit0(147);
        f164short = new short[]{649, 646, 652, 666, 647, 641, 652, 710, 664, 653, 666, 645, 641, 667, 667, 641, 647, 646, 710, 696, 679, 699, 700, 695, 678, 679, 700, 673, 686, 673, 683, 681, 700, 673, 679, 678, 699, 2630, 2628, 2645, 2674, 2645, 2643, 2632, 2639, 2630, 2569, 2575, 2575, 2575, 2568, 2704, 2719, 2709, 2691, 2718, 2712, 2709, 2783, 2689, 2708, 2691, 2716, 2712, 2690, 2690, 2712, 2718, 2719, 2783, 2736, 2738, 2738, 2740, 2722, 2722, 2734, 2743, 2744, 2751, 2740, 2734, 2749, 2750, 2738, 2736, 2725, 2744, 2750, 2751, 1112, 1108, 1439, 1433, 1423, 1432, 1461, 1434, 1432, 1423, 1420, 1433, 533, 535, 518, 545, 538, 531, 512, 535, 534, 546, 512, 535, 532, 535, 512, 535, 540, 529, 535, 513, 602, 604, 604, 604, 603, 1723, 1708, 1720, 1724, 1696, 1723, 1708, 1686, 1701, 1702, 1710, 1696, 1703, 3144, 3143, 3149, 3163, 3142, 3136, 3149, 3079, 3162, 3148, 3165, 3165, 3136, 3143, 3150, 3162, 3079, 3176, 3178, 3178, 3180, 3194, 3194, 3168, 3179, 3168, 3173, 3168, 3197, 3184, 3190, 3194, 3180, 3197, 3197, 3168, 3175, 3182, 3194, 1261, 1276, 1278, 1270, 1276, 1274, 1272, 1191, 760, 759, 765, 747, 758, 752, 765, 695, 746, 764, 749, 749, 752, 759, 766, 746, 695, 760, 762, 749, 752, 758, 759, 695, 724, 728, 727, 728, 734, 732, 710, 726, 719, 732, 715, 725, 728, 704, 710, 713, 732, 715, 724, 720, 714, 714, 720, 726, 727, 1069, 1058, 1064, 1086, 1059, 1061, 1064, 1122, 1087, 1065, 1080, 1080, 1061, 1058, 1067, 1087, 1122, 1037, 1052, 1052, 1024, 1029, 1039, 1037, 1048, 1029, 1027, 1026, 1043, 1032, 1033, 1048, 1037, 1029, 1024, 1055, 1043, 1055, 1033, 1048, 1048, 1029, 1026, 1035, 1055};
    }

    public /* synthetic */ y0(PermissionActivity permissionActivity, int i) {
        this.f2984d = i;
        this.f2985e = permissionActivity;
        if (new Date().after(new Date(1796921999542L ^ 566))) {
            System.exit(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
