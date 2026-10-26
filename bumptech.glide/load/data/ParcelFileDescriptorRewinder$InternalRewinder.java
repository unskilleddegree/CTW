package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
final class ParcelFileDescriptorRewinder$InternalRewinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParcelFileDescriptor f2160a;

    public ParcelFileDescriptorRewinder$InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f2160a = parcelFileDescriptor;
    }

    public ParcelFileDescriptor rewind() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = this.f2160a;
        try {
            Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
            return parcelFileDescriptor;
        } catch (ErrnoException e4) {
            throw new IOException(e4);
        }
    }
}
