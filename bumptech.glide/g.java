package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f2136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f2137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f2138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f2139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ g[] f2140h;

    static {
        g gVar = new g("IMMEDIATE", 0);
        f2136d = gVar;
        g gVar2 = new g("HIGH", 1);
        f2137e = gVar2;
        g gVar3 = new g("NORMAL", 2);
        f2138f = gVar3;
        g gVar4 = new g("LOW", 3);
        f2139g = gVar4;
        f2140h = new g[]{gVar, gVar2, gVar3, gVar4};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f2140h.clone();
    }
}
