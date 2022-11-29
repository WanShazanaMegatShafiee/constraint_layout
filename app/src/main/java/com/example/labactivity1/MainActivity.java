package com.example.labactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView teks = (TextView) findViewById(R.id.text_layout1);
        teks.setText(" Lab Activity 1.0 My First Android App");
    }
}