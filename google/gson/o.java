package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;
import o6.a1;
import o6.n0;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            t6.b bVar = new t6.b(stringWriter);
            bVar.f7662k = 1;
            a1.f6436z.getClass();
            n0.d(bVar, this);
            return stringWriter.toString();
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }
}
