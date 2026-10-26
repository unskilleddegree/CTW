package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f3354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ h[] f3355e;

    static {
        a aVar = new a();
        f3354d = aVar;
        f3355e = new h[]{aVar, new h() { // from class: com.google.gson.b
            @Override // com.google.gson.h
            public final String b(Field field) {
                return h.c(field.getName());
            }
        }, new h() { // from class: com.google.gson.c
            @Override // com.google.gson.h
            public final String b(Field field) {
                return h.c(h.a(field.getName(), ' '));
            }
        }, new h() { // from class: com.google.gson.d
            @Override // com.google.gson.h
            public final String b(Field field) {
                return h.a(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new h() { // from class: com.google.gson.e
            @Override // com.google.gson.h
            public final String b(Field field) {
                return h.a(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new h() { // from class: com.google.gson.f
            @Override // com.google.gson.h
            public final String b(Field field) {
                return h.a(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new h() { // from class: com.google.gson.g
            @Override // com.google.gson.h
            public final String b(Field field) {
                return h.a(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public static String a(String str, char c9) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c9);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String c(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    break;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f3355e.clone();
    }

    public abstract String b(Field field);
}
