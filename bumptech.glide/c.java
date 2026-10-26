package com.bumptech.glide;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.ActionBar;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.ctwofficial.assistant.R;
import h.o;
import i2.q;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n.a1;
import r0.u0;
import r0.v0;
import x0.p;
import x0.r;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f2111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f2112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f2113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f2114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f2115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f2116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Field f2117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f2118h;
    public static boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Method f2119j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f2120k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Field f2121l;

    /* JADX WARN: Code duplicated, block: B:18:0x00a6  */
    public static long D(int i5, String str) {
        int i9 = i(str, 0, i5, false);
        Matcher matcher = y7.i.f8767m.matcher(str);
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int iH = -1;
        int i13 = -1;
        int i14 = -1;
        while (i9 < i5) {
            int i15 = i(str, i9 + 1, i5, true);
            matcher.region(i9, i15);
            if (i11 == -1 && matcher.usePattern(y7.i.f8767m).matches()) {
                String strGroup = matcher.group(1);
                h7.h.d(strGroup, "matcher.group(1)");
                i11 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                h7.h.d(strGroup2, "matcher.group(2)");
                i13 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                h7.h.d(strGroup3, "matcher.group(3)");
                i14 = Integer.parseInt(strGroup3);
            } else if (i12 == -1 && matcher.usePattern(y7.i.f8766l).matches()) {
                String strGroup4 = matcher.group(1);
                h7.h.d(strGroup4, "matcher.group(1)");
                i12 = Integer.parseInt(strGroup4);
            } else if (iH == -1) {
                Pattern pattern = y7.i.f8765k;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    h7.h.d(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    h7.h.d(locale, "US");
                    String lowerCase = strGroup5.toLowerCase(locale);
                    h7.h.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = pattern.pattern();
                    h7.h.d(strPattern, "MONTH_PATTERN.pattern()");
                    iH = p7.g.H(strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i10 != -1 && matcher.usePattern(y7.i.f8764j).matches()) {
                    String strGroup6 = matcher.group(1);
                    h7.h.d(strGroup6, "matcher.group(1)");
                    i10 = Integer.parseInt(strGroup6);
                }
            } else if (i10 != -1) {
            }
            i9 = i(str, i15 + 1, i5, false);
        }
        if (70 <= i10 && i10 < 100) {
            i10 += 1900;
        }
        if (i10 >= 0 && i10 < 70) {
            i10 += 2000;
        }
        if (i10 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iH == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i12 || i12 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i11 < 0 || i11 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i13 < 0 || i13 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i14 < 0 || i14 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(z7.b.f9216e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i10);
        gregorianCalendar.set(2, iH - 1);
        gregorianCalendar.set(5, i12);
        gregorianCalendar.set(11, i11);
        gregorianCalendar.set(12, i13);
        gregorianCalendar.set(13, i14);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static void E(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Animator animator = (Animator) arrayList.get(i5);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static void F(TextView textView, int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            p.d(textView, i5);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i9 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i5 > Math.abs(i9)) {
            textView.setPadding(textView.getPaddingLeft(), i5 + i9, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void G(TextView textView, int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i9 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i5 > Math.abs(i9)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i5 - i9);
        }
    }

    public static void H(TextView textView, int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException();
        }
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i5 != fontMetricsInt) {
            textView.setLineSpacing(i5 - fontMetricsInt, 1.0f);
        }
    }

    public static ActionMode.Callback K(ActionMode.Callback callback) {
        return (!(callback instanceof r) || Build.VERSION.SDK_INT < 26) ? callback : ((r) callback).f8318a;
    }

    public static ActionMode.Callback N(ActionMode.Callback callback, TextView textView) {
        int i5 = Build.VERSION.SDK_INT;
        return (i5 < 26 || i5 > 27 || (callback instanceof r) || callback == null) ? callback : new r(callback, textView);
    }

    public static byte O(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    public static Boolean P(byte b9) {
        if (b9 == 0) {
            return Boolean.FALSE;
        }
        if (b9 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    public static void a(long j3, l8.e eVar, int i5, ArrayList arrayList, int i9, int i10, ArrayList arrayList2) {
        int i11;
        int i12;
        ArrayList arrayList3;
        long j7;
        int i13;
        int i14 = i5;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i9 >= i10) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i15 = i9; i15 < i10; i15++) {
            if (((l8.h) arrayList4.get(i15)).a() < i14) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        l8.h hVar = (l8.h) arrayList.get(i9);
        l8.h hVar2 = (l8.h) arrayList4.get(i10 - 1);
        if (i14 == hVar.a()) {
            int iIntValue = ((Number) arrayList5.get(i9)).intValue();
            int i16 = i9 + 1;
            l8.h hVar3 = (l8.h) arrayList4.get(i16);
            i11 = i16;
            i12 = iIntValue;
            hVar = hVar3;
        } else {
            i11 = i9;
            i12 = -1;
        }
        if (hVar.d(i14) == hVar2.d(i14)) {
            int iMin = Math.min(hVar.a(), hVar2.a());
            int i17 = 0;
            for (int i18 = i14; i18 < iMin && hVar.d(i18) == hVar2.d(i18); i18++) {
                i17++;
            }
            long j8 = 4;
            long j9 = (eVar.f5457e / j8) + j3 + ((long) 2) + ((long) i17) + 1;
            eVar.M(-i17);
            eVar.M(i12);
            int i19 = i14 + i17;
            while (i14 < i19) {
                eVar.M(hVar.d(i14) & 255);
                i14++;
            }
            if (i11 + 1 == i10) {
                if (i19 != ((l8.h) arrayList4.get(i11)).a()) {
                    throw new IllegalStateException("Check failed.");
                }
                eVar.M(((Number) arrayList5.get(i11)).intValue());
                return;
            } else {
                l8.e eVar2 = new l8.e();
                eVar.M(((int) ((eVar2.f5457e / j8) + j9)) * (-1));
                a(j9, eVar2, i19, arrayList4, i11, i10, arrayList5);
                eVar.I(eVar2);
                return;
            }
        }
        int i20 = 1;
        for (int i21 = i11 + 1; i21 < i10; i21++) {
            if (((l8.h) arrayList4.get(i21 - 1)).d(i14) != ((l8.h) arrayList4.get(i21)).d(i14)) {
                i20++;
            }
        }
        long j10 = 4;
        long j11 = (eVar.f5457e / j10) + j3 + ((long) 2) + ((long) (i20 * 2));
        eVar.M(i20);
        eVar.M(i12);
        for (int i22 = i11; i22 < i10; i22++) {
            int iD = ((l8.h) arrayList4.get(i22)).d(i14);
            if (i22 == i11 || iD != ((l8.h) arrayList4.get(i22 - 1)).d(i14)) {
                eVar.M(iD & 255);
            }
        }
        l8.e eVar3 = new l8.e();
        int i23 = i11;
        while (i23 < i10) {
            byte bD = ((l8.h) arrayList4.get(i23)).d(i14);
            int i24 = i23 + 1;
            int i25 = i24;
            while (true) {
                if (i25 >= i10) {
                    i25 = i10;
                    break;
                } else if (bD != ((l8.h) arrayList4.get(i25)).d(i14)) {
                    break;
                } else {
                    i25++;
                }
            }
            if (i24 == i25 && i14 + 1 == ((l8.h) arrayList4.get(i23)).a()) {
                eVar.M(((Number) arrayList5.get(i23)).intValue());
                arrayList3 = arrayList5;
                j7 = j11;
                i13 = i25;
            } else {
                eVar.M(((int) ((eVar3.f5457e / j10) + j11)) * (-1));
                arrayList3 = arrayList5;
                j7 = j11;
                i13 = i25;
                a(j7, eVar3, i14 + 1, arrayList, i23, i13, arrayList3);
                arrayList4 = arrayList;
            }
            j11 = j7;
            i23 = i13;
            arrayList5 = arrayList3;
        }
        eVar.I(eVar3);
    }

    public static void f(s7.e eVar) {
        eVar.g(null, false);
    }

    public static final void g(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                p4.c.b(th, th2);
            }
        }
    }

    public static final q h(Context context, c8.f fVar) {
        s1.h hVar;
        boolean zContainsKey;
        int i5;
        h7.h.e(context, "context");
        q2.i iVar = new q2.i((ExecutorService) fVar.f2048e);
        Context applicationContext = context.getApplicationContext();
        h7.h.d(applicationContext, "context.applicationContext");
        o oVar = (o) iVar.f6716e;
        h7.h.d(oVar, "workTaskExecutor.serialTaskExecutor");
        h2.p pVar = (h2.p) fVar.f2049f;
        boolean z8 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        h7.h.e(pVar, "clock");
        int i9 = 6;
        if (z8) {
            hVar = new s1.h(applicationContext, null);
            hVar.i = true;
        } else {
            if (p7.g.J("androidx.work.workdb")) {
                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            }
            s1.h hVar2 = new s1.h(applicationContext, "androidx.work.workdb");
            hVar2.f7386h = new c6.m(i9, applicationContext);
            hVar = hVar2;
        }
        hVar.f7384f = oVar;
        i2.b bVar = new i2.b(pVar);
        ArrayList arrayList = hVar.f7381c;
        arrayList.add(bVar);
        hVar.a(i2.e.f4875h);
        hVar.a(new i2.h(applicationContext, 2, 3));
        hVar.a(i2.e.i);
        hVar.a(i2.e.f4876j);
        hVar.a(new i2.h(applicationContext, 5, 6));
        hVar.a(i2.e.f4877k);
        hVar.a(i2.e.f4878l);
        hVar.a(i2.e.f4879m);
        hVar.a(new i2.h(applicationContext));
        hVar.a(new i2.h(applicationContext, 10, 11));
        hVar.a(i2.e.f4871d);
        hVar.a(i2.e.f4872e);
        hVar.a(i2.e.f4873f);
        hVar.a(i2.e.f4874g);
        hVar.f7388k = false;
        hVar.f7389l = true;
        Executor executor = hVar.f7384f;
        if (executor == null && hVar.f7385g == null) {
            o.a aVar = o.b.f6276f;
            hVar.f7385g = aVar;
            hVar.f7384f = aVar;
        } else if (executor != null && hVar.f7385g == null) {
            hVar.f7385g = executor;
        } else if (executor == null) {
            hVar.f7384f = hVar.f7385g;
        }
        HashSet hashSet = hVar.f7393p;
        LinkedHashSet linkedHashSet = hVar.f7392o;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                    throw new IllegalArgumentException(com.ctwofficial.assistant.ui.setting.service.h.l(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                }
            }
        }
        w1.b eVar = hVar.f7386h;
        if (eVar == null) {
            eVar = new n6.e();
        }
        w1.b bVar2 = eVar;
        if (hVar.f7390m > 0) {
            if (hVar.f7380b != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        boolean z9 = hVar.i;
        int i10 = hVar.f7387j;
        if (i10 == 0) {
            throw null;
        }
        Context context2 = hVar.f7379a;
        if (i10 == 1) {
            Object systemService = context2.getSystemService("activity");
            h7.h.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            i10 = !((ActivityManager) systemService).isLowRamDevice() ? 3 : 2;
        }
        Executor executor2 = hVar.f7384f;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = hVar.f7385g;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        boolean z10 = hVar.f7388k;
        boolean z11 = hVar.f7389l;
        String str = hVar.f7380b;
        s1.i iVar2 = hVar.f7391n;
        int i11 = i10;
        ArrayList arrayList2 = hVar.f7382d;
        ArrayList arrayList3 = hVar.f7383e;
        s1.b bVar3 = new s1.b(context2, str, bVar2, iVar2, arrayList, z9, i11, executor2, executor3, z10, z11, linkedHashSet, arrayList2, arrayList3);
        Package r12 = WorkDatabase.class.getPackage();
        h7.h.b(r12);
        String name = r12.getName();
        String canonicalName = WorkDatabase.class.getCanonicalName();
        h7.h.b(canonicalName);
        h7.h.d(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            h7.h.d(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String strConcat = p7.n.v(canonicalName, '.', '_').concat("_Impl");
        try {
            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, WorkDatabase.class.getClassLoader());
            h7.h.c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            WorkDatabase workDatabase = (WorkDatabase) cls.newInstance();
            s1.f fVar2 = workDatabase.f1312d;
            LinkedHashMap linkedHashMap = workDatabase.f1315g;
            workDatabase.f1311c = workDatabase.e(bVar3);
            Set<Class> setI = workDatabase.i();
            BitSet bitSet = new BitSet();
            for (Class cls2 : setI) {
                int size = arrayList3.size() - 1;
                if (size < 0) {
                    i5 = -1;
                    break;
                }
                while (true) {
                    i5 = size;
                    size = i5 - 1;
                    if (cls2.isAssignableFrom(arrayList3.get(i5).getClass())) {
                        bitSet.set(i5);
                        break;
                    }
                    if (size < 0) {
                        i5 = -1;
                        break;
                    }
                }
                if (i5 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + cls2.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                linkedHashMap.put(cls2, arrayList3.get(i5));
            }
            int size2 = arrayList3.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i12 = size2 - 1;
                    if (!bitSet.get(size2)) {
                        throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                    }
                    if (i12 < 0) {
                        break;
                    }
                    size2 = i12;
                }
            }
            for (t1.a aVar2 : workDatabase.g(linkedHashMap)) {
                int i13 = aVar2.f7601a;
                int i14 = aVar2.f7602b;
                LinkedHashMap linkedHashMap2 = iVar2.f7394a;
                if (linkedHashMap2.containsKey(Integer.valueOf(i13))) {
                    Map map = (Map) linkedHashMap2.get(Integer.valueOf(i13));
                    if (map == null) {
                        map = v6.r.f7924d;
                    }
                    zContainsKey = map.containsKey(Integer.valueOf(i14));
                } else {
                    zContainsKey = false;
                }
                if (!zContainsKey) {
                    iVar2.a(aVar2);
                }
            }
            workDatabase.h().setWriteAheadLoggingEnabled(bVar3.f7360g == 3);
            workDatabase.f1314f = bVar3.f7358e;
            workDatabase.f1310b = bVar3.f7361h;
            h7.h.e(bVar3.i, "executor");
            new ArrayDeque();
            workDatabase.f1313e = bVar3.f7359f;
            Map mapJ = workDatabase.j();
            BitSet bitSet2 = new BitSet();
            for (Map.Entry entry : mapJ.entrySet()) {
                Class cls3 = (Class) entry.getKey();
                for (Class cls4 : (List) entry.getValue()) {
                    int size3 = arrayList2.size() - 1;
                    if (size3 < 0) {
                        size3 = -1;
                        break;
                    }
                    while (true) {
                        int i15 = size3 - 1;
                        if (cls4.isAssignableFrom(arrayList2.get(size3).getClass())) {
                            bitSet2.set(size3);
                            break;
                        }
                        if (i15 < 0) {
                            size3 = -1;
                            break;
                        }
                        size3 = i15;
                    }
                    if (!(size3 >= 0)) {
                        throw new IllegalArgumentException(("A required type converter (" + cls4 + ") for " + cls3.getCanonicalName() + " is missing in the database configuration.").toString());
                    }
                    workDatabase.f1317j.put(cls4, arrayList2.get(size3));
                }
            }
            int size4 = arrayList2.size() - 1;
            if (size4 >= 0) {
                while (true) {
                    int i16 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + arrayList2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i16 >= 0) {
                        size4 = i16;
                    }
                }
            }
            Context applicationContext2 = context.getApplicationContext();
            h7.h.d(applicationContext2, "context.applicationContext");
            q2.i iVar3 = new q2.i(applicationContext2, iVar);
            i2.g gVar = new i2.g(context.getApplicationContext(), fVar, iVar, workDatabase);
            int i17 = i2.k.f4900a;
            l2.b bVar4 = new l2.b(context, workDatabase, fVar);
            r2.m.a(context, SystemJobService.class, true);
            h2.p.a().getClass();
            return new q(context.getApplicationContext(), fVar, iVar, workDatabase, v6.j.x(bVar4, new j2.c(context, fVar, iVar3, gVar, new q2.e(gVar, iVar), iVar)), gVar, iVar3);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + strConcat + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + WorkDatabase.class + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + WorkDatabase.class + ".canonicalName");
        }
    }

    public static int i(String str, int i5, int i9, boolean z8) {
        while (i5 < i9) {
            char cCharAt = str.charAt(i5);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z8)) {
                return i5;
            }
            i5++;
        }
        return i9;
    }

    public static boolean j(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = v0.f7028a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = u0.f7024d;
        u0 u0Var = (u0) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (u0Var == null) {
            u0Var = new u0();
            u0Var.f7025a = null;
            u0Var.f7026b = null;
            u0Var.f7027c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, u0Var);
        }
        WeakReference weakReference2 = u0Var.f7027c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        u0Var.f7027c = new WeakReference(keyEvent);
        if (u0Var.f7026b == null) {
            u0Var.f7026b = new SparseArray();
        }
        SparseArray sparseArray = u0Var.f7026b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static boolean k(r0.l lVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (lVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return lVar.b(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!i) {
                            try {
                                f2119j = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            i = true;
                        }
                        Method method = f2119j;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (v0.b(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f2120k) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f2121l = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f2120k = true;
                }
                Field field = f2121l;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (v0.b(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && v0.b(view, keyEvent)) || lVar.b(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static p0.d t(a1 a1Var) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            return new p0.d(p.c(a1Var));
        }
        TextPaint textPaint = new TextPaint(a1Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int iA = x0.n.a(a1Var);
        int iD = x0.n.d(a1Var);
        if (a1Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i5 < 28 || (a1Var.getInputType() & 15) != 3) {
            boolean z8 = a1Var.getLayoutDirection() == 1;
            switch (a1Var.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z8) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(p.b(x0.o.a(a1Var.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new p0.d(textPaint, textDirectionHeuristic, iA, iD);
    }

    public abstract void A(int i5);

    public abstract void B(View view, int i5, int i9);

    public abstract void C(View view, float f7, float f9);

    public abstract boolean I(View view, float f7);

    public abstract boolean J(View view, int i5);

    public abstract void L(ViewGroup.MarginLayoutParams marginLayoutParams, int i5);

    public abstract void M(ViewGroup.MarginLayoutParams marginLayoutParams, int i5, int i9);

    public abstract int b(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float c(int i5);

    public abstract int d(View view, int i5);

    public abstract int e(View view, int i5);

    public abstract int l(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract int p();

    public abstract int q(View view);

    public abstract int r(CoordinatorLayout coordinatorLayout);

    public abstract int s();

    public int u(View view) {
        return 0;
    }

    public int v() {
        return 0;
    }

    public abstract boolean w(float f7);

    public abstract boolean x(View view);

    public abstract boolean y(float f7, float f9);

    public void z(View view, int i5) {
    }
}
