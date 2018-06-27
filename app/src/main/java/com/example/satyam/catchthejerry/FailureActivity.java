package com.example.satyam.catchthejerry;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FailureActivity extends AppCompatActivity {

    MediaPlayer fail;
    int noOfClicks, difficultyLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_failure);

        fail = MediaPlayer.create(this, R.raw.failuretone);
        fail.start();

        Intent caller = getIntent();
        noOfClicks = caller.getIntExtra("clicks", 1);
        difficultyLevel = caller.getIntExtra("level",3);
    }

    public void decideLevel(View v) {
        if(difficultyLevel == 1) {
            Intent easylevel = new Intent();
            easylevel.setClass(this, Easy.class);
            easylevel.putExtra("clicks",noOfClicks);
            easylevel.putExtra("level",difficultyLevel);
            startActivity(easylevel);
            finish();
        }

        else {
            Intent hardlevl = new Intent();
            hardlevl.setClass(this, Hard.class);
            hardlevl.putExtra("clicks",noOfClicks);
            hardlevl.putExtra("level",difficultyLevel);
            startActivity(hardlevl);
            finish();
        }
    }
}
