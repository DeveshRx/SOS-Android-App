package s.o.s;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class TicketsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tickets);

        WebView myWebView = (WebView) findViewById(R.id.webviewticket);

        Intent intent = getIntent();
        String opt = intent.getStringExtra(HomeActivity.EXTRA_MESSAGE);
        if(opt.equals("ticket")){
            //myWebView.loadUrl("https://goo.gl/forms/u5g2xmcbySjs2NBM2");


        }else if(opt.equals("join")){
            myWebView.loadUrl("https://goo.gl/forms/u5g2xmcbySjs2NBM2");


        }else{

        }
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());

    }
}