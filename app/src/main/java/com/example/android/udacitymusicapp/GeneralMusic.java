package com.example.android.udacitymusicapp;

import android.content.ActivityNotFoundException;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.apmem.tools.layouts.FlowLayout;

import java.util.ArrayList;

/**
 * Created by leela_vadde on 12/11/16.
 */

public class GeneralMusic extends AppCompatActivity{
    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top_40);
        TextView pop_song_1 = (TextView) findViewById(R.id.famous_pop_1);
        pop_song_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    startActivity(SendIntents.sendAppIntent("DBcVPsTmG5I"));
                } catch (ActivityNotFoundException e) {
                    CharSequence exceptionMessage = "Youtube is a great app. you should try it music lover";
                    Toast youtubeNotFound = Toast.makeText(
                            getApplicationContext(),
                            exceptionMessage,
                            Toast.LENGTH_LONG);
                    youtubeNotFound.show();

                    startActivity(SendIntents.sendBrowserIntent("https://www.youtube.com/watch?v="+"fRh_vgS2dFE"));
                    Log.i("Exception text", e.toString());
                }
            }
        });

        FlowLayout generalMusicParentLayout = (FlowLayout) findViewById(R.id.general_music_parent_layout);
        ArrayList<TextView>  textViewArrayList = new ArrayList<>();

        for (int i = 0; i < generalMusicParentLayout.getChildCount(); i++) {
            if (generalMusicParentLayout.getChildAt(i) instanceof  TextView) {
                textViewArrayList.add(i, (TextView) generalMusicParentLayout.getChildAt(i));
                Log.v ("Text view text", (textViewArrayList.get(i)).getText().toString());
            }
        }
    }
}
