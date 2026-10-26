package com.google.android.gms.common.api;

import a4.u;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import com.ctwofficial.assistant.ui.setting.service.h;
import com.google.android.gms.common.annotation.KeepName;
import i4.f;
import x3.a;
import x3.d;
import z3.c;

/* JADX INFO: compiled from: r8-map-id-d9d998f4ed7f10f567d8f012d5423e818637a9319695e29b6f999fb053c41098 */
/* JADX INFO: loaded from: classes.dex */
@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f3003e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3004d = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i5, Intent intent) {
        super.onActivityResult(i, i5, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f3004d = 0;
            setResult(i5, intent);
            if (booleanExtra) {
                c cVarF = c.f(this);
                if (i5 == -1) {
                    f fVar = cVarF.f9122n;
                    fVar.sendMessage(fVar.obtainMessage(3));
                } else if (i5 == 0) {
                    cVarF.g(new a(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.f3004d = 0;
            setResult(i5, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f3004d = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f3004d = bundle.getInt("resolution");
        }
        if (this.f3004d == 1) {
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            finish();
            return;
        }
        if (pendingIntent == null) {
            u.b(num);
            d.f8375d.c(this, num.intValue(), this);
            this.f3004d = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.f3004d = 1;
            } catch (ActivityNotFoundException unused) {
                if (extras.getBoolean("notify_manager", true)) {
                    c.f(this).g(new a(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String strP = h.p("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        strP.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                }
                googleApiActivity.f3004d = 1;
                finish();
            } catch (IntentSender.SendIntentException unused2) {
                finish();
            }
        } catch (ActivityNotFoundException unused3) {
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException unused4) {
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f3004d);
        super.onSaveInstanceState(bundle);
    }
}
