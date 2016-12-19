package com.example.android.common;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Class that sends intents
 */
public class SendTextViewIntents {
    String youtubeId;
    Context context;
    private String youtubeNotFoundMessage = "YouTube App is great, you should try it!";

    /**
     * Constructor of this class to initialize class variables
     * @param context - context of the app
     * @param youtubeId - youtubeId to be sent to the intent
     */
    public SendTextViewIntents (Context context, String youtubeId) {
        this.youtubeId = youtubeId;
        this.context = context;
    }

    /**
     * Creating listeners on text view and sending intents based on the textview clicked on
     * @param textView - TextView to create OnClickListers for
     */
    public void createOnClickListers (TextView textView) {
        textView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent youtubeIntent = SendIntents.sendAppIntent(youtubeId);

                    //setting the flag to become the start of a new task
                    //More info here: https://developer.android.com/reference/android/content/Intent.html#FLAG_ACTIVITY_NEW_TASK
                    youtubeIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(youtubeIntent);
                } catch (ActivityNotFoundException e) {
                    Intent browserIntent = SendIntents.sendBrowserIntent(youtubeId);
                    browserIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    sendToast(context, youtubeNotFoundMessage);
                    context.startActivity(browserIntent);
                }
            }
        });

    }

    /**
     * This function creates and shows a toast by taking app context and toast message as inputs
     * @param context - getApplicationContext
     * @param toastMessage - message to be displayed on the toast
     */
    private void sendToast(Context context, String toastMessage) {
        Toast toast = Toast.makeText(context, toastMessage, Toast.LENGTH_LONG);
        toast.show();
    }

}


