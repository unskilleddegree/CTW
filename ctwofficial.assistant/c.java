package com.ctwofficial.assistant;

import java.util.Date;
import np.manager.Protect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements g7.l {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f16short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ChatActivity f2272e;

    static {
        Protect.classesInit0(160);
        f16short = new short[]{1741, 1730, 1742, 1734, 1783, 1740, 1777, 1734, 1747, 1743, 1754, 1552, 1537, 1592, 1552, 1542, 1542, 1556, 1554, 1552, 1774, 1373, 1963, 1964, 1970, 1975, 1974, 1949, 1967, 1959, 1974, 1962, 1965, 1958, 1582, 1589, 1580, 1580, 1632, 1571, 1569, 1582, 1582, 1583, 1588, 1632, 1570, 1573, 1632, 1571, 1569, 1587, 1588, 1632, 1588, 1583, 1632, 1582, 1583, 1582, 1645, 1582, 1589, 1580, 1580, 1632, 1588, 1593, 1584, 1573, 1632, 1569, 1582, 1572, 1586, 1583, 1577, 1572, 1646, 1590, 1577, 1573, 1591, 1646, 1577, 1582, 1584, 1589, 1588, 1581, 1573, 1588, 1576, 1583, 1572, 1646, 1545, 1582, 1584, 1589, 1588, 1549, 1573, 1588, 1576, 1583, 1572, 1549, 1569, 1582, 1569, 1575, 1573, 1586, 2869, 713};
    }

    public /* synthetic */ c(ChatActivity chatActivity, int i) {
        this.f2271d = i;
        this.f2272e = chatActivity;
        if (new Date().after(new Date(1796922003242L ^ 3498))) {
            System.exit(0);
        }
    }

    @Override // g7.l
    public final native Object d(Object obj);
}
