package mx.itsur.llamadabroadcastreceiver;

import android.app.Application;
import android.content.Context;
import android.telephony.PhoneStateListener;
import android.widget.Toast;

public class MyPhoneStateListener extends PhoneStateListener {
    private Context context;
    public MyPhoneStateListener(Context c){
        context = c;
    }
    @Override
    public void onCallStateChanged(int state, String incomingNumbrer) {
        if (state == 1) {
            String msg = "Llamada nueva. Numero: " + incomingNumbrer;

            Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
        }
    }
}
