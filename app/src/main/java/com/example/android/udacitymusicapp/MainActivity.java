package com.example.android.udacitymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView teluguSongsTextView = (TextView) findViewById(R.id.telugu_songs_text_view);
        teluguSongsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TeluguSongsIntent = new Intent(MainActivity.this, TeluguSongs.class);
                startActivity(TeluguSongsIntent);
            }
        });

        final TextView popCultureTextView = (TextView) findViewById(R.id.pop_culture_text_view);
        popCultureTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popCultureIntent = new Intent(MainActivity.this, FamousPop.class);
                startActivity(popCultureIntent);
            }
        });

        TextView top40TextView = (TextView) findViewById(R.id.Top_40_text_view);
        top40TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent top40Intent = new Intent(MainActivity.this, Top40.class);
                startActivity(top40Intent);
            }
        });

        TextView classicSongsTextView = (TextView) findViewById(R.id.classic_text_view);
        classicSongsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent classSongsIntent = new Intent(MainActivity.this, ClassicSongs.class);
                startActivity(classSongsIntent);
            }
        });
    }
}
