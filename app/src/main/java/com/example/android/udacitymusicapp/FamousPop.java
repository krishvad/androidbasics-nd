package com.example.android.udacitymusicapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.android.common.SendTextViewIntents;


public class FamousPop extends AppCompatActivity {
    String[] famousPopYouTubeIds = {"Ym0hZG-zNOk", "3JWTaaS7LdU", "nf9tUjp7208", "Zn5OJGucveg"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.famous_pop);
        Context context = getApplicationContext();


        //Creating an OnClickListener for Beat it by MJ TextView
        TextView mjBeatItTextView = (TextView) findViewById(R.id.famous_pop_1);

        //Creating an object for SendTextViewIntents to create and send an event when a TextView is tapped
        SendTextViewIntents mjBeatItIntent = new SendTextViewIntents(context, famousPopYouTubeIds[0]);
        mjBeatItIntent.createOnClickListers(mjBeatItTextView);

        //Creating an OnClickListener for I will always love you by WH
        TextView wjIWillAlwaysLoveYou = (TextView) findViewById(R.id.famous_pop_2);

        //Creating an object for SendTextViewIntents to create and send an event when a TextView is tapped
        SendTextViewIntents wjIWillAlwaysLoveYouEvent = new SendTextViewIntents(context, famousPopYouTubeIds[1]);
        wjIWillAlwaysLoveYouEvent.createOnClickListers(wjIWillAlwaysLoveYou);

        //Creating an OnClickListener for Daddy Cool by Prince
        TextView priceDaddyCool = (TextView) findViewById(R.id.famous_pop_3);

        //Creating an object for SendTextViewIntents to create and send an event when a TextView is tapped
        SendTextViewIntents priceDaddyCoolIntent = new SendTextViewIntents(context, famousPopYouTubeIds[2]);
        priceDaddyCoolIntent.createOnClickListers(priceDaddyCool);

        //Creating an OnClickListener for Crazy for you by Madonna
        TextView maddonaCrazyForYou = (TextView) findViewById(R.id.famous_pop_4);

        //Creating an object for SendTextViewIntents to create and send an event when a TextView is tapped
        SendTextViewIntents maddonaCrazyForYouIntent = new SendTextViewIntents(context, famousPopYouTubeIds[3]);
        maddonaCrazyForYouIntent.createOnClickListers(maddonaCrazyForYou);
    }
}