package s.o.s;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.Toast;

public class BrowserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        WebView myWebView = (WebView) findViewById(R.id.webbrowser);

        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("http://www.google.com");
        myWebView.setWebViewClient(new MyWebViewClient());
        Toast.makeText(this, "Loading.... Plese Wait", Toast.LENGTH_LONG).show();



    }

    public void go(View v) {
        EditText address = (EditText) findViewById(R.id.editText2URL);
        String www = address.getText().toString();
        WebView myWebView = (WebView) findViewById(R.id.webbrowser);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new MyWebViewClient());
        myWebView.loadUrl("http://"+www);
        Toast.makeText(this, "Loading "+www+".... Plese Wait", Toast.LENGTH_LONG).show();

    }

    public void refresh(View v) {
        WebView myWebView = (WebView) findViewById(R.id.webbrowser);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.reload();
        Toast.makeText(this, "Refreshing..", Toast.LENGTH_LONG).show();


    }

    public void stop(View v) {
        WebView myWebView = (WebView) findViewById(R.id.webbrowser);
        myWebView.stopLoading();
        Toast.makeText(this, "Stoping..", Toast.LENGTH_LONG).show();

    }

    private class MyWebViewClient extends WebViewClient {
      /*  @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if (Uri.parse(url).getHost().equals("www.example.com")) {
                // This is my web site, so do not override; let my WebView load the page
                return false;
            }
            // Otherwise, the link is not for a page on my site, so launch another Activity that handles URLs
          //  Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
          //  startActivity(intent);
            return true;
        } */
    }
}
