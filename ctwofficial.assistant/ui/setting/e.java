package com.ctwofficial.assistant.ui.setting;

import com.ctwofficial.assistant.ui.setting.service.MyForegroundService;
import com.google.android.gms.maps.model.LatLng;
import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a7.h implements g7.p {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f89short;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2597h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f2598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2599k;

    static {
        Protect.classesInit0(83);
        f89short = new short[]{1544, 1546, 1543, 1543, 1611, 1567, 1540, 1611, 1612, 1561, 1550, 1560, 1566, 1542, 1550, 1612, 1611, 1545, 1550, 1549, 1540, 1561, 1550, 1611, 1612, 1538, 1541, 1565, 1540, 1536, 1550, 1612, 1611, 1564, 1538, 1567, 1539, 1611, 1544, 1540, 1561, 1540, 1566, 1567, 1538, 1541, 1550, 1527, 1525, 1528, 1528, 1460, 1504, 1531, 1460, 1459, 1510, 1521, 1511, 1505, 1529, 1521, 1459, 1460, 1526, 1521, 1522, 1531, 1510, 1521, 1460, 1459, 1533, 1530, 1506, 1531, 1535, 1521, 1459, 1460, 1507, 1533, 1504, 1532, 1460, 1527, 1531, 1510, 1531, 1505, 1504, 1533, 1530, 1521, 2546, 2558, 2349, 2351, 2338, 2338, 2414, 2362, 2337, 2414, 2409, 2364, 2347, 2365, 2363, 2339, 2347, 2409, 2414, 2348, 2347, 2344, 2337, 2364, 2347, 2414, 2409, 2343, 2336, 2360, 2337, 2341, 2347, 2409, 2414, 2361, 2343, 2362, 2342, 2414, 2349, 2337, 2364, 2337, 2363, 2362, 2343, 2336, 2347, 1626, 1624, 1618, 1630, 1618, 1625, 1624, 1615, 1658, 1613, 1614, 1224, 1219, 1220, 1230, 1219, 1220, 1229};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BlockZoneMapActivity blockZoneMapActivity, int i, String str, y6.d dVar) {
        super(2, dVar);
        this.f2597h = 0;
        this.f2598j = blockZoneMapActivity;
        this.i = i;
        this.f2599k = str;
        if (new Date().after(new Date(1796922002240L ^ 2496))) {
            System.exit(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(MyForegroundService myForegroundService, LatLng latLng, y6.d dVar) {
        super(2, dVar);
        this.f2597h = 1;
        this.f2598j = myForegroundService;
        this.f2599k = latLng;
        if (new Date().after(new Date(1796922003258L ^ 3514))) {
            System.exit(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, y6.d dVar, int i) {
        super(2, dVar);
        this.f2597h = i;
        this.f2599k = obj;
        if (new Date().after(new Date(1796922000008L ^ 8))) {
            System.exit(0);
        }
    }

    @Override // g7.p
    public final native Object c(Object obj, Object obj2);

    @Override // a7.a
    public final native y6.d g(Object obj, y6.d dVar);

    @Override // a7.a
    public final native Object h(Object obj);
}
