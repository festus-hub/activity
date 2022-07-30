package com.example.afternoonandriod

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.w
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class WebActivity : AppCompatActivity() {
    lateinit var wb_view:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        wb_view=findViewById(R.id.btn_web)
        webview()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webview(){
        wb_view.webViewClient= WebViewClient()
        wb_view.apply {
            loadUrl(  "https://facebook.com")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true

        }
    }

    override fun onBackPressed() {
        if (wb_view.canGoBack())wb_view.goBack()
        super.onBackPressed()
    }
}