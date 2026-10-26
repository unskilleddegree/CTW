package com.ctwofficial.assistant;

import java.io.IOException;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class q implements y7.d {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f67short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ChatActivity f2542e;

    static {
        Protect.classesInit0(178);
        f67short = new short[]{1136, 1149, 1127, 1124, 1144, 1141, 1133, 1099, 1146, 1141, 1145, 1137, 2984, 2989, 3000, 2989, 2656, 2662, 2672, 2672, 2678, 2656, 2656, 1948, 1923, 1927, 1952, 1927, 1921, 1946, 1949, 1940, 2011, 2013, 2013, 2013, 2010, 1852, 1841, 1373, 1365, 1347, 1347, 1361, 1367, 1365, 1369, 1358, 1354, 1351, 1396, 1350, 1358, 1350, 1353, 1358, 1369, 1396, 1346, 1359, 1285, 1311, 1331, 1288, 1289, 1280, 1289, 1304, 1289, 1288, 1064, 727, 724, 728, 730, 719, 722, 724, 725, 740, 727, 730, 729, 734, 727, 2543, 2558, 2537, 2541, 2552, 2537, 2536, 2515, 2541, 2552, 793, 784, 770, 814, 769, 771, 798, 791, 792, 797, 788, 2604, 2595, 2602, 2602, 2594, 2617, 2604, 2578, 2596, 2601, 1030, 1035, 1049, 1054, 1077, 1048, 1039, 1035, 1038, 1077, 1027, 1038};
    }

    public /* synthetic */ q(ChatActivity chatActivity, int i) {
        this.f2541d = i;
        this.f2542e = chatActivity;
        if (new Date().after(new Date(1796921999499L ^ 523))) {
            System.exit(0);
        }
    }

    private final native void a(c8.j jVar, IOException iOException);

    private final native void b(c8.j jVar, IOException iOException);

    @Override // y7.d
    public final native void g(c8.j jVar, y7.x xVar);

    @Override // y7.d
    public final native void i(c8.j jVar, IOException iOException);
}
