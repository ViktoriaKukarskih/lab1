package com.example.lab1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setTextSize(20);
        textView.setPadding(16, 16, 16, 16);
        setContentView(textView);
        setContentView(R.layout.activity_second);
        TextView text = findViewById(R.id.textView);
        Bundle extras = getIntent().getExtras();
        assert extras != null;
        text.setText("Переданный параметр: " + extras.getString("surname"));
    }
}