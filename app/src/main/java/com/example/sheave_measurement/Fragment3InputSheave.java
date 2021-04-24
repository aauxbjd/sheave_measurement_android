package com.example.sheave_measurement;


import android.content.Intent;
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
                myref.push().setValue(sm);
                Toast.makeText(getContext(), "Saved", Toast.LENGTH_LONG).show();
//                }
                Intent intent = new Intent((InputSheave)getActivity(),MainActivity.class);

                startActivity(intent);
            }
        });

        //on cancel
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getContext(), "clear", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent((InputSheave)getActivity(),MainActivity.class);

                startActivity(intent);
//                }
            }
        });


        // Inflate the layout for this fragment
        return view;
    }

}
