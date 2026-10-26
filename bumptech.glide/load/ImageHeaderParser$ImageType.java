package com.bumptech.glide.load;

import x2.d;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2159d;

    ImageHeaderParser$ImageType(boolean z8) {
        this.f2159d = z8;
    }

    public boolean hasAlpha() {
        return this.f2159d;
    }

    public boolean isWebp() {
        int i = d.f8353a[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
