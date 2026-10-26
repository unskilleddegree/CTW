package com.google.android.gms.maps.model;

import a4.m;
import a4.u;
import android.os.Parcel;
import android.os.Parcelable;
import b4.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g6.b;
import java.util.Arrays;
import q2.e;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class CameraPosition extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new m(23);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LatLng f3032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f3033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f3034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f3035g;

    public CameraPosition(LatLng latLng, float f7, float f9, float f10) {
        u.c(latLng, "camera target must not be null.");
        boolean z8 = false;
        if (f9 >= 0.0f && f9 <= 90.0f) {
            z8 = true;
        }
        if (!z8) {
            throw new IllegalArgumentException("Tilt needs to be between 0 and 90 inclusive: " + f9);
        }
        this.f3032d = latLng;
        this.f3033e = f7;
        this.f3034f = f9 + 0.0f;
        this.f3035g = (((double) f10) <= 0.0d ? (f10 % 360.0f) + 360.0f : f10) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f3032d.equals(cameraPosition.f3032d) && Float.floatToIntBits(this.f3033e) == Float.floatToIntBits(cameraPosition.f3033e) && Float.floatToIntBits(this.f3034f) == Float.floatToIntBits(cameraPosition.f3034f) && Float.floatToIntBits(this.f3035g) == Float.floatToIntBits(cameraPosition.f3035g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3032d, Float.valueOf(this.f3033e), Float.valueOf(this.f3034f), Float.valueOf(this.f3035g)});
    }

    public final String toString() {
        e eVar = new e(this);
        eVar.b(this.f3032d, "target");
        eVar.b(Float.valueOf(this.f3033e), "zoom");
        eVar.b(Float.valueOf(this.f3034f), "tilt");
        eVar.b(Float.valueOf(this.f3035g), "bearing");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC = b.C(parcel, 20293);
        b.y(parcel, 2, this.f3032d, i);
        b.E(parcel, 3, 4);
        parcel.writeFloat(this.f3033e);
        b.E(parcel, 4, 4);
        parcel.writeFloat(this.f3034f);
        b.E(parcel, 5, 4);
        parcel.writeFloat(this.f3035g);
        b.D(parcel, iC);
    }
}
