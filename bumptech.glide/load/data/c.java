package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FileOutputStream f2166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f2167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a3.g f2168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2169g;

    public c(FileOutputStream fileOutputStream, a3.g gVar) {
        this.f2166d = fileOutputStream;
        this.f2168f = gVar;
        this.f2167e = (byte[]) gVar.c(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f2166d;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f2167e;
            if (bArr != null) {
                this.f2168f.g(bArr);
                this.f2167e = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f2169g;
        FileOutputStream fileOutputStream = this.f2166d;
        if (i > 0) {
            fileOutputStream.write(this.f2167e, 0, i);
            this.f2169g = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f2167e;
        int i5 = this.f2169g;
        int i9 = i5 + 1;
        this.f2169g = i9;
        bArr[i5] = (byte) i;
        if (i9 != bArr.length || i9 <= 0) {
            return;
        }
        this.f2166d.write(bArr, 0, i9);
        this.f2169g = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i5) throws IOException {
        int i9 = 0;
        do {
            int i10 = i5 - i9;
            int i11 = i + i9;
            int i12 = this.f2169g;
            FileOutputStream fileOutputStream = this.f2166d;
            if (i12 == 0 && i10 >= this.f2167e.length) {
                fileOutputStream.write(bArr, i11, i10);
                return;
            }
            int iMin = Math.min(i10, this.f2167e.length - i12);
            System.arraycopy(bArr, i11, this.f2167e, this.f2169g, iMin);
            int i13 = this.f2169g + iMin;
            this.f2169g = i13;
            i9 += iMin;
            byte[] bArr2 = this.f2167e;
            if (i13 == bArr2.length && i13 > 0) {
                fileOutputStream.write(bArr2, 0, i13);
                this.f2169g = 0;
            }
        } while (i9 < i5);
    }
}
