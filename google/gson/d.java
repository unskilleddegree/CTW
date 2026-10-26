package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public final enum d extends h {
    @Override // com.google.gson.h
    public final String b(Field field) {
        return h.a(field.getName(), '_').toUpperCase(Locale.ENGLISH);
    }
}
