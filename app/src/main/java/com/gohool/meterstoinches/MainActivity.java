package com.gohool.meterstoinches;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText medittext;
    private Button mbutton;
    private TextView mtextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        medittext=(EditText) findViewById(R.id.edittext);
        mtextview=(TextView) findViewById(R.id.textViewid);
        mbutton=(Button) findViewById(R.id.buttonid);



        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mtextview.setVisibility(View.VISIBLE);
                if(medittext.getText().toString().equals("")){
                    mtextview.setTextColor(Color.RED);
                    mtextview.setText("Enter Valid Number");

                }
                else {
                    double a = Double.parseDouble(medittext.getText().toString());
                    double c = a * 39.3701;
                    mtextview.setTextColor(Color.GRAY);
//                mtextview.setText(Double.toString(c)+" inches");
                    mtextview.setText(String.format("%.2f", c) + " inches");
                }
            }
        });





    }
}