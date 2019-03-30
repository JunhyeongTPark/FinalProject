package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonCmIn = null;
    private Button buttonCmFt= null;
    private Button buttonInFt = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.buttonCmIn = (Button) findViewById(R.id.buttonCmFt);
        this.buttonCmIn.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.myapplication.CM_IN.class);
                startActivity(intent);
            }
        });


        this.buttonCmFt = (Button) findViewById(R.id.buttonCmFt);
        this.buttonCmFt.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.myapplication.CM_FT.class);
                startActivity(intent);
            }
        });

        this.buttonInFt = (Button) findViewById(R.id.buttonIF);
        this.buttonInFt.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.myapplication.IN_FT.class);
                startActivity(intent);
            }
        });

    }
}
