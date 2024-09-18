package com.example.myaapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private ImageView flagImageView;
    private TextView nameTextView;
    private TextView capitalTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        flagImageView = findViewById(R.id.flag);
        nameTextView = findViewById(R.id.name);
        capitalTextView = findViewById(R.id.capital);

        // Получаем данные из Intent
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String capital = intent.getStringExtra("capital");
        int flagResource = intent.getIntExtra("flagResource", 0);

        // Устанавливаем данные в представления
        nameTextView.setText(name);
        capitalTextView.setText(capital);
        flagImageView.setImageResource(flagResource);
    }
}