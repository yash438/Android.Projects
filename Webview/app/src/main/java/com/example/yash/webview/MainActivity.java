package com.example.yash.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity
{
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv= (WebView) findViewById(R.id.mywebview);
        WebSettings webSettings=wv.getSettings();
        //get settings foe customize web view
        webSettings.setJavaScriptEnabled(true);
        wv.setWebViewClient(new MyWebClient());
        wv.loadUrl("http://www.google.com");

    }

    class MyWebClient extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            return (false);
        }
    }
}