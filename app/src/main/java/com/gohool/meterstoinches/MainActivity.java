package com.gohool.meterstoinches;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText medittext;
    private Button mbutton;
    private TextView mtextview;
    private RadioGroup rgrp;
    private RadioButton rb;
    int c=1;
//    private RadioButton rb2;
//    private RadioButton rb3;
//    private RadioButton rb4;
//    private RadioButton rb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        medittext=(EditText) findViewById(R.id.edittext);
        mtextview=(TextView) findViewById(R.id.textViewid);
        mbutton=(Button) findViewById(R.id.buttonid);
        rgrp=(RadioGroup) findViewById(R.id.radiogroup);
//        rb1=(RadioButton) findViewById(R.id.radioButton1);
//        rb2=(RadioButton) findViewById(R.id.radioButton2);
//        rb3=(RadioButton) findViewById(R.id.radioButton3);
//        rb4=(RadioButton) findViewById(R.id.radioButton4);
//        rb5=(RadioButton) findViewById(R.id.radioButton5);

        rgrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb=(RadioButton) findViewById(checkedId);

                switch (rb.getId()){
                    case R.id.radioButton1:

                        c=1;
                        break;
                    case R.id.radioButton2:

                        c=2;
                        break;
                    case R.id.radioButton3:
                        c=3;
                        break;
                    case R.id.radioButton4:
                        c=4;
                        break;
                    case R.id.radioButton5:
                        c=5;
                        break;
                }
            }
        });



        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mtextview.setVisibility(View.VISIBLE);
                if(medittext.getText().toString().equals("")){
                    mtextview.setTextColor(Color.RED);
                    mtextview.setText("Enter Valid Number");

                }
                else {
                    if(c==1){
                        double a = Double.parseDouble(medittext.getText().toString());
                        double c1 = a * 39.3701;
                        mtextview.setTextColor(Color.GRAY);
                        mtextview.setText(String.format("%.2f", c1) + " inches");

                    }
                    if(c==2){
                        double a = Double.parseDouble(medittext.getText().toString());
                        double c1 = a * 3.28084;
                        mtextview.setTextColor(Color.GRAY);
                        mtextview.setText(String.format("%.2f", c1) + " feet");
                    }
                    if(c==3){
                        double a = Double.parseDouble(medittext.getText().toString());
                        double c1 = a * 0.000621371;
                        mtextview.setTextColor(Color.GRAY);
                        mtextview.setText(String.format("%.2f", c1) + " miles");
                    }
                    if(c==4){
                        double a = Double.parseDouble(medittext.getText().toString());
                        double c1 = a * 1.09361296;
                        mtextview.setTextColor(Color.GRAY);
                        mtextview.setText(String.format("%.2f", c1) + " yards");
                    }
                    if(c==5){
                        double a = Double.parseDouble(medittext.getText().toString());
                        double c1 = a * 0.000539957;
                        mtextview.setTextColor(Color.GRAY);
                        mtextview.setText(String.format("%.2f", c1) + " nautical miles");
                    }




                }
            }
        });





    }
}