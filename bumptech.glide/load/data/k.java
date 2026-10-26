package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2178h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AssetManager assetManager, String str, int i) {
        super(0, str, assetManager);
        this.f2178h = i;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f2178h) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.b
    public final void g(Object obj) throws IOException {
        switch (this.f2178h) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.b
    public final Object h(AssetManager assetManager, String str) {
        switch (this.f2178h) {
            case 0:
                return assetManager.openFd(str);
            default:
                return assetManager.open(str);
        }
    }
}
