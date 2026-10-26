package com.google.gson;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final enum x extends z {
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
}
