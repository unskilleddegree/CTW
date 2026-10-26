package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import g3.w;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f2171f = new h(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f2173e;

    public i() {
        this.f2172d = 0;
        this.f2173e = new HashMap();
    }

    private final void a() {
    }

    private final void d() {
    }

    @Override // com.bumptech.glide.load.data.g
    public void b() {
        switch (this.f2172d) {
            case 1:
            case 2:
                break;
            default:
                ((w) this.f2173e).c();
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.g
    public Object c() {
        switch (this.f2172d) {
            case 1:
                return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f2173e).rewind();
            case 2:
                return this.f2173e;
            default:
                w wVar = (w) this.f2173e;
                wVar.reset();
                return wVar;
        }
    }

    public ParcelFileDescriptor e() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f2173e).rewind();
    }

    public i(InputStream inputStream, a3.g gVar) {
        this.f2172d = 3;
        w wVar = new w(inputStream, gVar);
        this.f2173e = wVar;
        wVar.mark(5242880);
    }

    public i(ParcelFileDescriptor parcelFileDescriptor) {
        this.f2172d = 1;
        this.f2173e = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public i(Object obj) {
        this.f2172d = 2;
        this.f2173e = obj;
    }
}
