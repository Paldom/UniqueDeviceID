UniqueDeviceID
==============

PhoneGap / Cordova unique device id (UUID) plugin for Android, iOS and Windows Phone 8. Remains the same after app uninstall.

## Installation

Latest stable release: ```phonegap local plugin add cordova-plugin-uniquedeviceid```  
or ```cordova plugin add cordova-plugin-uniquedeviceid```

Current state from git: ```phonegap local plugin add https://github.com/Paldom/UniqueDeviceID.git```  
or ```cordova plugin add https://github.com/Paldom/UniqueDeviceID.git```

## Installation - PhoneGap Build 

Add following to config.xml: ```<gap:plugin name="cordova-plugin-uniquedeviceid" source="npm" />```

For older versions, use the following: ```<gap:plugin name="hu.dpal.phonegap.plugins.uniquedeviceid" version="1.2.0" />```
or ```<gap:plugin name="hu.dpal.phonegap.plugins.uniquedeviceid" source="plugins.cordova.io" />```

## Supported Platforms

- Android
- iOS
- Windows Phone 8

## Usage

    // Get UUID
    window.plugins.uniqueDeviceID.get(success, fail);

Success callback function:

    function success(uuid)
    {
        console.log(uuid);
    };
