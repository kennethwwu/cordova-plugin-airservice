package cordova.plugin.airservice;

import android.os.Bundle;
import android.util.Log;

import com.airservice.airservicesdk.ASWebActivity;

import java.util.Map;

public class ASWeb extends ASWebActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        appCode = "airservice-qa-sdk";
        clientID = "22c7d3fc";
        clientSecret = "aada245b93feb5d8e84dfeb49296da8b";
        appCollection = "airservice-qa-sdk";
        appEnvironment = ASEnvironment.QA;
        hostAction = ASHostActionType.Menu;

        super.onCreate(savedInstanceState);
    }

    @Override
    public void onCustomerUpdated(Map<Object, Object> payload) {
        Log.i("AirService", "Customer Details: " + payload.toString());
    }
}
