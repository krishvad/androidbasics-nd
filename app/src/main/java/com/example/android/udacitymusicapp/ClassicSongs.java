package com.example.android.udacitymusicapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.android.common.SendTextViewIntents;


public class ClassicSongs extends AppCompatActivity {
    String[] classicYouTubeIds = {"mEg5oWW5F2c", "v4R0f3fAXEk", "OMD8hBsA-RI", "Tj75Arhq5ho"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.classic_songs);
        Context context = getApplicationContext();


        //Creating an OnClickListener for Beat it by Tab Hunter's One lone
        TextView tbOneLove = (TextView) findViewById(R.id.classic_1);
        //Creating an object for SendTextViewIntents to create and send an event when a TextView is tapped
        SendTextViewIntents tbOneLoveIntent = new SendTextViewIntents(context, classicYouTubeIds[0]);
        tbOneLoveIntent.createOnClickListers(tbOneLove);

        //Creating an OnClickListener for Love Letter by Elvis
        TextView epLoveLetters = (TextView) findViewById(R.id.classic_2);
        //Creating an object for SendTextViewIntents to create and send an event when a TextView is tapped
        SendTextViewIntents epLoveLettersIntent = new SendTextViewIntents(context, classicYouTubeIds[1]);
        epLoveLettersIntent.createOnClickListers(epLoveLetters);

        //Creating an OnClickListener for Faithfully.. by Journey band
        TextView faithfullyJourney = (TextView) findViewById(R.id.classic_3);
        //Creating an object for SendTextViewIntents to create and send an event when a TextView is tapped
        SendTextViewIntents faithfullyJourneyIntent = new SendTextViewIntents(context, classicYouTubeIds[2]);
        faithfullyJourneyIntent.createOnClickListers(faithfullyJourney);

        //Creating an OnClickListener for Nothing else matters by Metallica
        TextView nothingElseMetallica = (TextView) findViewById(R.id.classic_4);
        //Creating an object for SendTextViewIntents to create and send an event when a TextView is tapped
        SendTextViewIntents nothingElseMetallicaIntent = new SendTextViewIntents(context, classicYouTubeIds[3]);
        nothingElseMetallicaIntent.createOnClickListers(nothingElseMetallica);
    }
}