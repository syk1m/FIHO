package seoyoon.kim.fiho;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class C_edu_courselist extends AppCompatActivity {
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_edu_courselist);
        WebView myWebView = findViewById(R.id.course1);
        myWebView.loadUrl("https://www.econedu.go.kr/mec/ots/brd/list.do?mnuBaseId=MNU0000123&tplSer=3");
        WebView myWebView = findViewById(R.id.course2) ;
        myWebView.loadUrl("https://www.coursera.org/browse/business");
        WebView myWebView = findViewById(R.id.course3) ;
        myWebView.loadUrl("https://www.edx.org/learn/business-administration");
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new Map_webview.WebViewClientClass())
    }
}