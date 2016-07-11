package com.starksky.nanodegree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);


    }


    void showToast(String s) {
        Toast.makeText(MainActivity.this, "This button will launch my " + s + " app!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        String s = "";
        switch (v.getId()) {
            case R.id.button:
                s = getString(R.string.btn1);
                break;
            case R.id.button2:
                s = getString(R.string.btn2);
                break;
            case R.id.button3:
                s = getString(R.string.btn3);
                break;
            case R.id.button4:
                s = getString(R.string.btn4);
                break;
            case R.id.button5:
                s = getString(R.string.btn5);
                break;
            case R.id.button6:
                s = getString(R.string.btn6);
                break;
        }
        showToast(s);
    }
}
