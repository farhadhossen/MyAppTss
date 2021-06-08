package com.rdtl.job.chakri.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

public class BrowsingActivity extends AppCompatActivity {


    WebView webView;

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browsing);


        webView = findViewById(R.id.idWebView);
        imageView = findViewById(R.id.idImageView);

        Intent intent = getIntent();
        String easyPuzzle = intent.getExtras().getString("epuzzle");


        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);

        if (isNetworkAvailable(getApplicationContext())){
            imageView.setVisibility(View.GONE);
            webView.setVisibility(View.VISIBLE);
        }



        webView.setWebViewClient(new WebViewClient(){




            @Override
            public void onPageFinished(WebView view, String url) {



                String script4 = "document. getElementById(\"site-header-inner\"). style. display = \"none\";";

                webView.evaluateJavascript(script4,null);


                if (isNetworkAvailable(getApplicationContext())){
                    imageView.setVisibility(View.GONE);
                    webView.setVisibility(View.VISIBLE);
                }



            }

            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);


                    imageView.setVisibility(View.VISIBLE);
                    webView.setVisibility(View.GONE);



            }
        });


        //webView.addJavascriptInterface(new JS(this) that is class,"JS" that is from script);

        if (easyPuzzle.equals("Laptop & Desktop")){
            webView.loadUrl("https://www.tss.com.bd/laptop-production-assembling-plant/");

        }else if (easyPuzzle.equals("Telephone & Steno set")){
            webView.loadUrl("https://www.tss.com.bd/telephone-set_1_2/");

        }else if (easyPuzzle.equals("Transmission Equipment")){
            webView.loadUrl("https://tss.com.bd/tss-old19/product-page-grid-master/Transmission.html");

        }else {
            webView.loadUrl(""+easyPuzzle);
        }

        webView.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String url, String userAgent,
                                        String contentDisposition, String mimetype,
                                        long contentLength) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // Check if the key event was the Back button and if there's history
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager conMan = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if(conMan.getActiveNetworkInfo() != null && conMan.getActiveNetworkInfo().isConnected())
            return true;
        else
            return false;
    }
}