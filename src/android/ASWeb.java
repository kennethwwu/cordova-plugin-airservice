package cordova.plugin.airservice;

import android.os.Bundle;
import android.util.Log;
import android.content.Intent;

import com.airservice.airservicesdk.ASWebActivity;

import java.util.Map;

public class ASWeb extends ASWebActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        Intent intent = this.getIntent();

        appCode = intent.getStringExtra("appCode");
        clientID = intent.getStringExtra("clientID");
        clientSecret = intent.getStringExtra("clientSecret");
        appCollection =  intent.getStringExtra("appCollection");
        appEnvironment = ASEnvironment.QA;
        hostAction = ASHostActionType.Menu;

        super.onCreate(savedInstanceState);
    }

    @Override
    public void onCustomerUpdated(Map<Object, Object> payload) {
        Log.i("AirService", "Customer Details: " + payload.toString());
    }
}
