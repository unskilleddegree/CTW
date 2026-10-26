package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Comparable f2164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f2165g;

    public /* synthetic */ b(int i, Comparable comparable, Object obj) {
        this.f2162d = i;
        this.f2165g = obj;
        this.f2164f = comparable;
    }

    private final void c() {
    }

    private final void d() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        switch (this.f2162d) {
            case 0:
                Object obj = this.f2163e;
                if (obj != null) {
                    try {
                        g(obj);
                    } catch (IOException unused) {
                        return;
                    }
                    break;
                }
                break;
            default:
                Object obj2 = this.f2163e;
                if (obj2 != null) {
                    try {
                        g(obj2);
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i = this.f2162d;
    }

    @Override // com.bumptech.glide.load.data.e
    public final int e() {
        switch (this.f2162d) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void f(com.bumptech.glide.g gVar, d dVar) {
        switch (this.f2162d) {
            case 0:
                try {
                    Object objH = h((AssetManager) this.f2165g, (String) this.f2164f);
                    this.f2163e = objH;
                    dVar.d(objH);
                } catch (IOException e4) {
                    Log.isLoggable("AssetPathFetcher", 3);
                    dVar.c(e4);
                }
                break;
            default:
                try {
                    Object objI = i((Uri) this.f2164f, (ContentResolver) this.f2165g);
                    this.f2163e = objI;
                    dVar.d(objI);
                } catch (FileNotFoundException e7) {
                    Log.isLoggable("LocalUriFetcher", 3);
                    dVar.c(e7);
                    return;
                }
                break;
        }
    }

    public abstract void g(Object obj);

    public abstract Object h(AssetManager assetManager, String str);

    public abstract Object i(Uri uri, ContentResolver contentResolver);
}
