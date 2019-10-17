package com.example.rosa.japanese101;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class result extends AppCompatActivity {

    private TextView tv;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent i = getIntent();
        counter = i.getIntExtra("counter", 0);

        tv = (TextView)findViewById(R.id.tv);
        tv.setText("Your score: " + counter + "/3");
    }

    public void finish(View v){
        Intent i = new Intent(this, hiraganaMenuActivity.class);
        i.putExtra("lessonAFinished", 1);
        startActivity(i);
        finish();
    }
}
