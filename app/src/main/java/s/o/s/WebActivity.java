package s.o.s;

import android.app.Activity;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class WebActivity extends AppCompatActivity {
public String option;
    public String serv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);


        Intent intent = getIntent();
        String opt = intent.getStringExtra(HomeActivity.EXTRA_MESSAGE);
        if(opt.equals("aid")){
            List();

        }else if(opt.equals("pctech")){
serv="pctech";

            services();

        }
        else if(opt.equals("mech")){
            serv="mech";
            services();

        }else if(opt.equals("elec")){
            serv="elec";
            services();

        }




    }




    public void Web(){

//        ListView listView = (ListView) findViewById(R.id.listviewweb);
  //      listView.setVisibility(View.GONE);

        WebView myWebView=(WebView)findViewById(R.id.webview1);

        myWebView.setVisibility(View.VISIBLE);

        if(option.equals("0")) {
            myWebView.loadUrl("https://sos-app-f413e.firebaseapp.com/SOSFirstAidKitContent/ApplyingAStripBandage/");

        }else if(option.equals("1")) {
            myWebView.loadUrl("https://sos-app-f413e.firebaseapp.com/SOSFirstAidKitContent/ApplyingAWrap/");

        }else if(option.equals("2")) {
            myWebView.loadUrl("https://sos-app-f413e.firebaseapp.com/SOSFirstAidKitContent/AssessingTheSituation/");

        }else if(option.equals("3")) {
            myWebView.loadUrl("https://sos-app-f413e.firebaseapp.com/SOSFirstAidKitContent/AttendingToTheStabWound/");

        }else if(option.equals("4")) {
            myWebView.loadUrl("https://sos-app-f413e.firebaseapp.com/SOSFirstAidKitContent/CleaningAndClosingAStabWound/");

        }else if(option.equals("5")) {
            myWebView.loadUrl("https://sos-app-f413e.firebaseapp.com/SOSFirstAidKitContent/HowToPerformTheHeimlichManeuverOnAToddler/");

        }else if(option.equals("6")) {
            myWebView.loadUrl("https://sos-app-f413e.firebaseapp.com/SOSFirstAidKitContent/HowToWrapAWrist/");

        }else if(option.equals("7")) {
            myWebView.loadUrl("https://sos-app-f413e.firebaseapp.com/SOSFirstAidKitContent/LearningTheBasicsOfBandaging/");

        }else if(option.equals("8")) {
            myWebView.loadUrl("https://sos-app-f413e.firebaseapp.com/SOSFirstAidKitContent/PerformingTheHeimlichManeuverOnYourself/");

        }else if(option.equals("9")) {
            myWebView.loadUrl("https://sos-app-f413e.firebaseapp.com/SOSFirstAidKitContent/PreparingToPerformTheHeimlichManeuver/");

        }else if(option.equals("10")) {
            myWebView.loadUrl("https://sos-app-f413e.firebaseapp.com/SOSFirstAidKitContent/StoppingMinorBleedingFromSmallCuts/");

        }else if(option.equals("11")) {
            myWebView.loadUrl("https://sos-app-f413e.firebaseapp.com/SOSFirstAidKitContent/TakingCareOfCuts/");

        }else if(option.equals("12")) {
            myWebView.loadUrl("https://sos-app-f413e.firebaseapp.com/SOSFirstAidKitContent/TakingCareOfMinorBurns/");

        }else if(option.equals("13")) {
            myWebView.loadUrl("https://sos-app-f413e.firebaseapp.com/SOSFirstAidKitContent/TakingCareOfPunctures/");

        }else if(option.equals("14")) {
            myWebView.loadUrl("https://sos-app-f413e.firebaseapp.com/SOSFirstAidKitContent/TakingCareOfSkinTears/");

        }else if(option.equals("15")) {
            myWebView.loadUrl("https://sos-app-f413e.firebaseapp.com/SOSFirstAidKitContent/TreatingYourInjuredWrist/");

        }

        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        //myWebView.setWebChromeClient(new WebChromeClient());
        // myWebView.setWebViewClient(new WebViewClient());
        // myWebView.setWebViewClient(new MyWebViewClient());
        //  myWebView.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);
        // myWebView.setInitialScale(50);
        //myWebView.getSettings().setBuiltInZoomControls(true);
        isInternetOn();



    }

    public void services(){

        ListView listView = (ListView) findViewById(R.id.listviewweb);
        listView.setVisibility(View.GONE);

        WebView myWebView=(WebView)findViewById(R.id.webview1);
        myWebView.setVisibility(View.GONE);

        if(serv.equals("pctech")) {

            LinearLayout LLTECH = (LinearLayout) findViewById(R.id.LLTech);
            LLTECH.setVisibility(View.VISIBLE);

            LinearLayout LLMECH = (LinearLayout) findViewById(R.id.LLMech);
            LLMECH.setVisibility(View.GONE);

            LinearLayout LLELEC=(LinearLayout)findViewById(R.id.LLElec);
            LLELEC.setVisibility(View.GONE);


        }else if(serv.equals("mech")) {
            LinearLayout LLELEC=(LinearLayout)findViewById(R.id.LLElec);
            LLELEC.setVisibility(View.GONE);


            LinearLayout LLTECH = (LinearLayout) findViewById(R.id.LLTech);
            LLTECH.setVisibility(View.GONE);

            LinearLayout LLMECH = (LinearLayout) findViewById(R.id.LLMech);
            LLMECH.setVisibility(View.VISIBLE);

        }else if(serv.equals("elec")) {

            LinearLayout LLELEC=(LinearLayout)findViewById(R.id.LLElec);
            LLELEC.setVisibility(View.VISIBLE);


            LinearLayout LLTECH = (LinearLayout) findViewById(R.id.LLTech);
            LLTECH.setVisibility(View.GONE);

            LinearLayout LLMECH = (LinearLayout) findViewById(R.id.LLMech);
            LLMECH.setVisibility(View.GONE);

        }
    }

    public void List(){
        // Get ListView object from xml
//Location------------------------------------------------
        ListView listView = (ListView) findViewById(R.id.listviewweb);
listView.setVisibility(View.VISIBLE);


        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data
        String[] values = new String[] { "Applying a Strip Bandage",
                "Applying a Wrap/Elastic Bandage",
                "Assessing the Situation",
                "Attending to the Stab Wound 2",
                "Cleaning and Closing a Stab Wound",
                "How to Perform the Heimlich Manoeuvre on a Toddler",
                "How to wrap a wrist",
                "Learning the Basics of Bandaging",
                "Performing the Heimlich Manoeuvre on Yourself",
                "Preparing to Perform the Heimlich Manoeuvre",
                "Stopping Minor Bleeding from Small Cuts",
                "Taking Care of Cuts",
                "Taking Care of Minor Burns",
                "Taking Care of Punctures",
                "Taking Care of Skin Tears",
                "Treating Your Injured Wrist",




        };


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.listview, R.id.textView4,values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;
                ListView listView = (ListView) findViewById(R.id.listviewweb);

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
                //      Toast.makeText(getApplicationContext(),
                //            "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                //           .show();

                String Item=String.valueOf(itemPosition);
                if(Item.equals("0")){
                    option="0";
                    Web();



                }else if(Item.equals("1")){
                    option="1";

                    Web();


                }else if(Item.equals("2")){
                    option="2";
                    Web();



                }else if(Item.equals("3")){
                    option="3";
                    Web();



                }else if(Item.equals("4")){
                    option="4";
                    Web();


                }else if(Item.equals("5")){
                    option="5";
                    Web();



                }else if(Item.equals("6")){
                    option="6";
                    Web();


                }else if(Item.equals("7")){
                    option="7";
                    Web();



                }else if(Item.equals("8")){
                    option="8";
                    Web();


                }else if(Item.equals("9")){
                    option="9";

                    Web();


                }else if(Item.equals("10")){
                    option="10";
                    Web();


                }else if(Item.equals("11")){
                    option="11";
                    Web();

                }else if(Item.equals("12")){
                    option="12";
                    Web();

                }else if(Item.equals("13")){
                    option="13";
                    Web();


                }else if(Item.equals("14")){
                    option="14";
                    Web();


                }else if(Item.equals("15")){
                    option="15";
                    Web();



                }else if(Item.equals("16")){
                    option="16";
                    Web();


                }
            }

        });





    }

 /*   private class MyChromeClient extends WebChromeClient {

        public void onPageStarted(WebView view, String url, Bitmap favicon ) {
            // TODO Auto-generated method stub
            //     LinearLayout loading =(LinearLayout)findViewById(R.id.loading);

            //     loading.setVisibility(View.VISIBLE);

        }


        public void onPageFinished(WebView view, String url) {
            // TODO Auto-generated method stub
            //super.onPageFinished(view, url);
            // LinearLayout loading =(LinearLayout)findViewById(R.id.loading);

            //  loading.setVisibility(View.GONE);
        }

    }  */

    public void call(View v){
//        String no=getString(R.string.Consumer_Court);
        String no="578654542";
        Uri number = Uri.parse("tel:"+no);
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
     //   getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            LinearLayout LLTECH = (LinearLayout) findViewById(R.id.LLTech);
            LLTECH.setVisibility(View.GONE);

            LinearLayout LLMECH = (LinearLayout) findViewById(R.id.LLMech);
            LLMECH.setVisibility(View.GONE);

            LinearLayout LLELEC=(LinearLayout)findViewById(R.id.LLElec);
            LLELEC.setVisibility(View.GONE);
            WebView myWebView=(WebView)findViewById(R.id.webview1);
            myWebView.setVisibility(View.VISIBLE);

            WebSettings webSettings = myWebView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            myWebView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSduGWdzxp8TyZCV9cvgL2wsvv2cEcQ81aw6s3tpPED0j-ls7w/viewform?c=0&w=1");


            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public final boolean isInternetOn() {

        // get Connectivity Manager object to check connection
        ConnectivityManager connec =
                (ConnectivityManager)getSystemService(getBaseContext().CONNECTIVITY_SERVICE);

        // Check for network connections
        if ( connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.CONNECTED ||
                connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.CONNECTING ||
                connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.CONNECTING ||
                connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.CONNECTED ) {

            // if connected with internet

            Toast.makeText(this, " Loading... ", Toast.LENGTH_LONG).show();
            return true;

        } else if (
                connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.DISCONNECTED ||
                        connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.DISCONNECTED  ) {
            WebView myWebView = (WebView) findViewById(R.id.webview1);
            myWebView.setVisibility(View.GONE);
            Toast.makeText(this, "ERROR!! Please Connect to internet ", Toast.LENGTH_LONG).show();
            return false;
        }
        return false;
    }



}
