package com.example.android.common;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by leela_vadde on 12/15/16.
 */

public class SendIntents extends AppCompatActivity{
    /**
     *
     * @param youtubeId - id of the youtube video
     * @return - Intent to start youtube app with the video passed as input
     */
    final static String youtubeUrl = "https://www.youtube.com/watch?v=";
    public static Intent sendAppIntent (String youtubeId) {
        Intent youtubeIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:"+youtubeId));
        return youtubeIntent;
    }

    /**
     * @param urlToBeInvoked -URL of the music video to be invoked
     * @return - Intent to open the browser with the URL passed to the mehtod
     */
    public static Intent sendBrowserIntent (String urlToBeInvoked) {
        Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse(youtubeUrl + urlToBeInvoked));
        return  browserIntent;
    }


}
