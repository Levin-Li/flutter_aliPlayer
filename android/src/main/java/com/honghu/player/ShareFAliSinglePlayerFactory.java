package com.honghu.player;

import android.content.Context;
//import android.os.Build;
//import android.support.annotation.RequiresApi;

import java.util.HashMap;

import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;

public class ShareFAliSinglePlayerFactory extends PlatformViewFactory {
    private BinaryMessenger messenger;
    private FAliPlayerSingleTextureView fAliPlayerSingleTextureView;

    ShareFAliSinglePlayerFactory(BinaryMessenger messenger) {
        super(StandardMessageCodec.INSTANCE);
        this.messenger = messenger;
    }

//    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public PlatformView create(Context context, int viewId, Object args) {
        fAliPlayerSingleTextureView = new FAliPlayerSingleTextureView(context, messenger, (HashMap) args, viewId);
        return fAliPlayerSingleTextureView;
    }
}