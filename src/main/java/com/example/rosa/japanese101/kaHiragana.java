package com.example.rosa.japanese101;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kaHiragana extends AppCompatActivity {

    MediaPlayer ka;
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ka_hiragana);

        ka = MediaPlayer.create(this, R.raw.ka);
        next = (Button)findViewById(R.id.next);
    }

    public void playSound(View v){
        ka.start();
    }

    public void next(View v){
        next.setBackgroundColor(Color.parseColor("#5EBBD7F9"));
        next.setTextColor(Color.parseColor("#FF7DB9FD"));
        Intent intent = new Intent(this, saHiragana.class);
        startActivity(intent);
        finish();
    }
}
