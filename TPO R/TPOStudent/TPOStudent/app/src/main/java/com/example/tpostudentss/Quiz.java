package com.example.tpostudentss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Quiz extends AppCompatActivity {

    WebView wv;
    private String webUrl="https://www.assessmentday.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        wv=(WebView)findViewById(R.id.wvquiiz);
        wv.loadUrl(webUrl);
        WebSettings ws=wv.getSettings();
        ws.setJavaScriptEnabled(true);
        wv.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });

    }

    @Override
    public void onBackPressed() {
        if(wv.canGoBack()){
            wv.goBack();
        }
        else
            super.onBackPressed();
    }

}