package com.example.rosa.japanese101;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton startbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startbutton = (ImageButton)findViewById(R.id.startButton);
        startbutton.setImageResource(R.drawable.startbutton);
    }

    public void start(View v){
        startbutton.setImageResource(R.drawable.startbutton1);
        Intent intent1 = new Intent(this, menuActivity.class);
        startActivity(intent1);
        finish();
    }
}
