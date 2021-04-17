package com.example.sheave_measurement;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;


public class Fragment3InputSheave extends Fragment {
    Button btnSave, btnDel;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference myref = database.getReference().child("Measurements");


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // container.removeAllViews();

        View view = inflater.inflate(R.layout.fragment_fragment3_input_sheave, container, false);
        btnSave = view.findViewById(R.id.btnSave);
        btnDel = view.findViewById(R.id.btnDelete);

        TextView txt = view.findViewById(R.id.fg3);
         Bundle bundle = this.getArguments();

        final SheaveMeasurements sm = new SheaveMeasurements();

        sm.setInspectionDate(bundle.getString("date"));
        sm.setInspectionSite(bundle.getString("site"));
        sm.setInspector(bundle.getString("inspector"));
        sm.setPhone(bundle.getString("phone"));
        sm.setEmail(bundle.getString("email"));
        sm.setNotes1(bundle.getString("notes1"));
        sm.setBlockModel(bundle.getString("model"));
        sm.setSerialNumber(bundle.getInt("serial"));
        sm.setNumberOfSheaves(bundle.getInt("noSheaves"));
        sm.setOutsideSheaveDiam(bundle.getFloat("diam"));
        sm.setNominalRopeSize(bundle.getString("ropeSize"));
        sm.setInspectionType(bundle.getString("type"));
        sm.setNotes2(bundle.getString("note2"));

        Log.d("EXtra",sm.toString());
        txt.setText(sm.toString());





        StringBuilder builder = new StringBuilder("Extras:\n");
        //loop through bundle
        for (String key : bundle.keySet()) {
            Object value = bundle.get(key);      //get the current object

            builder.append(key)
                    .append(":")
                    .append(value)
                    .append("\n");      //add the key-value pair to the builder

        }
        Log.d("EXtra",builder.toString());
        txt.setText(builder.toString());



        //on Save
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                HashMap<String, String> measurementMap = new HashMap<>();
//                measurementMap.put("Date", sm.getInspectionDate());
//                measurementMap.put("Inspection Site", sm.getInspectionSite());
//                measurementMap.put("Inspector", sm.getInspector());
//                measurementMap.put("Phone", sm.getPhone());
//                measurementMap.put("E-mail", sm.getEmail());
//                measurementMap.put("Notes 1", sm.getNotes1());
//                measurementMap.put("Inspection Type", sm.getInspectionType());
//                measurementMap.put("Block Model", sm.getBlockModel());
//                measurementMap.put("Serial Number", sm.getSerialNumber());
//                measurementMap.put("Inspection Site", sm.getInspectionSite());
//                measurementMap.put("Inspection Site", sm.getInspectionSite());
//                measurementMap.put("Inspection Site", sm.getInspectionSite());
//                measurementMap.put("Inspection Site", sm.getInspectionSite());

                myref.push().setValue(sm);
                Toast.makeText(getContext(), "call database", Toast.LENGTH_SHORT).show();
//                }
            }
        });

        //on cancel
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getContext(), "clear", Toast.LENGTH_SHORT).show();
//                }
            }
        });


        // Inflate the layout for this fragment
        return view;
    }

}
