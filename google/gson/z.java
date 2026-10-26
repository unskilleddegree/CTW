package com.google.gson;

import java.io.IOException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f3378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w f3379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ z[] f3380f;

    static {
        v vVar = new v();
        f3378d = vVar;
        w wVar = new w();
        f3379e = wVar;
        f3380f = new z[]{vVar, wVar, new z() { // from class: com.google.gson.x
            public static Double b(String str, t6.a aVar) throws t6.c {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        if (aVar.f7652r != 1) {
                            throw new t6.c("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar.E(true));
                        }
                    }
                    return dValueOf;
                } catch (NumberFormatException e4) {
                    throw new s("Cannot parse " + str + "; at path " + aVar.E(true), e4);
                }
            }

            @Override // com.google.gson.z
            public final Number a(t6.a aVar) throws IOException {
                String strQ = aVar.Q();
                if (strQ.indexOf(46) >= 0) {
                    return b(strQ, aVar);
                }
                try {
                    return Long.valueOf(Long.parseLong(strQ));
                } catch (NumberFormatException unused) {
                    return b(strQ, aVar);
                }
            }
        }, new z() { // from class: com.google.gson.y
            @Override // com.google.gson.z
            public final Number a(t6.a aVar) throws IOException {
                String strQ = aVar.Q();
                try {
                    return n6.d.i(strQ);
                } catch (NumberFormatException e4) {
                    throw new s("Cannot parse " + strQ + "; at path " + aVar.E(true), e4);
                }
            }
        }};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f3380f.clone();
    }

    public abstract Number a(t6.a aVar);
}
