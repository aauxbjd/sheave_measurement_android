package com.example.sheave_measurement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnEnter, btnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnter = findViewById(R.id.enterSheave);
        btnView = findViewById(R.id.viewSheave);
    }

    public void onClickEnterSheave(View view) {
        startActivity(new Intent(this, InputSheave.class));
    }

    public void onClickViewSheave(View view) {
        startActivity(new Intent(this, ViewSheave.class));
    }
}
