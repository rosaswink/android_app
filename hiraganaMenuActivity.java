package com.example.rosa.japanese101;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class hiraganaMenuActivity extends AppCompatActivity {

    private ImageButton back;
    private Button a, i;
    private int unlockI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiragana_menu);

        back = (ImageButton)findViewById(R.id.back);
        back.setImageResource(R.drawable.back);

        a = (Button)findViewById(R.id.a);
        i = (Button)findViewById(R.id.i);

        Intent intent = getIntent();
        unlockI = intent.getIntExtra("lessonAFinished", 0);;
        if (unlockI == 1){
            i.setEnabled(true);
            i.setBackgroundColor(Color.parseColor("#5EF9BCD0"));
            i.setTextColor(Color.parseColor("#fa5bba"));
        }

    }

    public void aHiragana(View v){
        a.setBackgroundColor(Color.parseColor("#5EBBD7F9"));
        a.setTextColor(Color.parseColor("#FF7DB9FD"));
        Intent intent = new Intent(this, aHiragana1.class);
        startActivity(intent);
        finish();
    }

    public void previous(View v){
        back.setImageResource(R.drawable.back1);
        Intent intent1 = new Intent(this, menuActivity.class);
        startActivity(intent1);
        finish();
    }

    public void more(View v){
        i.setBackgroundColor(Color.parseColor("#5EBBD7F9"));
        i.setTextColor(Color.parseColor("#FF7DB9FD"));
        Intent intent2 = new Intent(this, moreActivity.class);
        startActivity(intent2);
        finish();
    }
}
