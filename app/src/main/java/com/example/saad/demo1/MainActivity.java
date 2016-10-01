package com.example.saad.demo1;
import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.app.Fragment;
import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AndroidAppUri;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import layout.fragment_one;
import layout.web_frag;

public class MainActivity extends android.support.v4.app.FragmentActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    ImageButton iv;
    //LinearLayout li;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView adressBtn = (TextView)findViewById(R.id.address);
        adressBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello Adress", Toast.LENGTH_SHORT).show();
                LinearLayout address = (LinearLayout) findViewById(R.id.address_info);
                address.setVisibility(View.VISIBLE);
                TextView headoffice = (TextView) findViewById(R.id.headoffice_head);
                TextView karachi = (TextView) findViewById(R.id.karachi_head);
                TextView lahore = (TextView) findViewById(R.id.lahore_head);
                TextView headoffice_info = (TextView) findViewById(R.id.headoffice_info);
                TextView karachi_info = (TextView) findViewById(R.id.karachi_info);
                TextView lahore_info = (TextView) findViewById(R.id.lahore_info);
                headoffice.setText("Head Office");
                karachi.setText("Karachi");
                lahore.setText("Lahore");
                headoffice_info.setText("PIA Building\n" +
                        "49 Blue Area, Fazl-ul-Haq Road");
                karachi_info.setText("State Life Building 1 - C\n" +
                        "I.I. Chundrigar Road" );
                lahore_info.setText("23-C, Aziz Avenue\n" +
                        "Canal Bank, Gulberg 5");
                WebView webv = (WebView) findViewById(R.id.webView);
                webv.setVisibility(View.INVISIBLE);
            }
        });
        TextView contactBtn = (TextView)findViewById(R.id.contact);
        contactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello Contacts", Toast.LENGTH_SHORT).show();
                LinearLayout lay = (LinearLayout) findViewById(R.id.address_info);
                TextView headoffice = (TextView) findViewById(R.id.headoffice_head);
                TextView karachi = (TextView) findViewById(R.id.karachi_head);
                TextView lahore = (TextView) findViewById(R.id.lahore_head);
                TextView headoffice_info = (TextView) findViewById(R.id.headoffice_info);
                TextView karachi_info = (TextView) findViewById(R.id.karachi_info);
                TextView lahore_info = (TextView) findViewById(R.id.lahore_info);

                headoffice_info.setText("Telephone No: " +
                        "[92](51)2273457-9\n" +
                        "Emai Address: saadahmed726@gmail.com");
                karachi_info.setText("Telephone No: " +
                        "[92](21)32426682-5\n" +
                        "Emai Address: saadahmed726@gmail.com");
                lahore_info.setText("Telephone No: " +
                        "[92](42)35715868-71\n" +
                        "Emai Address: saadahmed726@gmail.com");
                WebView webv = (WebView) findViewById(R.id.webView);
                lay.setVisibility(View.VISIBLE);
                webv.setVisibility(View.INVISIBLE);

            }
        });
        TextView siteBtn = (TextView)findViewById(R.id.site_map);
        siteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello Site Map", Toast.LENGTH_SHORT).show();
                LinearLayout lay = (LinearLayout) findViewById(R.id.address_info);
                TextView headoffice = (TextView) findViewById(R.id.headoffice_head);
                TextView karachi = (TextView) findViewById(R.id.karachi_head);
                TextView lahore = (TextView) findViewById(R.id.lahore_head);
                TextView headoffice_info = (TextView) findViewById(R.id.headoffice_info);
                TextView karachi_info = (TextView) findViewById(R.id.karachi_info);
                TextView lahore_info = (TextView) findViewById(R.id.lahore_info);
                lay.setVisibility(View.VISIBLE);
                headoffice.setText("");
                karachi.setText("");
                lahore.setText("");
                headoffice_info.setText("");
                karachi_info.setText("");
                lahore_info.setText("");
                String url2="http://www.street-view.net/streetview/@40.731394,-73.996944,z14,h-137,p9,z1,en";
                String url = "https://maps.googleapis.com/maps/api/streetview?size=600x300&location=46.414382,10.013988&heading=151.78&pitch=-0.76&key=AIzaSyAz05NRkTUUw-NMCl0rn-43S5HNRfzLR5Q";
                WebView webv = (WebView) findViewById(R.id.webView);
                webv.getSettings().setJavaScriptEnabled(true);
                webv.loadUrl(url2);
                webv.setVisibility(View.VISIBLE);

            }
        });
        iv = (ImageButton)findViewById(R.id.Image1);
        //li = (LinearLayout)findViewById(R.id.fragment_container);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Button clicked",Toast.LENGTH_SHORT).show();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                web_frag webFrag = new web_frag();
                fragment_one frag1 = new fragment_one();
                fragmentTransaction.add(R.id.final123,webFrag);
                fragmentTransaction.commit();
            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    public void rateapp1(View view) {
        ImageButton b1 = (ImageButton) findViewById(R.id.b1);
        ImageButton b2 = (ImageButton) findViewById(R.id.b2);
        ImageButton b3 = (ImageButton) findViewById(R.id.b3);
        ImageButton b4 = (ImageButton) findViewById(R.id.b4);
        TextView tv = (TextView) findViewById(R.id.rateText);
        b1.setBackgroundResource(R.drawable.rate);
        b2.setBackgroundResource(R.drawable.rate_blank);
        b3.setBackgroundResource(R.drawable.rate_blank);
        b4.setBackgroundResource(R.drawable.rate_blank);
        tv.setText("  2.4%");
tv.setVisibility(View.VISIBLE);
    }

    public void rateapp2(View view) {
        ImageButton b1 = (ImageButton) findViewById(R.id.b1);
        ImageButton b2 = (ImageButton) findViewById(R.id.b2);
        ImageButton b3 = (ImageButton) findViewById(R.id.b3);
        ImageButton b4 = (ImageButton) findViewById(R.id.b4);
        b1.setBackgroundResource(R.drawable.rate);
        b2.setBackgroundResource(R.drawable.rate);
        b3.setBackgroundResource(R.drawable.rate_blank);
        b4.setBackgroundResource(R.drawable.rate_blank);
        TextView tv = (TextView) findViewById(R.id.rateText);
        tv.setText("  5.2%");
        tv.setVisibility(View.VISIBLE);

    }

    public void rateapp3(View view) {
        ImageButton b1 = (ImageButton) findViewById(R.id.b1);
        ImageButton b2 = (ImageButton) findViewById(R.id.b2);
        ImageButton b3 = (ImageButton) findViewById(R.id.b3);
        ImageButton b4 = (ImageButton) findViewById(R.id.b4);
        b1.setBackgroundResource(R.drawable.rate);
        b2.setBackgroundResource(R.drawable.rate);
        b3.setBackgroundResource(R.drawable.rate);
        b4.setBackgroundResource(R.drawable.rate_blank);
        TextView tv = (TextView) findViewById(R.id.rateText);
        tv.setText("  7.6%");
        tv.setVisibility(View.VISIBLE);

    }

    public void rateapp4(View view) {
        ImageButton b1 = (ImageButton) findViewById(R.id.b1);
        ImageButton b2 = (ImageButton) findViewById(R.id.b2);
        ImageButton b3 = (ImageButton) findViewById(R.id.b3);
        ImageButton b4 = (ImageButton) findViewById(R.id.b4);
        b1.setBackgroundResource(R.drawable.rate);
        b2.setBackgroundResource(R.drawable.rate);
        b3.setBackgroundResource(R.drawable.rate);
        b4.setBackgroundResource(R.drawable.rate);
        TextView tv = (TextView) findViewById(R.id.rateText);
        tv.setText("  100.0%");
        tv.setVisibility(View.VISIBLE);

    }

    public void anyMethod(View view) {

    }

    public void contact(View view) {
        /*
        LinearLayout lay = (LinearLayout) findViewById(R.id.address_info);
        TextView headoffice = (TextView) findViewById(R.id.headoffice_head);
        TextView karachi = (TextView) findViewById(R.id.karachi_head);
        TextView lahore = (TextView) findViewById(R.id.lahore_head);
        TextView headoffice_info = (TextView) findViewById(R.id.headoffice_info);
        TextView karachi_info = (TextView) findViewById(R.id.karachi_info);
        TextView lahore_info = (TextView) findViewById(R.id.lahore_info);

        headoffice_info.setText("Telephone No:\n" +
                "[92](51)2273457-9\n" +
                "[92](51)2870045-85\n");
        karachi_info.setText("Telephone No:\n" +
                "[92](21)32426682-5\n" +
                "[92](21)32426711-5\n");
        lahore_info.setText("Telephone No: \n" +
                "[92](42)35715868-71\n" +
                "[92](42)35775747-50\n");
        lay.setVisibility(View.VISIBLE); */
    }

    public void site(View view) {
        /*LinearLayout lay = (LinearLayout) findViewById(R.id.address_info);
        TextView headoffice = (TextView) findViewById(R.id.headoffice_head);
        TextView karachi = (TextView) findViewById(R.id.karachi_head);
        TextView lahore = (TextView) findViewById(R.id.lahore_head);
        TextView headoffice_info = (TextView) findViewById(R.id.headoffice_info);
        TextView karachi_info = (TextView) findViewById(R.id.karachi_info);
        TextView lahore_info = (TextView) findViewById(R.id.lahore_info);
        lay.setVisibility(View.VISIBLE);
        headoffice.setText("");
        karachi.setText("");
        lahore.setText("");
        headoffice_info.setText("");
        karachi_info.setText("");
        lahore_info.setText("");*/
    }

    public void ff(View view) {
        Toast.makeText(MainActivity.this, "Hello ff", Toast.LENGTH_SHORT).show();
        //this.getParent().onBackPressed();

        Intent intent = new Intent(this, MainActivity.class);
       // intent.putExtra(web_frag); // so you can pass what activity you're coming from, if needed
        startActivity(intent);
        this.finish();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.saad.demo1/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.saad.demo1/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }

}
