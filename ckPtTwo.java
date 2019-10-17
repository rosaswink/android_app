package com.example.rosa.japanese101;

import android.content.Intent;
import android.graphics.Color;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ckPtTwo extends AppCompatActivity {

    private RadioGroup group;
    private RadioButton answer;
    private Button submit, next;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ck_pt_two);

        answer = (RadioButton)findViewById(R.id.ka);
        submit = (Button)findViewById(R.id.submit);
        group = (RadioGroup)findViewById(R.id.group);
        next = (Button)findViewById(R.id.next);

        Intent i = getIntent();
        counter = i.getIntExtra("counter", 0);
    }

    public void submit(View v){

        if(answer.isChecked() == true){
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
            counter += 1;
        }
        else{
            Toast.makeText(this, "Incorrect!\nCorrect answer is 'か'", Toast.LENGTH_SHORT).show();
        }
        submit.setEnabled(false);
        next.setEnabled(true);
        next.setBackgroundColor(Color.parseColor("#5EF9BCD0"));
        next.setTextColor(Color.parseColor("#fa5bba"));

    }

    public void next(View v){
        next.setBackgroundColor(Color.parseColor("#5EBBD7F9"));
        next.setTextColor(Color.parseColor("#FF7DB9FD"));
        Intent intent = new Intent(this, ckPtThree.class);
        intent.putExtra("counter", counter);
        startActivity(intent);
        finish();
    }
}
