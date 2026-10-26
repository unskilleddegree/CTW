package com.google.gson;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3360a;

    @Override // com.google.gson.a0
    public final Object a(t6.a aVar) throws IOException {
        switch (this.f3360a) {
            case 0:
                if (aVar.S() != 9) {
                    return Double.valueOf(aVar.J());
                }
                aVar.O();
                return null;
            case 1:
                if (aVar.S() != 9) {
                    return Float.valueOf((float) aVar.J());
                }
                aVar.O();
                return null;
            default:
                aVar.Y();
                return null;
        }
    }

    @Override // com.google.gson.a0
    public final void b(t6.b bVar, Object obj) throws IOException {
        switch (this.f3360a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    m.a(dDoubleValue);
                    bVar.K(dDoubleValue);
                } else {
                    bVar.F();
                }
                break;
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    m.a(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    bVar.M(numberValueOf);
                } else {
                    bVar.F();
                }
                break;
            default:
                bVar.F();
                break;
        }
    }

    public String toString() {
        switch (this.f3360a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
