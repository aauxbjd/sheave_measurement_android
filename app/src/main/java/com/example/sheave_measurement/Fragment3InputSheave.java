package com.example.sheave_measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Field;


public class Fragment3InputSheave extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment3_input_sheave, container, false);
        TextView txt = view.findViewById(R.id.fg3);

        container.removeAllViews();
        final Bundle bundle = this.getArguments();

        StringBuilder builder = new StringBuilder("Extras:\n");

        //loop through bundle
        for (String key : bundle.keySet()) {
            Object value = bundle.get(key); //get the current object

            builder.append(key)
                    .append(String.format("%s", key))
                    .append(String.format("%35s", value))
                    .append("\n"); //add the key-value pair to the

        }

        txt.setText(builder.toString());

//        Button btnSave = view.findViewById(R.id.btnSave);
//        btnSave.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//               SheaveMeasurements sm = new SheaveMeasurements();
//
//               sm.setInspectionDate(bundle.getString("date"));
//               sm.setInspectionSite(bundle.getString("site"));
//               sm.setInspector(bundle.getString("inspector"));
//               sm.setPhone(bundle.getString("phone"));
//               sm.setEmail(bundle.getString("email"));
//               sm.setNotes1(bundle.getString("notes1"));
//               sm.setBlockModel(bundle.getString("model"));
//               sm.setSerialNumber(bundle.getInt("serial"));
//               sm.setNumberOfSheaves(bundle.getInt("noSheaves"));
//               sm.setOutsideSheaveDiam(bundle.getFloat("diam"));
//               sm.setNominalRopeSize(bundle.getString("ropeSize"));
//               sm.setNotes2(bundle.getString("note2"));
//
////                for (Field field : sm.getClass().getDeclaredFields()) {
////                    field.setAccessible(true);
////                    Object value = field.get(sm);
////                    String name = field.getName();
////
////                    System.out.printf("%s: %s%n", name, value);
////                }
//            }
//        });


        // Inflate the layout for this fragment
        return view;
    }

}
