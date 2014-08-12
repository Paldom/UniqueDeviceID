UniqueDeviceID
==============

PhoneGap / Cordova unique device id (UUID) plugin for Android and iOS. Remains the same after app uninstall.
On iOS it changes when user reset advertisingIdentifier.

Installation:

```cordova plugin add https://github.com/Paldom/UniqueDeviceID.git```
or
```phonegap local plugin add https://github.com/Paldom/UniqueDeviceID.git```

Usage:

    // Get UUID
    window.plugins.uniqueDeviceID.get(success, fail);

Success callback function:

    function success(uuid)
    {
        console.log(uuid);
    };
