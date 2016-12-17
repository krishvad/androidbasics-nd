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

        TextView audioBooks = (TextView) findViewById(R.id.audio_books_text_view);
        audioBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent audioBooksIntent = new Intent(MainActivity.this, FamousPop.class);
                startActivity(audioBooksIntent);
            }
        });

        final TextView podCasts = (TextView) findViewById(R.id.pod_casts_text_view);
        podCasts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent podCastsIntent = new Intent(MainActivity.this, PodCasts.class);
                startActivity(podCastsIntent);
            }
        });

        TextView musicLibrary = (TextView) findViewById(R.id.music_lib_text_view);
        musicLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musicLibraryIntent = new Intent(MainActivity.this, GeneralMusic.class);
                startActivity(musicLibraryIntent);
            }
        });
    }
}
