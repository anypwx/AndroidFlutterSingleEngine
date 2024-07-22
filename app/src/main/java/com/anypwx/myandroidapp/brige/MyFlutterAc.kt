package com.anypwx.myandroidapp.brige

import android.content.Context
import android.os.Bundle
import io.flutter.embedding.android.FlutterFragmentActivity
import io.flutter.embedding.engine.FlutterEngine

class MyFlutterAc: FlutterFragmentActivity() {

    companion object {
        fun start(context: Context) {
            context.startActivity(
                withCachedEngine("fe").build(context)
            )
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)
    }
}