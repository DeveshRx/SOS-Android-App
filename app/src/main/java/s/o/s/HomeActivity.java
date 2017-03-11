package s.o.s;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.security.Policy;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    public String option;

    private Camera camera;
    private boolean isFlashOn;
    private boolean hasFlash;
    private Policy.Parameters params;
    private MediaPlayer mp;

    public final static String EXTRA_MESSAGE = "XYZ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(), CameraActivity.class);
                startActivity(i);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        //Permissions
        if (ContextCompat.checkSelfPermission(this,
                android.Manifest.permission.CAMERA)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{android.Manifest.permission.CAMERA},
                    1);

            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.CALL_PHONE},
                    1);

        }
    }

    // Ask permission to access camera hadware
    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        switch (requestCode) {
            case 1: {

                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    // permission was granted, yay! Do the
                    // contacts-related task you need to do.
                } else {

                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                    Toast.makeText(HomeActivity.this, "Permission denied to read your External storage", Toast.LENGTH_SHORT).show();
                }
                return;
            }

            // other 'case' lines to check for other
            // permissions this app might request
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    public void med(View v) {
        Intent i = new Intent(getBaseContext(), LocationActivity.class);
        String message = "med";
        i.putExtra(EXTRA_MESSAGE, message);

        startActivity(i);
    }

    public void fire(View v) {
        Intent i = new Intent(getBaseContext(), LocationActivity.class);
        String message = "fire";
        i.putExtra(EXTRA_MESSAGE, message);

        startActivity(i);

    }

    public void police(View v) {
        Intent i = new Intent(getBaseContext(), LocationActivity.class);
        String message = "police";
        i.putExtra(EXTRA_MESSAGE, message);

        startActivity(i);
    }

    public void acbo(View v) {
        String no = getString(R.string.Anti_Courruption_Bureau_Office);

        Uri number = Uri.parse("tel:" + no);
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);

    }

    public void cid(View v) {
        String no = getString(R.string.CID);

        Uri number = Uri.parse("tel:" + no);
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);

    }

    public void garbage(View v) {
        String no = getString(R.string.Garbage_Complaints);

        Uri number = Uri.parse("tel:" + no);
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);

    }

    public void bloodb(View v) {

        Intent i = new Intent(getBaseContext(), LocationActivity.class);
        String message = "bloodb";
        i.putExtra(EXTRA_MESSAGE, message);

        startActivity(i);


    }

    public void mseb(View v) {

        Intent i = new Intent(getBaseContext(), LocationActivity.class);
        String message = "mseb";
        i.putExtra(EXTRA_MESSAGE, message);
        startActivity(i);

    }

    public void dm(View v) {

        Intent i = new Intent(getBaseContext(), LocationActivity.class);
        String message = "dm";
        i.putExtra(EXTRA_MESSAGE, message);
        startActivity(i);

    }

    public void ed(View v) {

        Intent i = new Intent(getBaseContext(), LocationActivity.class);
        String message = "ed";
        i.putExtra(EXTRA_MESSAGE, message);
        startActivity(i);

    }

    public void court(View v) {
        String no = getString(R.string.Consumer_Court);

        Uri number = Uri.parse("tel:" + no);
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);

    }

    public void torchON(View v) {
        camera = Camera.open();
        Camera.Parameters p = camera.getParameters();
        p.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
        camera.setParameters(p);
        camera.startPreview();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fabON);
        fab.setVisibility(View.GONE);


        FloatingActionButton fab1 = (FloatingActionButton) findViewById(R.id.fabOFF);
        fab1.setVisibility(View.VISIBLE);
    }

    public void torchOFF(View v) {
        camera = Camera.open();
        Camera.Parameters p = camera.getParameters();
        p.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
        camera.setParameters(p);
        camera.stopPreview();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fabON);
        fab.setVisibility(View.VISIBLE);


        FloatingActionButton fab1 = (FloatingActionButton) findViewById(R.id.fabOFF);
        fab1.setVisibility(View.GONE);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.camera) {
            Intent i = new Intent(getBaseContext(), CameraActivity.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.pctech) {
            Intent i = new Intent(getBaseContext(), WebActivity.class);
            String message = "pctech";
            i.putExtra(EXTRA_MESSAGE, message);
            startActivity(i);

            // Handle the camera action
        } else if (id == R.id.mech) {
            Intent i = new Intent(getBaseContext(), WebActivity.class);
            String message = "mech";
            i.putExtra(EXTRA_MESSAGE, message);
            startActivity(i);
        } else if (id == R.id.elec) {
            Intent i = new Intent(getBaseContext(), WebActivity.class);
            String message = "elec";
            i.putExtra(EXTRA_MESSAGE, message);
            startActivity(i);

        } else if (id == R.id.aid) {
            Intent i = new Intent(getBaseContext(), WebActivity.class);
            String message = "aid";
            i.putExtra(EXTRA_MESSAGE, message);
            startActivity(i);


        } else if (id == R.id.ticket) {

            Intent i = new Intent(getBaseContext(), TicketsActivity.class);
            String message = "ticket";
            i.putExtra(EXTRA_MESSAGE, message);
            startActivity(i);


        } else if (id == R.id.note) {

            Intent i = new Intent(getBaseContext(), NoteActivity.class);
            startActivity(i);


        } else if (id == R.id.web) {

            Intent i = new Intent(getBaseContext(), BrowserActivity.class);
            startActivity(i);


        } else if (id == R.id.services) {

            Intent i = new Intent(getBaseContext(), TicketsActivity.class);
            String message = "join";
            i.putExtra(EXTRA_MESSAGE, message);
            startActivity(i);


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
