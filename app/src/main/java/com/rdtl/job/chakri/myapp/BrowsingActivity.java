package com.rdtl.job.chakri.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class BrowsingActivity extends AppCompatActivity {


    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browsing);


        webView = findViewById(R.id.idWebView);

        Intent intent = getIntent();
        String easyPuzzle = intent.getExtras().getString("epuzzle");


        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);

//Working code
//        javascript:(function(){
//            document.getElementById('username').value='MyUsername';
//            document.getElementById('password').value='MyPassword';
//            document.forms.loginForma.submit.click();
//        })();


        webView.setWebViewClient(new WebViewClient(){




            @Override
            public void onPageFinished(WebView view, String url) {



                String script4 = "document. getElementById(\"site-header-inner\"). style. display = \"none\";";
                String script5 = "document.getElementsByClassName(\"page-header\"). style. display = \"none\";";

                String sc = "\"javascript:(function() { \" \n" +
                        "                    document.getElementsByClassName('lpage-header').style.display='none'; \" \n" +
                        "                    \"})()\"";

                String sc2 = "document.getElementsByClassName('lpage-header')[0].style.display='none'";

                webView.evaluateJavascript(script4,null);


            }
        });


        //webView.addJavascriptInterface(new JS(this) that is class,"JS" that is from script);

        if (easyPuzzle.equals("Laptop & Desktop")){
            webView.loadUrl("https://www.tss.com.bd/laptop-production-assembling-plant/");

        }else if (easyPuzzle.equals("Telephone & Steno set")){
            webView.loadUrl("https://www.tss.com.bd/telephone-set_1_2/");

        }else if (easyPuzzle.equals("Transmission Equipment")){
            webView.loadUrl("https://tss.com.bd/tss-old19/product-page-grid-master/Transmission.html");

        }

    }
}