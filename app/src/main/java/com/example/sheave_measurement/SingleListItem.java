package com.example.sheave_measurement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class SingleListItem extends AppCompatActivity {
    EditText date,site,inspector,phone,email,notes1,inspType,model,serial,noSheaves,diameter,ropeSize,notes2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_list_item);

        SheaveMeasurements data = (SheaveMeasurements) getIntent().getSerializableExtra("data");

        date = findViewById(R.id.date);
        site = findViewById(R.id.site);
        inspector = findViewById(R.id.inspector);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);
        notes1 = findViewById(R.id.notes1);
        inspType  = findViewById(R.id.inspType);
        model = findViewById(R.id.model);
        serial = findViewById(R.id.serial);
        noSheaves = findViewById(R.id.noSheaves);
        diameter = findViewById(R.id.diameter);
        ropeSize = findViewById(R.id.ropeSize);
        notes2 = findViewById(R.id.notes2);

        date.setText(data.getInspectionDate());
        site.setText(data.getInspectionSite());
        inspector.setText(data.getInspector());
        phone.setText(data.getPhone());
        email.setText(data.getEmail());
        notes1.setText(data.getNotes1());
        inspType.setText(data.getInspectionType());
        model.setText(data.getBlockModel());
        serial.setText(String.valueOf(data.getSerialNumber()));
        noSheaves.setText(String.valueOf(data.getNumberOfSheaves()));
        diameter.setText(String.valueOf(data.getOutsideSheaveDiam()));
        ropeSize.setText(data.getNominalRopeSize());
        notes2.setText(data.getNotes2());

    }
}