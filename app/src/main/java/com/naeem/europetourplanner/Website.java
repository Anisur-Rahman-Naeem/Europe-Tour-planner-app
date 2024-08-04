package com.naeem.europetourplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Website extends AppCompatActivity {


    View loadingScreen;
    WebView webBrowser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);
        Intent i = getIntent();
        String searchText = i.getStringExtra("countryInfo");
        webBrowser = findViewById(R.id.web);
        loadingScreen = findViewById(R.id.loading_screen);
        webBrowser.setWebViewClient(new WebViewClient()
        {
            @Override
            public void onPageStarted(WebView view, String url, android.graphics.Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                Log.d("WebView", "Page started loading: " + url);
                // Show the loading screen
                loadingScreen.setVisibility(View.VISIBLE);
                Log.d("WebView", "Page now loading: " + url);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                Log.d("WebView", "Page finished loading: " + url);
                loadingScreen.setVisibility(View.GONE);
            }
        });
        webBrowser.getSettings().setJavaScriptEnabled(true);
        webBrowser.loadUrl("https://www.booking.com/searchresults.en-gb.html?ss="+searchText);

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Naeem", "onPause: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Naeem", "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Naeem", "onResume: " );
    }
}