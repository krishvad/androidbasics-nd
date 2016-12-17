package com.example.android.udacitymusicapp;

import android.content.ActivityNotFoundException;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.util.Log;


public class PopCulture extends AppCompatActivity{
    String[] popYoutubeId = {"Ym0hZG-zNOk", "3JWTaaS7LdU", "C-u5WLJ9Yk4", "ViwtNLUqkMY"};

    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView(R.layout.pop_culture);

        TextView mjBeatIt = (TextView) findViewById(R.id.famous_pop_1);
        mjBeatIt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v ("SOMETHING", "IN TRY BLOCK");
                try {
                    Log.v ("SOMETHING", "IN TRY BLOCK1");
                    startActivity(SendIntents.sendAppIntent(popYoutubeId[0]));
                } catch (ActivityNotFoundException e) {
                    Log.v("SOMETHING", "IN CATCH BLOCK");
                    startActivity(SendIntents.sendBrowserIntent(popYoutubeId[0]));
                }

            }
        });

//        LinearLayout popCultureParent = (LinearLayout) findViewById(R.id.pop_culture_parent);
//        for (i=0; i<popCultureParent.getChildCount(); i++) {
//            if (popCultureParent.getChildAt(i) instanceof TextView){
//                TextView tempTextView = (TextView) popCultureParent.getChildAt(i);
//                tempTextView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        try {
//                            SendIntents.sendAppIntent(popYoutubeId[i]);
//
//                        } catch (ActivityNotFoundException e) {
//                            SendIntents.sendBrowserIntent(popYoutubeId[i]);
//                        }
//                    }
//                });
//            }
//        }




    }

}
