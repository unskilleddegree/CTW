package com.google.android.material.search;

import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c6.k;
import c6.o;
import com.ctwofficial.assistant.R;
import com.ctwofficial.assistant.ui.setting.service.h;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchView;
import d0.a;
import g8.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import n.o3;
import o5.n;
import o5.t;
import q5.b;
import q5.c;
import q5.g;
import r0.d2;
import r0.j0;
import r0.v0;
import w5.d;
import w5.e;
import w5.f;
import w5.i;
import w5.m;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
public class SearchView extends FrameLayout implements a, b {
    public static final /* synthetic */ int G = 0;
    public boolean A;
    public final int B;
    public boolean C;
    public boolean D;
    public i E;
    public HashMap F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f3236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ClippableRoundedCornerLayout f3237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f3238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f3239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FrameLayout f3240h;
    public final FrameLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final MaterialToolbar f3241j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Toolbar f3242k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f3243l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final EditText f3244m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImageButton f3245n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f3246o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TouchObserverFrameLayout f3247p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f3248q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f3249r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f3250s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f3251t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final l5.a f3252u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LinkedHashSet f3253v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SearchBar f3254w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3255x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f3256y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f3257z;

    /* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
    public static class Behavior extends d0.b {
        public Behavior() {
        }

        @Override // d0.b
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            SearchView searchView = (SearchView) view;
            if (searchView.f3254w != null || !(view2 instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view2);
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void e(SearchView searchView, d2 d2Var) {
        int iD = d2Var.d();
        searchView.setUpStatusBarSpacer(iD);
        if (searchView.D) {
            return;
        }
        searchView.setStatusBarSpacerEnabledInternal(iD > 0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    private Window getActivityWindow() {
        Activity activity;
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                activity = (Activity) context;
                if (activity == null) {
                    return null;
                }
                return activity.getWindow();
            }
        }
        activity = null;
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f3254w;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z8) {
        this.f3239g.setVisibility(z8 ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f7) {
        View view;
        l5.a aVar = this.f3252u;
        if (aVar == null || (view = this.f3238f) == null) {
            return;
        }
        view.setBackgroundColor(aVar.a(this.B, f7));
    }

    private void setUpHeaderLayout(int i) {
        if (i != -1) {
            addHeaderView(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this.f3240h, false));
        }
    }

    private void setUpStatusBarSpacer(int i) {
        View view = this.f3239g;
        if (view.getLayoutParams().height != i) {
            view.getLayoutParams().height = i;
            view.requestLayout();
        }
    }

    @Override // q5.b
    public final void a() {
        if (h()) {
            return;
        }
        m mVar = this.f3249r;
        q5.i iVar = mVar.f8161m;
        c.b bVar = iVar.f6821f;
        iVar.f6821f = null;
        if (Build.VERSION.SDK_INT < 34 || this.f3254w == null || bVar == null) {
            if (this.E.equals(i.f8138e) || this.E.equals(i.f8137d)) {
                return;
            }
            mVar.k();
            return;
        }
        long totalDuration = mVar.k().getTotalDuration();
        q5.i iVar2 = mVar.f8161m;
        AnimatorSet animatorSetA = iVar2.a(mVar.f8163o);
        animatorSetA.setDuration(totalDuration);
        animatorSetA.start();
        iVar2.i = 0.0f;
        iVar2.f6832j = null;
        iVar2.f6833k = null;
        if (mVar.f8162n != null) {
            mVar.d(false).start();
            mVar.f8162n.resume();
        }
        mVar.f8162n = null;
    }

    public void addHeaderView(View view) {
        FrameLayout frameLayout = this.f3240h;
        frameLayout.addView(view);
        frameLayout.setVisibility(0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f3248q) {
            this.f3247p.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // q5.b
    public final void b(c.b bVar) {
        if (h() || this.f3254w == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.f3249r.l(bVar);
    }

    @Override // q5.b
    public final void c(c.b bVar) {
        if (h() || this.f3254w == null) {
            return;
        }
        m mVar = this.f3249r;
        q5.i iVar = mVar.f8161m;
        SearchBar searchBar = mVar.f8163o;
        iVar.f6821f = bVar;
        float f7 = bVar.f1714b;
        View view = iVar.f6817b;
        iVar.f6832j = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        if (searchBar != null) {
            iVar.f6833k = t.a(view, searchBar);
        }
        iVar.i = f7;
    }

    @Override // q5.b
    public final void d() {
        if (h() || this.f3254w == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.f3249r.c();
    }

    public final void f() {
        this.f3244m.post(new d(this, 2));
    }

    public final boolean g() {
        return this.f3255x == 48;
    }

    public q5.i getBackHelper() {
        return this.f3249r.f8161m;
    }

    @Override // d0.a
    public d0.b getBehavior() {
        return new Behavior();
    }

    public i getCurrentTransitionState() {
        return this.E;
    }

    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_arrow_back_black_24;
    }

    public EditText getEditText() {
        return this.f3244m;
    }

    public CharSequence getHint() {
        return this.f3244m.getHint();
    }

    public TextView getSearchPrefix() {
        return this.f3243l;
    }

    public CharSequence getSearchPrefixText() {
        return this.f3243l.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f3255x;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.f3244m.getText();
    }

    public Toolbar getToolbar() {
        return this.f3241j;
    }

    public final boolean h() {
        return this.E.equals(i.f8138e) || this.E.equals(i.f8137d);
    }

    public final void i() {
        if (this.A) {
            this.f3244m.postDelayed(new d(this, 0), 100L);
        }
    }

    public final void j(i iVar, boolean z8) {
        if (this.E.equals(iVar)) {
            return;
        }
        if (z8) {
            if (iVar == i.f8140g) {
                setModalForAccessibility(true);
            } else if (iVar == i.f8138e) {
                setModalForAccessibility(false);
            }
        }
        this.E = iVar;
        Iterator it = new LinkedHashSet(this.f3253v).iterator();
        if (it.hasNext()) {
            throw h.j(it);
        }
        m(iVar);
    }

    public final void k() {
        if (this.E.equals(i.f8140g)) {
            return;
        }
        i iVar = this.E;
        i iVar2 = i.f8139f;
        if (iVar.equals(iVar2)) {
            return;
        }
        final m mVar = this.f3249r;
        SearchView searchView = mVar.f8150a;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = mVar.f8152c;
        if (mVar.f8163o == null) {
            if (searchView.g()) {
                searchView.postDelayed(new d(searchView, 3), 150L);
            }
            clippableRoundedCornerLayout.setVisibility(4);
            final int i = 1;
            clippableRoundedCornerLayout.post(new Runnable() { // from class: w5.k
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            m mVar2 = mVar;
                            AnimatorSet animatorSetE = mVar2.e(true);
                            animatorSetE.addListener(new l(mVar2, 0));
                            animatorSetE.start();
                            break;
                        default:
                            m mVar3 = mVar;
                            ClippableRoundedCornerLayout clippableRoundedCornerLayout2 = mVar3.f8152c;
                            clippableRoundedCornerLayout2.setTranslationY(clippableRoundedCornerLayout2.getHeight());
                            AnimatorSet animatorSetI = mVar3.i(true);
                            animatorSetI.addListener(new l(mVar3, 2));
                            animatorSetI.start();
                            break;
                    }
                }
            });
            return;
        }
        EditText editText = mVar.i;
        if (searchView.g()) {
            searchView.i();
        }
        searchView.setTransitionState(iVar2);
        Toolbar toolbar = mVar.f8156g;
        Menu menu = toolbar.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (mVar.f8163o.getMenuResId() == -1 || !searchView.f3257z) {
            toolbar.setVisibility(8);
        } else {
            toolbar.m(mVar.f8163o.getMenuResId());
            ActionMenuView actionMenuViewE = n.e(toolbar);
            if (actionMenuViewE != null) {
                for (int i5 = 0; i5 < actionMenuViewE.getChildCount(); i5++) {
                    View childAt = actionMenuViewE.getChildAt(i5);
                    childAt.setClickable(false);
                    childAt.setFocusable(false);
                    childAt.setFocusableInTouchMode(false);
                }
            }
            toolbar.setVisibility(0);
        }
        editText.setText(mVar.f8163o.getText());
        editText.setSelection(editText.getText().length());
        clippableRoundedCornerLayout.setVisibility(4);
        final int i9 = 0;
        clippableRoundedCornerLayout.post(new Runnable() { // from class: w5.k
            @Override // java.lang.Runnable
            public final void run() {
                switch (i9) {
                    case 0:
                        m mVar2 = mVar;
                        AnimatorSet animatorSetE = mVar2.e(true);
                        animatorSetE.addListener(new l(mVar2, 0));
                        animatorSetE.start();
                        break;
                    default:
                        m mVar3 = mVar;
                        ClippableRoundedCornerLayout clippableRoundedCornerLayout2 = mVar3.f8152c;
                        clippableRoundedCornerLayout2.setTranslationY(clippableRoundedCornerLayout2.getHeight());
                        AnimatorSet animatorSetI = mVar3.i(true);
                        animatorSetI.addListener(new l(mVar3, 2));
                        animatorSetI.start();
                        break;
                }
            }
        });
    }

    public final void l(ViewGroup viewGroup, boolean z8) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.f3237e.getId()) != null) {
                    l((ViewGroup) childAt, z8);
                } else if (z8) {
                    this.F.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    WeakHashMap weakHashMap = v0.f7028a;
                    childAt.setImportantForAccessibility(4);
                } else {
                    HashMap map = this.F;
                    if (map != null && map.containsKey(childAt)) {
                        int iIntValue = ((Integer) this.F.get(childAt)).intValue();
                        WeakHashMap weakHashMap2 = v0.f7028a;
                        childAt.setImportantForAccessibility(iIntValue);
                    }
                }
            }
        }
    }

    public final void m(i iVar) {
        c cVar;
        if (this.f3254w == null || !this.f3251t) {
            return;
        }
        boolean zEquals = iVar.equals(i.f8140g);
        g gVar = this.f3250s;
        if (zEquals) {
            c cVar2 = gVar.f6825a;
            if (cVar2 != null) {
                cVar2.b(gVar.f6826b, gVar.f6827c, false);
                return;
            }
            return;
        }
        if (!iVar.equals(i.f8138e) || (cVar = gVar.f6825a) == null) {
            return;
        }
        cVar.stopListeningForBackCallbacks(gVar.f6827c);
    }

    public final void n() {
        ImageButton imageButtonF = n.f(this.f3241j);
        if (imageButtonF == null) {
            return;
        }
        int i = this.f3237e.getVisibility() == 0 ? 1 : 0;
        Object drawable = imageButtonF.getDrawable();
        if (drawable instanceof j0.g) {
            ((j0.h) ((j0.g) drawable)).getClass();
            drawable = null;
        }
        if (drawable instanceof j.a) {
            j.a aVar = (j.a) drawable;
            float f7 = i;
            if (aVar.i != f7) {
                aVar.i = f7;
                aVar.invalidateSelf();
            }
        }
        if (drawable instanceof o5.d) {
            ((o5.d) drawable).a(i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        y5.h.setParentAbsoluteElevation(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f3255x = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof w5.h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        w5.h hVar = (w5.h) parcelable;
        super.onRestoreInstanceState(hVar.f497d);
        setText(hVar.f8135f);
        setVisible(hVar.f8136g == 0);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        w5.h hVar = new w5.h(super.onSaveInstanceState());
        Editable text = getText();
        hVar.f8135f = text == null ? null : text.toString();
        hVar.f8136g = this.f3237e.getVisibility();
        return hVar;
    }

    public void removeHeaderView(View view) {
        FrameLayout frameLayout = this.f3240h;
        frameLayout.removeView(view);
        if (frameLayout.getChildCount() == 0) {
            frameLayout.setVisibility(8);
        }
    }

    public void setAnimatedNavigationIcon(boolean z8) {
        this.f3256y = z8;
    }

    public void setAutoShowKeyboard(boolean z8) {
        this.A = z8;
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        setUpBackgroundViewElevationOverlay(f7);
    }

    public void setHint(CharSequence charSequence) {
        this.f3244m.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z8) {
        this.f3257z = z8;
    }

    public void setModalForAccessibility(boolean z8) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z8) {
            this.F = new HashMap(viewGroup.getChildCount());
        }
        l(viewGroup, z8);
        if (z8) {
            return;
        }
        this.F = null;
    }

    public void setOnMenuItemClickListener(o3 o3Var) {
        this.f3241j.setOnMenuItemClickListener(o3Var);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        TextView textView = this.f3243l;
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setStatusBarSpacerEnabled(boolean z8) {
        this.D = true;
        setStatusBarSpacerEnabledInternal(z8);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        this.f3244m.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z8) {
        this.f3241j.setTouchscreenBlocksFocus(z8);
    }

    public void setTransitionState(i iVar) {
        j(iVar, true);
    }

    public void setUseWindowInsetsController(boolean z8) {
        this.C = z8;
    }

    public void setVisible(boolean z8) {
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f3237e;
        boolean z9 = clippableRoundedCornerLayout.getVisibility() == 0;
        clippableRoundedCornerLayout.setVisibility(z8 ? 0 : 8);
        n();
        j(z8 ? i.f8140g : i.f8138e, z9 != z8);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.f3254w = searchBar;
        this.f3249r.f8163o = searchBar;
        if (searchBar != null) {
            searchBar.setOnClickListener(new f(this, 0));
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new d(this, 1));
                    this.f3244m.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        MaterialToolbar materialToolbar = this.f3241j;
        if (materialToolbar != null) {
            Object navigationIcon = materialToolbar.getNavigationIcon();
            if (navigationIcon instanceof j0.g) {
                ((j0.h) ((j0.g) navigationIcon)).getClass();
                navigationIcon = null;
            }
            if (!(navigationIcon instanceof j.a)) {
                int defaultNavigationIconResource = getDefaultNavigationIconResource();
                if (this.f3254w == null) {
                    materialToolbar.setNavigationIcon(defaultNavigationIconResource);
                } else {
                    Drawable drawableMutate = l.h(getContext(), defaultNavigationIconResource).mutate();
                    if (materialToolbar.getNavigationIconTint() != null) {
                        j0.a.g(drawableMutate, materialToolbar.getNavigationIconTint().intValue());
                    }
                    materialToolbar.setNavigationIcon(new o5.d(this.f3254w.getNavigationIcon(), drawableMutate));
                    n();
                }
            }
        }
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
        m(getCurrentTransitionState());
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchViewStyle);
    }

    public void setHint(int i) {
        this.f3244m.setHint(i);
    }

    public void setText(int i) {
        this.f3244m.setText(i);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(e6.a.a(context, attributeSet, i, R.style.Widget_Material3_SearchView), attributeSet, i);
        this.f3250s = new g(this);
        this.f3253v = new LinkedHashSet();
        this.f3255x = 16;
        this.E = i.f8138e;
        Context context2 = getContext();
        TypedArray typedArrayH = n.h(context2, attributeSet, u4.a.F, i, R.style.Widget_Material3_SearchView, new int[0]);
        this.B = typedArrayH.getColor(11, 0);
        int resourceId = typedArrayH.getResourceId(16, -1);
        int resourceId2 = typedArrayH.getResourceId(0, -1);
        String string = typedArrayH.getString(3);
        String string2 = typedArrayH.getString(4);
        String string3 = typedArrayH.getString(24);
        boolean z8 = typedArrayH.getBoolean(27, false);
        this.f3256y = typedArrayH.getBoolean(8, true);
        this.f3257z = typedArrayH.getBoolean(7, true);
        boolean z9 = typedArrayH.getBoolean(17, false);
        this.A = typedArrayH.getBoolean(9, true);
        this.f3251t = typedArrayH.getBoolean(10, true);
        typedArrayH.recycle();
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_view, this);
        this.f3248q = true;
        this.f3236d = findViewById(R.id.open_search_view_scrim);
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) findViewById(R.id.open_search_view_root);
        this.f3237e = clippableRoundedCornerLayout;
        this.f3238f = findViewById(R.id.open_search_view_background);
        View viewFindViewById = findViewById(R.id.open_search_view_status_bar_spacer);
        this.f3239g = viewFindViewById;
        this.f3240h = (FrameLayout) findViewById(R.id.open_search_view_header_container);
        this.i = (FrameLayout) findViewById(R.id.open_search_view_toolbar_container);
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.open_search_view_toolbar);
        this.f3241j = materialToolbar;
        this.f3242k = (Toolbar) findViewById(R.id.open_search_view_dummy_toolbar);
        this.f3243l = (TextView) findViewById(R.id.open_search_view_search_prefix);
        EditText editText = (EditText) findViewById(R.id.open_search_view_edit_text);
        this.f3244m = editText;
        ImageButton imageButton = (ImageButton) findViewById(R.id.open_search_view_clear_button);
        this.f3245n = imageButton;
        View viewFindViewById2 = findViewById(R.id.open_search_view_divider);
        this.f3246o = viewFindViewById2;
        TouchObserverFrameLayout touchObserverFrameLayout = (TouchObserverFrameLayout) findViewById(R.id.open_search_view_content_container);
        this.f3247p = touchObserverFrameLayout;
        this.f3249r = new m(this);
        this.f3252u = new l5.a(context2);
        clippableRoundedCornerLayout.setOnTouchListener(new w5.g());
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        if (resourceId2 != -1) {
            editText.setTextAppearance(resourceId2);
        }
        editText.setText(string);
        editText.setHint(string2);
        if (z9) {
            materialToolbar.setNavigationIcon((Drawable) null);
        } else {
            materialToolbar.setNavigationOnClickListener(new f(this, 1));
            if (z8) {
                j.a aVar = new j.a(getContext());
                int iJ = g6.b.j(this, R.attr.colorOnSurface);
                Paint paint = aVar.f5201a;
                if (iJ != paint.getColor()) {
                    paint.setColor(iJ);
                    aVar.invalidateSelf();
                }
                materialToolbar.setNavigationIcon(aVar);
            }
        }
        imageButton.setOnClickListener(new f(this, 2));
        editText.addTextChangedListener(new o(this, 4));
        touchObserverFrameLayout.setOnTouchListener(new k(1, this));
        t.b(materialToolbar, new e(this));
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById2.getLayoutParams();
        final int i5 = marginLayoutParams.leftMargin;
        final int i9 = marginLayoutParams.rightMargin;
        r0.t tVar = new r0.t() { // from class: w5.c
            @Override // r0.t
            public final d2 f(View view, d2 d2Var) {
                int i10 = SearchView.G;
                int iB = d2Var.b() + i5;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = iB;
                marginLayoutParams2.rightMargin = d2Var.c() + i9;
                return d2Var;
            }
        };
        WeakHashMap weakHashMap = v0.f7028a;
        j0.u(viewFindViewById2, tVar);
        setUpStatusBarSpacer(getStatusBarHeight());
        j0.u(viewFindViewById, new e(this));
    }
}
