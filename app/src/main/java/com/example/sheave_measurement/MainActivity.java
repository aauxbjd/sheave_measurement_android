package com.example.sheave_measurement;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnEnter, btnView;
   // private  int REQUEST_CODE = 1;

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
