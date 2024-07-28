package br.com.fabriciocurvello.appbroadcastreceiversjava;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class NetworkChangeReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        // throw new UnsupportedOperationException("Not yet implemented");

        // Verifica a conectividade da rede
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo(); //necessário permissão no AndroidManifest
        boolean isConnected = activeNetwork != null && activeNetwork.isConnectedOrConnecting();

        // Exibe um toast
        if (isConnected) {
            Toast.makeText(context, "Network Connected", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Network Disconnected", Toast.LENGTH_SHORT).show();
        }
    }
}