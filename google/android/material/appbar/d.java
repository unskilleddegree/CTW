package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a1.c {
    public static final Parcelable.Creator<d> CREATOR = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3078h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3079j;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3076f = parcel.readByte() != 0;
        this.f3077g = parcel.readByte() != 0;
        this.f3078h = parcel.readInt();
        this.i = parcel.readFloat();
        this.f3079j = parcel.readByte() != 0;
    }

    @Override // a1.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f3076f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f3077g ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f3078h);
        parcel.writeFloat(this.i);
        parcel.writeByte(this.f3079j ? (byte) 1 : (byte) 0);
    }
}
