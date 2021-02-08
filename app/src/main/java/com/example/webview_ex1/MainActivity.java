package com.example.webview_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        WebView dafdefan = (WebView) findViewById(R.id.dafdefan_xml);
        dafdefan.getSettings().setJavaScriptEnabled(true);
        dafdefan.setWebViewClient(new MyWebClient());

        Button btn = (Button) findViewById(R.id.button);
        EditText URL = (EditText) findViewById(R.id.editTextTextPersonName);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String kishur = URL.getText().toString();
                dafdefan.loadUrl(kishur);

            }
        });

    }

    private class MyWebClient extends WebViewClient {
        public boolean shouldOverideUrlLoading(WebView view, String kishur) {
            view.loadUrl(kishur);
            return true;
        }

    }
}