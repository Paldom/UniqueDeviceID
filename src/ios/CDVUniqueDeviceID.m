//
//  CDVUniqueDeviceID.m
//
//
//

#import "CDVUniqueDeviceID.h"

@implementation CDVUniqueDeviceID

-(void)get:(CDVInvokedUrlCommand*)command
{
    [self.commandDelegate runInBackground:^{
        NSString *uuid = @"TODO";

        // TODO: load UUID from keystore. If empty generate UUID and store.
        
        CDVPluginResult *result = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:uuid];
        [self.commandDelegate sendPluginResult:result callbackId:command.callbackId];
    }];
}

@end

