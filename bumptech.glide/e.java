package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import m3.r;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ContextWrapper {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f2125k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3.g f2126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d.a f2127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n6.g f2128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y5.e f2129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f2130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s.e f2131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z2.m f2132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a6.e f2133h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p3.e f2134j;

    static {
        a aVar = new a();
        aVar.f2102d = r3.b.f7232a;
        f2125k = aVar;
    }

    public e(Context context, a3.g gVar, r rVar, n6.g gVar2, y5.e eVar, s.e eVar2, List list, z2.m mVar, a6.e eVar3) {
        super(context.getApplicationContext());
        this.f2126a = gVar;
        this.f2128c = gVar2;
        this.f2129d = eVar;
        this.f2130e = list;
        this.f2131f = eVar2;
        this.f2132g = mVar;
        this.f2133h = eVar3;
        this.i = 4;
        this.f2127b = new d.a(rVar);
    }

    public final i a() {
        return (i) this.f2127b.get();
    }
}
