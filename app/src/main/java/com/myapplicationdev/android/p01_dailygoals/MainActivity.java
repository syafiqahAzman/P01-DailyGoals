package com.myapplicationdev.android.p01_dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    Button btnOk;
    RadioGroup rg1, rg2, rg3;
    RadioButton rb1, rb2, rb3;
    EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOk = findViewById(R.id.button);


       btnOk.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               rg1 = findViewById(R.id.rg1);
               rg2 = findViewById(R.id.rg2);
               rg3 = findViewById(R.id.rg3);
               int sb1 = rg1.getCheckedRadioButtonId();
               int sb2 = rg2.getCheckedRadioButtonId();
               int sb3 = rg3.getCheckedRadioButtonId();
               rb1 = findViewById(sb1);
               rb2 = findViewById(sb2);
               rb3 = findViewById(sb3);
               et1 = findViewById(R.id.editText);

               //Put the text in an array
               String[] info = {rb1.getText().toString(), rb2.getText().toString()
                       , rb3.getText().toString(), et1.getText().toString()};

               //Create intent
               Intent i = new Intent(MainActivity.this, Main2Activity.class);

               //Pass string array
               i.putExtra("info", info);
               startActivity(i);
           }
       });
    }
}
