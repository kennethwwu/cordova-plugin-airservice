package cordova.plugin.airservice;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * This class echoes a string called from JavaScript.
 */
public class AirService extends CordovaPlugin {

    private Activity activity = null;

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        this.activity = this.cordova.getActivity();
        if (action.equals("coolMethod")) {
            String message = args.getString(0);
            this.coolMethod(message, callbackContext);
            return true;
        }
        if (action.equals("testMethod")) {
            String message = args.getString(0);
            this.testMethod(message, callbackContext);
            return true;
        }
        return false;
    }

    private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

    private void testMethod(String message, CallbackContext callbackContext){
      if (message != null && message.length() > 0) {
          Intent intent = new Intent(this.activity, ASWeb.class);
          // this.activity.startService(intent);
          this.activity.startActivity(intent);
          // callbackContext.success(message);
      } else {
          callbackContext.error("Expected one non-empty string argument.");
      }
    }
}
