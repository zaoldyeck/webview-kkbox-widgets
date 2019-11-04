package kkbox.com.webview_kkbox_widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.settings.javaScriptEnabled = true
        myWebView.webChromeClient = WebChromeClient()
        myWebView.webViewClient = WebViewClient()

        myWebView.settings.allowContentAccess = true
        myWebView.settings.domStorageEnabled = true
        myWebView.loadUrl("https://widget.kkbox.com/v1/?id=Pa0NfMzqWKr80xUY_N&type=song&terr=TW&lang=JA")
    }
}
