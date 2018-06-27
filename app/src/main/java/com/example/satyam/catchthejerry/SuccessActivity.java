package com.example.satyam.catchthejerry;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SuccessActivity extends AppCompatActivity {

    MediaPlayer success;
    int noOfClicks, difficultyLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        success = MediaPlayer.create(this, R.raw.theme);
        success.start();

        Intent caller = getIntent();
        noOfClicks = caller.getIntExtra("clicks", 1);
        difficultyLevel = caller.getIntExtra("level",3);

        TextView message = findViewById(R.id.textViewResult);
        message.setText("No of attempts : "+noOfClicks);
    }

    public void callMainMenu(View v) {
        Intent mainMenu = new Intent();
        mainMenu.setClass(this, SelectionActivity.class);
        startActivity(mainMenu);
        finish();
    }
}
