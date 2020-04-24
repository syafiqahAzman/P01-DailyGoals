package com.myapplicationdev.android.p01_dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Get intent
        Intent i = getIntent();

        //Get the string array
        String[] info = i.getStringArrayExtra("info");

        tv1 = findViewById(R.id.textView8);
        tv2 = findViewById(R.id.textView9);
        tv3 = findViewById(R.id.textView10);
        tv4 = findViewById(R.id.textView11);

        tv1.setText("Read up on materials before class : " + info[0]);
        tv2.setText("Arrive on time so as not to miss important part of the lesson : "
        + info[1]);
        tv3.setText("Attempt the problem myself : " + info[2]);
        tv4.setText("Reflection : " + info[3]);

    }
}
