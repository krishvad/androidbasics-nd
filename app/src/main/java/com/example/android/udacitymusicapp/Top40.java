package com.example.android.udacitymusicapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.common.SendTextViewIntents;


public class Top40 extends AppCompatActivity {
    String[] top40YouTubeIds = {"b4Bj7Zb-YD4", "2RRY3OVqtwc", "WDZJPJV__bQ", "hdw1uKiTI5c"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top_40);
        Context context = getApplicationContext();


        //Creating an OnClickListener for My way by Calvin Harris
        TextView chMyWay = (TextView) findViewById(R.id.top_40_1);
        //Creating an object for SendTextViewIntents to create and send an event when a TextView is tapped
        SendTextViewIntents chMyWayIntent = new SendTextViewIntents(context, top40YouTubeIds[0]);
        chMyWayIntent.createOnClickListers(chMyWay);

        //Creating an OnClickListener for Slumber Party by Britney Spears
        TextView bsSlumberParty = (TextView) findViewById(R.id.top_40_2);
        //Creating an object for SendTextViewIntents to create and send an event when a TextView is tapped
        SendTextViewIntents bsSlumberPartyIntent = new SendTextViewIntents(context, top40YouTubeIds[1]);
        bsSlumberPartyIntent.createOnClickListers(bsSlumberParty);

        //Creating an OnClickListener for Formation by Beyonce
        TextView beyonceFormation = (TextView) findViewById(R.id.top_40_3);
        //Creating an object for SendTextViewIntents to create and send an event when a TextView is tapped
        SendTextViewIntents beyonceFormationIntent = new SendTextViewIntents(context, top40YouTubeIds[2]);
        beyonceFormationIntent.createOnClickListers(beyonceFormation);

        //Creating an OnClickListener for Rise by Kary Perry
        TextView kpRise = (TextView) findViewById(R.id.top_40_4);
        //Creating an object for SendTextViewIntents to create and send an event when a TextView is tapped
        SendTextViewIntents kpRiseIntent = new SendTextViewIntents(context, top40YouTubeIds[3]);
        kpRiseIntent.createOnClickListers(kpRise);

        //Adding intents for Home button to load activity_main.xml
        Button goToHome = (Button) findViewById(R.id.go_home);
        goToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHomeIntent = new Intent(Top40.this, MainActivity.class);
                startActivity(goHomeIntent);
            }
        });

        //Adding intents for "Go to Classic" button to load classic_songs.xml layout
        Button goToClassic = (Button) findViewById(R.id.go_to_classic);
        goToClassic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToClassicIntent = new Intent(Top40.this, ClassicSongs.class);
                startActivity(goToClassicIntent);
            }
        });

        //Adding intents for "Go to Famous pop" button to load famous_pop.xml layout
        Button goToFamousPop = (Button) findViewById(R.id.go_to_pop);
        goToFamousPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToFamousPopIntent = new Intent(Top40.this, FamousPop.class);
                startActivity(goToFamousPopIntent);
            }
        });

    }
}