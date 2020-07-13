//
//  FAliPlayListFactory.h
//  Pods
//
//  Created by susu on 2020/6/30.
//


#import <Foundation/Foundation.h>
#import "Flutter/Flutter.h"

@interface FAliPlayListFactory : NSObject<FlutterPlatformViewFactory>
- (instancetype)initWithMessenger:(NSObject<FlutterBinaryMessenger>*)messenger;
-(NSObject<FlutterMessageCodec> *)createArgsCodec;

-(NSObject<FlutterPlatformView> *)createWithFrame:(CGRect)frame viewIdentifier:(int64_t)viewId arguments:(id)args;
@end
