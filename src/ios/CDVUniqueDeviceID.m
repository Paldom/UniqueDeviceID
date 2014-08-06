//
//  CDVUniqueDeviceID.m
//
//
//

#import "CDVUniqueDeviceID.h"
#import <AdSupport/ASIdentifierManager.h>

@implementation CDVUniqueDeviceID

-(void)get:(CDVInvokedUrlCommand*)command
{
    [self.commandDelegate runInBackground:^{
        NSString *uuid = [[[ASIdentifierManager sharedManager] advertisingIdentifier] UUIDString];
        CDVPluginResult *result = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:uuid];
        [self.commandDelegate sendPluginResult:result callbackId:command.callbackId];
    }];
}

@end

