package seoyoon.kim.fiho;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class C_edu_courselist extends AppCompatActivity {
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_edu_courselist);

       TextView c1fullpage = findViewById(R.id.course1);
        c1fullpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(C_edu_courselist.this, Course1_webview.class);
                startActivity(it);
            }
        });

        TextView c2fullpage = findViewById(R.id.course2);
        c2fullpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(C_edu_courselist.this, Course2_webview.class);
                startActivity(it);
            }
        });

        TextView c3fullpage = findViewById(R.id.course3);
        c3fullpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(C_edu_courselist.this, Course3_webview.class);
                startActivity(it);
            }
        });

        WebView c1webview = findViewById(R.id.c1wv);
        c1webview.loadUrl("https://www.econedu.go.kr/mec/ots/brd/list.do?mnuBaseId=MNU0000123&tplSer=3");
        WebView c2webview = findViewById(R.id.c2wv) ;
        c2webview.loadUrl("https://www.coursera.org/browse/business");
        WebView c3webview = findViewById(R.id.c3wv) ;
        c3webview.loadUrl("https://www.edx.org/learn/business-administration");
        WebSettings webSettings = c1webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        c1webview.setWebViewClient(new WebViewClientClass());
        c2webview.setWebViewClient(new WebViewClientClass());
        c3webview.setWebViewClient(new WebViewClientClass());
    }

    private class WebViewClientClass extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest wrr) {
            Log.d("check URL", String.valueOf(wrr.getUrl()));
            view.loadUrl(String.valueOf(wrr.getUrl()));
            return true;
        }
    }
}
