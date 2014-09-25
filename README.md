UniqueDeviceID
==============

PhoneGap / Cordova unique device id (UUID) plugin for Android, iOS and Windows Phone 8. Remains the same after app uninstall.

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
