package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b4.a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g6.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r1.e0;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new e0(6);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2995h;
    public final Uri i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f2996j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f2997k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f2998l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f2999m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f3000n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f3001o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HashSet f3002p = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j3, String str6, ArrayList arrayList, String str7, String str8) {
        this.f2991d = i;
        this.f2992e = str;
        this.f2993f = str2;
        this.f2994g = str3;
        this.f2995h = str4;
        this.i = uri;
        this.f2996j = str5;
        this.f2997k = j3;
        this.f2998l = str6;
        this.f2999m = arrayList;
        this.f3000n = str7;
        this.f3001o = str8;
    }

    public static GoogleSignInAccount a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j3 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        if (TextUtils.isEmpty(string)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j3, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f2996j = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f2998l.equals(this.f2998l)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f2999m);
        hashSet.addAll(googleSignInAccount.f3002p);
        HashSet hashSet2 = new HashSet(this.f2999m);
        hashSet2.addAll(this.f3002p);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.f2998l.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f2999m);
        hashSet.addAll(this.f3002p);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC = b.C(parcel, 20293);
        b.E(parcel, 1, 4);
        parcel.writeInt(this.f2991d);
        b.z(parcel, 2, this.f2992e);
        b.z(parcel, 3, this.f2993f);
        b.z(parcel, 4, this.f2994g);
        b.z(parcel, 5, this.f2995h);
        b.y(parcel, 6, this.i, i);
        b.z(parcel, 7, this.f2996j);
        b.E(parcel, 8, 8);
        parcel.writeLong(this.f2997k);
        b.z(parcel, 9, this.f2998l);
        b.B(parcel, 10, this.f2999m);
        b.z(parcel, 11, this.f3000n);
        b.z(parcel, 12, this.f3001o);
        b.D(parcel, iC);
    }
}
