package s.o.s;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class LocationActivity extends AppCompatActivity {

    public View PhonenoLayout;
    public String location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        Intent intent = getIntent();
        String opt = intent.getStringExtra(HomeActivity.EXTRA_MESSAGE);
if(opt.equals("med")){
    med();
}else if(opt.equals("fire")){
    fire();
}else if(opt.equals("police")){
    police();
}else if(opt.equals("bloodb")){
    bloodb();
}else if(opt.equals("mseb")){
    mseb();
}else if(opt.equals("dm")){
    dm();
}else if(opt.equals("ed")){
    ed();
}
    }

    public void med(){

        // Get ListView object from xml
//Location------------------------------------------------
        final ListView listView = (ListView) findViewById(R.id.listview);

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data
        String[] values = new String[] { "Sanjay Hospital, Vashi",
                "Aayush Muncipeciality Hospital, Airoli",
                "Achary Shri Nanesh Hospital, CBD",
                "Apollo Hospital CBD, Belapur",
                "Indian Burns Research Society, Airoli",
                "Critical ICU Super Speciality Center, Airoli",
                "Laxmi MUlti Speciality ICU, Ghansoli",
                "Mangalprabhu Nursing Home, Juinagar",
                "Ashirwad Hospital, koparkhairne",
                "OM Gagangiri Hospital, koparkhairne",
                "Sai Snehdeep Hospital, koparkhairne",
                "Dr DY Patil Hospital, Nerul",
                "Terana Sahyadri Speciality Hospital, Nerul",
                "Manak Health care Hospital, Nerul",
                "Dr Mahajan Hospital, Rabale",
                "Dr R.N Patils Suraj Hospital, Sanpada",
                "New Milenium Multi Speciality Hospital, Sanpada",
                "Mahatma Gandhi Mission Trust New Bombay Hospital, Vashi",
                "Hiranandani Hospital, Vashi"

        };

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        //              android.R.layout.simple_list_item_1, android.R.id.text1, values);


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
                PhonenoLayout=(View)findViewById(R.id.layoutPhone);

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
  /*              Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();
*/
                String Item=String.valueOf(itemPosition);
                if(Item.equals("0")){
                    String no=getString(R.string.Sanjyoti_Hospital_Vashi);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("1")){
                    String no=getString(R.string.Aayush_Muncipeciality_Hospital_Airoli);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("2")){
                    String no=getString(R.string.Achary_Shri_Nanesh_Hospital_CBD);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("3")){
                    String no=getString(R.string.Apollo_Hospital_CBD_Belapur);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("4")){
                    String no=getString(R.string.Indian_Burns_Research_Society_Airoli);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("5")){
                    String no=getString(R.string.Critical_ICU_Super_Speciality_Center_Airoli);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("6")){
                    String no=getString(R.string.Laxmi_MUlti_Speciality_ICU_Ghansoli);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("7")){
                    String no=getString(R.string.Mangalprabhu_Nursing_Home_Juinagar);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("8")){
                    String no=getString(R.string.Ashirwad_Hospital_koparkhairne);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("9")){
                    String no=getString(R.string.OM_Gagangiri_Hospital_koparkhairne);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("10")){
                    String no=getString(R.string.Sai_Snehdeep_Hospital_koparkhairne);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("11")){
                    String no=getString(R.string.Dr_Dy_Patil_Hospital_Nerul);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("12")){
                    String no=getString(R.string.Terana_Sahyadri_Speciality_Hospital_Nerul);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("13")){
                    String no=getString(R.string.Manak_Health_care_Hospital_Nerul);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("14")){
                    String no=getString(R.string.Dr_Mahajan_Hospital_Rabale);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("15")){
                    String no=getString(R.string.Dr_R_N_Patils_Suraj_Hospital_Sanpada);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("16")){
                    String no=getString(R.string.New_Milenium_Multi_Speciality_Hospital_Sanpada);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("17")){
                    String no=getString(R.string.Mahatma_Gandhi_Mission_Trust_New_Bombay_Hospital_Vashi);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("18")){
                    String no=getString(R.string.Hiranandani_Hospital_Vashi);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }



            }

        });


    }

    public void fire(){

        // Get ListView object from xml
//Location------------------------------------------------
        final ListView listView = (ListView) findViewById(R.id.listview);

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data
        String[] values = new String[] { "Vashi Fire Station",
                "CBD Belapur Fire Station",
                "Airoli Fire Station",
                "Kalamboli Fire Station",
                "Thane Fire Station",
                "New Panvel Fire Station"
        };

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        //              android.R.layout.simple_list_item_1, android.R.id.text1, values);


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
                PhonenoLayout=(View)findViewById(R.id.layoutPhone);

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
  /*              Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();
*/
                String Item=String.valueOf(itemPosition);
                if(Item.equals("0")){
                    String no=getString(R.string.Vashi_Fire_Station);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("1")){
                    String no=getString(R.string.CBD_Belapur_Fire_Station);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("2")){
                    String no=getString(R.string.Airoli_Fire_Station);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("3")){
                    String no=getString(R.string.Kalamboli_Fire_Station);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("4")){
                    String no=getString(R.string.Thane_Fire_Station);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("5")){
                    String no=getString(R.string.New_Panvel_Fire_Station);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }

            }

        });


    }

    public void police(){

        // Get ListView object from xml
//Location------------------------------------------------
        final ListView listView = (ListView) findViewById(R.id.listview);

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data
        String[] values = new String[] { "CBD Belapur Police Station",
                "Rabale Police Station",
                "Sanpada Police Station",
                "Kharghar Police Station",
                "Kamothe Police Station",
                "Vashi Police Station",
                "Nerul Police Station",
                "Panvel Police Station"
        };

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        //              android.R.layout.simple_list_item_1, android.R.id.text1, values);


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
                PhonenoLayout=(View)findViewById(R.id.layoutPhone);

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
 /*               Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();
*/
                String Item=String.valueOf(itemPosition);
                if(Item.equals("0")){
                    String no=getString(R.string.CBD_Belapur_Police_Station);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("1")){
                    String no=getString(R.string.Rabale_Police_Station);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("2")){
                    String no=getString(R.string.Sanpada_Police_Station);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("3")){
                    String no=getString(R.string.Kharghar_Police_Station);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("4")){
                    String no=getString(R.string.Kamothe_Police_Station);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("5")){
                    String no=getString(R.string.Vashi_Police_Station);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("6")){
                    String no=getString(R.string.Nerul_Police_Station);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("7")){
                    String no=getString(R.string.Panvel_Police_Station);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }

            }

        });


    }

    public void bloodb(){

        // Get ListView object from xml
//Location------------------------------------------------
        final ListView listView = (ListView) findViewById(R.id.listview);

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data
        String[] values = new String[] { "NMMC Vashi Hospital Blood Bank, Vashi",
                "Saikrupa JVP Blood Bank, Vashi",
                "MGM Bombay Hospital Blood Bank, Vashi",
                "Hindustan Hospital Fortis Blood Bank, Vashi",
                "Dr D.Y Patil Hospital Blood Bank, Nerul",
                "Terna Blood Bank, Nerul",
                "Sadguru Blood Bank, Koparkhairne"
        };

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        //              android.R.layout.simple_list_item_1, android.R.id.text1, values);


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
                PhonenoLayout=(View)findViewById(R.id.layoutPhone);

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
  /*              Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();
*/
                String Item=String.valueOf(itemPosition);
                if(Item.equals("0")){
                    String no=getString(R.string.NMMC_Vashi_Hospital_Blood_Bank_Vashi);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("1")){
                    String no=getString(R.string.Saikrupa_JVP_Blood_Bank_Vashi);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("2")){
                    String no=getString(R.string.MGM_Bombay_Hospital_Blood_Bank_Vashi);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("3")){
                    String no=getString(R.string.Hindustan_Hospital_Fortis_Blood_Bank_Vashi);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("4")){
                    String no=getString(R.string.Dr_DY_Patil_Hospital_Blood_Bank_Nerul);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("5")){
                    String no=getString(R.string.Terna_Blood_Bank_Nerul);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("6")){
                    String no=getString(R.string.Sadguru_Blood_Bank_Koparkhairne);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }

            }

        });


    }


    public void mseb(){

        // Get ListView object from xml
//Location------------------------------------------------
        final ListView listView = (ListView) findViewById(R.id.listview);

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data
        String[] values = new String[] { "MSEB Koparkhairne",
                "MSEB New Panvel",
                "MSEB CBD Belapur",
                "MSEB Nerul",
                "MSEB Vashi",
                "MSEB Vashi(Alternative)",
                "MSEB Airoli",
                "MSEB Rabale",
                "MSEB Ghansoli",
                "MSEB Mahape"
        };

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        //              android.R.layout.simple_list_item_1, android.R.id.text1, values);


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
                PhonenoLayout=(View)findViewById(R.id.layoutPhone);

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
/*                Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();
*/
                String Item=String.valueOf(itemPosition);
                if(Item.equals("0")){
                    String no=getString(R.string.MSEB_Koparkhairne);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("1")){
                    String no=getString(R.string.MSEB_New_Panvel);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("2")){
                    String no=getString(R.string.MSEB_CBD_Belapur);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("3")){
                    String no=getString(R.string.MSEB_Nerul1);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("4")){
                    String no=getString(R.string.MSEB_Vashi2);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("5")){
                    String no=getString(R.string.MSEB_Vashi2);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("6")){
                    String no=getString(R.string.MSEB_Airoli);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("7")){
                    String no=getString(R.string.MSEB_Rabale);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("8")){
                    String no=getString(R.string.MSEB_Ghansoli);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("9")){
                    String no=getString(R.string.MSEB_Mahape);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }



            }

        });


    }

    public void dm(){

        // Get ListView object from xml
//Location------------------------------------------------
        final ListView listView = (ListView) findViewById(R.id.listview);

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data
        String[] values = new String[] { "Disaster_Management",
                "Disaster_Management (Alternative)"

        };

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        //              android.R.layout.simple_list_item_1, android.R.id.text1, values);


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
                PhonenoLayout=(View)findViewById(R.id.layoutPhone);

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
  /*              Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();
*/
                String Item=String.valueOf(itemPosition);
                if(Item.equals("0")){
                    String no=getString(R.string.Disaster_Management1);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("1")){
                    String no=getString(R.string.Disaster_Management2);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }


            }

        });


    }

    public void ed(){

        // Get ListView object from xml
//Location------------------------------------------------
        final ListView listView = (ListView) findViewById(R.id.listview);

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data
        String[] values = new String[] { "Encroachment Department",
                "Encroachment Department (Alternative)"

        };

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        //              android.R.layout.simple_list_item_1, android.R.id.text1, values);


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
                PhonenoLayout=(View)findViewById(R.id.layoutPhone);

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
    /*            Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();
*/
                String Item=String.valueOf(itemPosition);
                if(Item.equals("0")){
                    String no=getString(R.string.Encroachment_Department1);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }else if(Item.equals("1")){
                    String no=getString(R.string.Encroachment_Department2);

                    Uri number = Uri.parse("tel:"+no);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);


                }


            }

        });


    }


}
