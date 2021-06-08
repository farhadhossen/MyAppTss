package com.rdtl.job.chakri.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class HomeBrowserActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_browser);


        webView = findViewById(R.id.idWebView2);

        Intent intent = getIntent();
        String easyPuzzle = intent.getExtras().getString("epuzzle2");


        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);

        webView.loadUrl(easyPuzzle);

    }
}