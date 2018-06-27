package com.example.satyam.catchthejerry;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityWelcomePage extends AppCompatActivity {

    MediaPlayer theme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        theme = MediaPlayer.create(this, R.raw.theme);
        theme.start();
    }

    public void selection(View v) {
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, SelectionActivity.class);
        startActivity(goToSecond);
        finish();
    }
}
