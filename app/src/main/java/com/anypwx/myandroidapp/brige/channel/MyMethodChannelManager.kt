package com.anypwx.myandroidapp.brige.channel

import io.flutter.embedding.engine.FlutterEngineCache
import io.flutter.plugin.common.MethodChannel

object MyMethodChannelManager {
    fun initMethodChannel() {
        FlutterEngineCache.getInstance().get("fe")?.let {
            val channel = MethodChannel(it.dartExecutor.binaryMessenger, "com.anypwx.myandroidapp/route")
        }
    }
}