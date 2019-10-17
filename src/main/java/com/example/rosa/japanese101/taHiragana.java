package com.example.rosa.japanese101;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class taHiragana extends AppCompatActivity {

    MediaPlayer ta;
    private Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ta_hiragana);

        ta = MediaPlayer.create(this, R.raw.ta);
        next = (Button)findViewById(R.id.next);
    }

    public void playSound(View v){
        ta.start();
    }

    public void next(View v){
        next.setBackgroundColor(Color.parseColor("#5EBBD7F9"));
        next.setTextColor(Color.parseColor("#FF7DB9FD"));
        Intent intent = new Intent(this, ckPtOne.class);
        startActivity(intent);
        finish();
    }
}
