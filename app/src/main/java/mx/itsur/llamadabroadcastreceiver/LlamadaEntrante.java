package mx.itsur.llamadabroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

public class LlamadaEntrante extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        TelephonyManager tmge = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);

        MyPhoneStateListener ListenerTelefono = new MyPhoneStateListener(context);

        tmge.listen(ListenerTelefono, PhoneStateListener.LISTEN_CALL_STATE);
    }
}
