package com.anypwx.myandroidapp

import android.app.Application
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.FlutterEngineCache
import io.flutter.embedding.engine.dart.DartExecutor

class MyApp: Application() {
    override fun onCreate() {
        super.onCreate()
        val fe = FlutterEngine(this)
        fe.dartExecutor.executeDartEntrypoint(DartExecutor.DartEntrypoint.createDefault())
        FlutterEngineCache.getInstance().put("fe", fe)
    }
}