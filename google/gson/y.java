package com.google.gson;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final enum y extends z {
    @Override // com.google.gson.z
    public final Number a(t6.a aVar) throws IOException {
        String strQ = aVar.Q();
        try {
            return n6.d.i(strQ);
        } catch (NumberFormatException e4) {
            throw new s("Cannot parse " + strQ + "; at path " + aVar.E(true), e4);
        }
    }
}
