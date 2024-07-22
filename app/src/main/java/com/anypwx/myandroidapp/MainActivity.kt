package com.anypwx.myandroidapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.anypwx.myandroidapp.brige.MyFlutterAc
import com.anypwx.myandroidapp.databinding.ActivityMainBinding
import io.flutter.embedding.engine.FlutterEngineCache
import io.flutter.plugin.common.MethodChannel


class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvBtn.setOnClickListener {
            FlutterEngineCache.getInstance().get("fe")?.let {
                val channel = MethodChannel(it.dartExecutor.binaryMessenger, "com.anypwx.myandroidapp/route")
                channel.invokeMethod("initRoute", "/pageTest1") // 发送数据到Flutter
                MyFlutterAc.start(this)
            }
        }
    }
}