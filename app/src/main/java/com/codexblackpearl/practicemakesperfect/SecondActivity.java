package com.codexblackpearl.practicemakesperfect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);

        Intent intent = getIntent();
        int count = intent.getIntExtra("count",0);

        Random random = new Random();
        int randomNumber;
        randomNumber = random.nextInt(count+1);

        textView.setText("Here, We have a random number for you (Between 0 to "+count+")");
        textView2.setText(""+randomNumber);
    }
}