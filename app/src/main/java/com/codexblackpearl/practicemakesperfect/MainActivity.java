package com.codexblackpearl.practicemakesperfect;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView countTextView = findViewById(R.id.countTextView);
        Button btnCount = findViewById(R.id.btnCount);
        Button btnRandom = findViewById(R.id.btnRandom);
        Button btnAbout = findViewById(R.id.btnAbout);
        TextView textView3 = findViewById(R.id.textView3);
        TextView textView4 = findViewById(R.id.textView4);

        btnAbout.setOnClickListener(v -> {
            textView4.setText("from");
            textView3.setText("CodeXBlackPearl");
        });

        btnCount.setOnClickListener(v -> {
            String countString = countTextView.getText().toString();
            int count = Integer.parseInt(countString);
            count++;
            countTextView.setText(""+count);
        });

        btnRandom.setOnClickListener(v -> {
            String countString = countTextView.getText().toString();
            int count = Integer.parseInt(countString);

            if(count != 0){
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("count",count);
                startActivity(intent);
            }
            else{
                Toast.makeText(MainActivity.this, "Increase Count !", Toast.LENGTH_SHORT).show();
            }
        });
    }
}