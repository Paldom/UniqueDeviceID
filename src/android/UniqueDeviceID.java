package hu.dpal.phonegap.plugins;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Context;

public class UniqueDeviceID extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) {
        
        if (action.equals("get")) {
            
            TelephonyManager tm = (TelephonyManager) callbackContext.getSystemService(Context.TELEPHONY_SERVICE);

            String uuid;
            String androidID = Secure.getString(callbackContext.getContentResolver(), Secure.ANDROID_ID);
            String deviceID = tm.getDeviceId();
            String simID = tm.getSimSerialNumber();
            
            if ("9774d56d682e549c".equals(androidID) || androidID == null) {
                andoridID = "";
            } 
            
            if (deviceID == null) {
                deviceID = "";
            }
            
            if (simID == null) { 
                simID = "";
            }   

            uuid = androidID + deviceID + simID;
            uuid = String.format("%32s", uuid).replace(' ', '0');
            uuid = uuid.substring(0,32);
    		uuid = uuid.replaceAll("(\\w{8})(\\w{4})(\\w{4})(\\w{4})(\\w{12})", "$1-$2-$3-$4-$5");
            
            callbackContext.success(uuid);
            return true;
        }

        return false;
    }

}