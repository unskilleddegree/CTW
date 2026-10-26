package com.google.android.gms.maps;

import a4.m;
import android.app.Activity;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import b4.a;
import com.bumptech.glide.c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import g6.b;
import o4.f;
import q2.e;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class GoogleMapOptions extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new m(22);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Integer f3012x = Integer.valueOf(Color.argb(255, 236, 233, 225));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f3013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f3014e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CameraPosition f3016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f3017h;
    public Boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f3018j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f3019k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Boolean f3020l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Boolean f3021m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f3022n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Boolean f3023o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Boolean f3024p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Boolean f3028t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3031w;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3015f = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Float f3025q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Float f3026r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LatLngBounds f3027s = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Integer f3029u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f3030v = null;

    public static GoogleMapOptions a(Activity activity, AttributeSet attributeSet) {
        String string;
        LatLngBounds latLngBounds = null;
        if (attributeSet == null) {
            return null;
        }
        Resources resources = activity.getResources();
        int[] iArr = f.f6326a;
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, iArr);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (typedArrayObtainAttributes.hasValue(16)) {
            googleMapOptions.f3015f = typedArrayObtainAttributes.getInt(16, -1);
        }
        if (typedArrayObtainAttributes.hasValue(26)) {
            googleMapOptions.f3013d = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(26, false));
        }
        if (typedArrayObtainAttributes.hasValue(25)) {
            googleMapOptions.f3014e = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(25, false));
        }
        if (typedArrayObtainAttributes.hasValue(17)) {
            googleMapOptions.i = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(17, true));
        }
        if (typedArrayObtainAttributes.hasValue(19)) {
            googleMapOptions.f3021m = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(19, true));
        }
        if (typedArrayObtainAttributes.hasValue(21)) {
            googleMapOptions.f3028t = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(21, true));
        }
        if (typedArrayObtainAttributes.hasValue(20)) {
            googleMapOptions.f3018j = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(20, true));
        }
        if (typedArrayObtainAttributes.hasValue(22)) {
            googleMapOptions.f3020l = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(22, true));
        }
        if (typedArrayObtainAttributes.hasValue(24)) {
            googleMapOptions.f3019k = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(24, true));
        }
        if (typedArrayObtainAttributes.hasValue(23)) {
            googleMapOptions.f3017h = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(23, true));
        }
        if (typedArrayObtainAttributes.hasValue(13)) {
            googleMapOptions.f3022n = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(13, false));
        }
        if (typedArrayObtainAttributes.hasValue(18)) {
            googleMapOptions.f3023o = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(18, true));
        }
        if (typedArrayObtainAttributes.hasValue(0)) {
            googleMapOptions.f3024p = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(0, false));
        }
        if (typedArrayObtainAttributes.hasValue(4)) {
            googleMapOptions.f3025q = Float.valueOf(typedArrayObtainAttributes.getFloat(4, Float.NEGATIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(4)) {
            googleMapOptions.f3026r = Float.valueOf(typedArrayObtainAttributes.getFloat(3, Float.POSITIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(1)) {
            googleMapOptions.f3029u = Integer.valueOf(typedArrayObtainAttributes.getColor(1, f3012x.intValue()));
        }
        if (typedArrayObtainAttributes.hasValue(15) && (string = typedArrayObtainAttributes.getString(15)) != null && !string.isEmpty()) {
            googleMapOptions.f3030v = string;
        }
        if (typedArrayObtainAttributes.hasValue(14)) {
            googleMapOptions.f3031w = typedArrayObtainAttributes.getInt(14, 0);
        }
        TypedArray typedArrayObtainAttributes2 = activity.getResources().obtainAttributes(attributeSet, iArr);
        Float fValueOf = typedArrayObtainAttributes2.hasValue(11) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(11, 0.0f)) : null;
        Float fValueOf2 = typedArrayObtainAttributes2.hasValue(12) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(12, 0.0f)) : null;
        Float fValueOf3 = typedArrayObtainAttributes2.hasValue(9) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(9, 0.0f)) : null;
        Float fValueOf4 = typedArrayObtainAttributes2.hasValue(10) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(10, 0.0f)) : null;
        typedArrayObtainAttributes2.recycle();
        if (fValueOf != null && fValueOf2 != null && fValueOf3 != null && fValueOf4 != null) {
            latLngBounds = new LatLngBounds(new LatLng(fValueOf.floatValue(), fValueOf2.floatValue()), new LatLng(fValueOf3.floatValue(), fValueOf4.floatValue()));
        }
        googleMapOptions.f3027s = latLngBounds;
        TypedArray typedArrayObtainAttributes3 = activity.getResources().obtainAttributes(attributeSet, iArr);
        LatLng latLng = new LatLng(typedArrayObtainAttributes3.hasValue(5) ? typedArrayObtainAttributes3.getFloat(5, 0.0f) : 0.0f, typedArrayObtainAttributes3.hasValue(6) ? typedArrayObtainAttributes3.getFloat(6, 0.0f) : 0.0f);
        float f7 = typedArrayObtainAttributes3.hasValue(8) ? typedArrayObtainAttributes3.getFloat(8, 0.0f) : 0.0f;
        float f9 = typedArrayObtainAttributes3.hasValue(2) ? typedArrayObtainAttributes3.getFloat(2, 0.0f) : 0.0f;
        float f10 = typedArrayObtainAttributes3.hasValue(7) ? typedArrayObtainAttributes3.getFloat(7, 0.0f) : 0.0f;
        typedArrayObtainAttributes3.recycle();
        googleMapOptions.f3016g = new CameraPosition(latLng, f7, f10, f9);
        typedArrayObtainAttributes.recycle();
        return googleMapOptions;
    }

    public final String toString() {
        e eVar = new e(this);
        eVar.b(Integer.valueOf(this.f3015f), "MapType");
        eVar.b(this.f3022n, "LiteMode");
        eVar.b(this.f3016g, "Camera");
        eVar.b(this.i, "CompassEnabled");
        eVar.b(this.f3017h, "ZoomControlsEnabled");
        eVar.b(this.f3018j, "ScrollGesturesEnabled");
        eVar.b(this.f3019k, "ZoomGesturesEnabled");
        eVar.b(this.f3020l, "TiltGesturesEnabled");
        eVar.b(this.f3021m, "RotateGesturesEnabled");
        eVar.b(this.f3028t, "ScrollGesturesEnabledDuringRotateOrZoom");
        eVar.b(this.f3023o, "MapToolbarEnabled");
        eVar.b(this.f3024p, "AmbientEnabled");
        eVar.b(this.f3025q, "MinZoomPreference");
        eVar.b(this.f3026r, "MaxZoomPreference");
        eVar.b(this.f3029u, "BackgroundColor");
        eVar.b(this.f3027s, "LatLngBoundsForCameraTarget");
        eVar.b(this.f3013d, "ZOrderOnTop");
        eVar.b(this.f3014e, "UseViewLifecycleInFragment");
        eVar.b(Integer.valueOf(this.f3031w), "mapColorScheme");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC = b.C(parcel, 20293);
        byte bO = c.O(this.f3013d);
        b.E(parcel, 2, 4);
        parcel.writeInt(bO);
        byte bO2 = c.O(this.f3014e);
        b.E(parcel, 3, 4);
        parcel.writeInt(bO2);
        int i5 = this.f3015f;
        b.E(parcel, 4, 4);
        parcel.writeInt(i5);
        b.y(parcel, 5, this.f3016g, i);
        byte bO3 = c.O(this.f3017h);
        b.E(parcel, 6, 4);
        parcel.writeInt(bO3);
        byte bO4 = c.O(this.i);
        b.E(parcel, 7, 4);
        parcel.writeInt(bO4);
        byte bO5 = c.O(this.f3018j);
        b.E(parcel, 8, 4);
        parcel.writeInt(bO5);
        byte bO6 = c.O(this.f3019k);
        b.E(parcel, 9, 4);
        parcel.writeInt(bO6);
        byte bO7 = c.O(this.f3020l);
        b.E(parcel, 10, 4);
        parcel.writeInt(bO7);
        byte bO8 = c.O(this.f3021m);
        b.E(parcel, 11, 4);
        parcel.writeInt(bO8);
        byte bO9 = c.O(this.f3022n);
        b.E(parcel, 12, 4);
        parcel.writeInt(bO9);
        byte bO10 = c.O(this.f3023o);
        b.E(parcel, 14, 4);
        parcel.writeInt(bO10);
        byte bO11 = c.O(this.f3024p);
        b.E(parcel, 15, 4);
        parcel.writeInt(bO11);
        b.w(parcel, 16, this.f3025q);
        b.w(parcel, 17, this.f3026r);
        b.y(parcel, 18, this.f3027s, i);
        byte bO12 = c.O(this.f3028t);
        b.E(parcel, 19, 4);
        parcel.writeInt(bO12);
        Integer num = this.f3029u;
        if (num != null) {
            b.E(parcel, 20, 4);
            parcel.writeInt(num.intValue());
        }
        b.z(parcel, 21, this.f3030v);
        int i9 = this.f3031w;
        b.E(parcel, 23, 4);
        parcel.writeInt(i9);
        b.D(parcel, iC);
    }
}
