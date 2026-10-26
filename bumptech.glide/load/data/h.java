package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2170a;

    @Override // com.bumptech.glide.load.data.f
    public final Class a() {
        switch (this.f2170a) {
            case 0:
                throw new UnsupportedOperationException("Not implemented");
            case 1:
                return ParcelFileDescriptor.class;
            default:
                return ByteBuffer.class;
        }
    }

    @Override // com.bumptech.glide.load.data.f
    public final g b(Object obj) {
        switch (this.f2170a) {
            case 0:
                return new i(obj);
            case 1:
                return new i((ParcelFileDescriptor) obj);
            default:
                return new g3.i((ByteBuffer) obj, 3);
        }
    }
}
