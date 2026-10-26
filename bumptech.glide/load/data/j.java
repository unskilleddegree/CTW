package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends FilterInputStream {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f2174f = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f2175g = 31;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte f2176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2177e;

    public j(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(com.ctwofficial.assistant.ui.setting.service.h.l(i, "Cannot add invalid orientation: "));
        }
        this.f2176d = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i;
        int i5;
        int i9 = this.f2177e;
        if (i9 < 2 || i9 > (i5 = f2175g)) {
            i = super.read();
        } else {
            i = i9 == i5 ? this.f2176d : f2174f[i9 - 2] & 255;
        }
        if (i != -1) {
            this.f2177e++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j3) throws IOException {
        long jSkip = super.skip(j3);
        if (jSkip > 0) {
            this.f2177e = (int) (((long) this.f2177e) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i5) throws IOException {
        int i9;
        int i10 = this.f2177e;
        int i11 = f2175g;
        if (i10 > i11) {
            i9 = super.read(bArr, i, i5);
        } else if (i10 == i11) {
            bArr[i] = this.f2176d;
            i9 = 1;
        } else if (i10 < 2) {
            i9 = super.read(bArr, i, 2 - i10);
        } else {
            int iMin = Math.min(i11 - i10, i5);
            System.arraycopy(f2174f, this.f2177e - 2, bArr, i, iMin);
            i9 = iMin;
        }
        if (i9 > 0) {
            this.f2177e += i9;
        }
        return i9;
    }
}
