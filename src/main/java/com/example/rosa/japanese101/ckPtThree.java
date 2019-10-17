package com.example.rosa.japanese101;

import android.content.Intent;
import android.graphics.Color;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class ckPtThree extends AppCompatActivity {

    private Spinner spinner;
    private ArrayAdapter<CharSequence> adapter;
    private String answer;
    private Button submit, next;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ck_pt_three);

        Intent i = getIntent();
        counter = i.getIntExtra("counter", 0);

        submit = (Button)findViewById(R.id.submit);
        next = (Button)findViewById(R.id.next);
        spinner = findViewById(R.id.spinner);
        adapter = ArrayAdapter.createFromResource(this, R.array.options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                answer = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    public void submit(View v){
        if (answer.equals("sa")){
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
            counter += 1;
        }
        else{
            Toast.makeText(this,"Incorrect!\nCorrect answer is 'sa'", Toast.LENGTH_SHORT).show();
        }
        submit.setEnabled(false);
        next.setEnabled(true);
        next.setBackgroundColor(Color.parseColor("#5EF9BCD0"));
        next.setTextColor(Color.parseColor("#fa5bba"));
    }
    public void next(View v){
        next.setBackgroundColor(Color.parseColor("#5EBBD7F9"));
        next.setTextColor(Color.parseColor("#FF7DB9FD"));
        Intent intent = new Intent(this, result.class);
        intent.putExtra("counter", counter);
        startActivity(intent);
        finish();
    }
}
