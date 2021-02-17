package com.example.newshub;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DailyPoineer extends AppCompatActivity {
WebView webview;
ProgressDialog pd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_poineer);
        webview=findViewById(R.id.webview);

        pd=new ProgressDialog(this);
        pd.setMessage("Daily Poineer loading...");

        webview.setWebViewClient(new WebViewClient()
        {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                pd.show();
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                pd.dismiss();
            }
        });


        webview.loadUrl("https://www.dailypioneer.com/");

    }

    @Override
    public void onBackPressed() {
        if(webview.canGoBack())
        {
            webview.goBack();
        }
        else
        {
            super.onBackPressed();
        }}
}