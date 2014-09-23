using System;
using Microsoft.Phone.Info;
using WPCordovaClassLib.Cordova;
using WPCordovaClassLib.Cordova.Commands;
using WPCordovaClassLib.Cordova.JSON;

namespace WPCordovaClassLib.Cordova.Commands
{
    public class UniqueDeviceID : BaseCommand
    {
        public void get(string options)
        {

            byte[] id = (byte[])Microsoft.Phone.Info.DeviceExtendedProperties.GetValue("DeviceUniqueId");
            string uuid = Convert.ToBase64String(id);

            DispatchCommandResult(new PluginResult(PluginResult.Status.OK, uuid));

        }
    }
}