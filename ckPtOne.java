package com.example.rosa.japanese101;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ckPtOne extends AppCompatActivity {

    private Button a, ta, ka, sa, next;
    private int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ck_pt_one);

        a = (Button)findViewById(R.id.a);
        ta = (Button)findViewById(R.id.ta);
        ka = (Button)findViewById(R.id.ka);
        sa = (Button)findViewById(R.id.sa);
        next = (Button)findViewById(R.id.next);
    }
        public void correct(View v) {
            Toast.makeText(this, "Correct!", Toast.LENGTH_LONG).show();
            counter += 1;
            disableAllButtons();
        }


    public void incorrect(View v) {
            Toast.makeText(this, "Incorrect!\nCorrect answer is 'a'", Toast.LENGTH_LONG).show();
            disableAllButtons();
        }

    private void disableAllButtons() {
        a.setEnabled(false);
        ta.setEnabled(false);
        ka.setEnabled(false);
        sa.setEnabled(false);
        next.setEnabled(true);
        next.setBackgroundColor(Color.parseColor("#5EF9BCD0"));
        next.setTextColor(Color.parseColor("#fa5bba"));
    }

    public void next(View v){
        next.setBackgroundColor(Color.parseColor("#5EBBD7F9"));
        next.setTextColor(Color.parseColor("#FF7DB9FD"));
        Intent intent = new Intent(this, ckPtTwo.class);
        intent.putExtra("counter", counter);
        startActivity(intent);
        finish();
    }

}
