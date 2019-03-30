package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CM_IN extends AppCompatActivity {

    private Button buttonCI = null;
    private Button buttonIC = null;
    private Button buttonHome = null;

    private TextView textNum = null;
    private TextView textAnswer = null;

    //@Override
    protected void OnCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cm_in);

        this.textNum = (TextView) findViewById(R.id.textNum);
        this.textAnswer = (TextView) findViewById(R.id.textAnswer);

        this.buttonCI = (Button) findViewById(R.id.buttonCI);
        this.buttonCI.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                String val = textNum.getText().toString();

                if (isPositiveDouble(val)){
                    textAnswer.setText(cmToIN(val));
                }
                else{ textAnswer.setText("Error: Did not enter a positive number");}

            }
        });

        this.buttonIC = (Button) findViewById(R.id.buttonIC);
        this.buttonIC.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                String val = textNum.getText().toString();

                if (isPositiveDouble(val)){
                    textAnswer.setText(inToCM(val));
                }
                else{ textAnswer.setText("Error: Did not enter a positive number");}

            }
        });

        this.buttonHome = (Button) findViewById(R.id.buttonHome);
        this.buttonHome.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                Intent intent = new Intent(CM_IN.this, com.example.myapplication.MainActivity.class);
                startActivity(intent);
            }
        });

    }

    private String cmToIN(String val){
        double num = Double.parseDouble(val);
        double result = 0;
        result = num * 0.393701;

        return Double.toString(result);
    }

    private String inToCM(String val){
        double num = Double.parseDouble(val);
        double result = 0;
        result = num / 0.393701;

        return Double.toString(result);
    }

    public static boolean isPositiveDouble(String str) {
        try {
            Double.parseDouble(str);
            if (Double.parseDouble(str) >= 0){ return true;}
            return false;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
