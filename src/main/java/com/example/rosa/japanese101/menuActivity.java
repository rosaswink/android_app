package com.example.rosa.japanese101;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class menuActivity extends AppCompatActivity {

    private ImageButton hiragana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        hiragana = (ImageButton)findViewById(R.id.hiragana);
        hiragana.setImageResource(R.drawable.hiragana);
    }

    public void startHiragana(View v){
        hiragana.setImageResource(R.drawable.hiragana1);
        Intent intent1 = new Intent(this, hiraganaMenuActivity.class);
        startActivity(intent1);
        finish();
    }
}
