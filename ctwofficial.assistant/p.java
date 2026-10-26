package com.ctwofficial.assistant;

import java.util.Date;
import np.manager.Protect;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f36short;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f2414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f2415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ChatActivity f2416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ JSONObject f2417g;

    static {
        Protect.classesInit0(179);
        f36short = new short[]{1467, 1465, 1444, 1452, 1465, 1454, 1464, 1464, 1415, 1444, 1450, 1455, 1442, 1445, 1452, 1572, 1580, 1594, 1594, 1576, 1582, 1580};
    }

    public /* synthetic */ p(boolean z8, boolean z9, ChatActivity chatActivity, JSONObject jSONObject) {
        this.f2414d = z8;
        this.f2415e = z9;
        this.f2416f = chatActivity;
        this.f2417g = jSONObject;
        if (new Date().after(new Date(1796922009286L ^ 9286))) {
            System.exit(0);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
