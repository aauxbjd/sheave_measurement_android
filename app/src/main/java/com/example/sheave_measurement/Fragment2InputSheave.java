package com.example.sheave_measurement;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

import java.util.Date;


public class Fragment2InputSheave extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        container.removeAllViews();
        View view = inflater.inflate(R.layout.fragment_fragment2_input_sheave, container, false);
        final RadioGroup rg = view.findViewById(R.id.radioGrp);
        final EditText model = view.findViewById(R.id.model);
        final EditText serial = view.findViewById(R.id.serial);
        final EditText noSheaves = view.findViewById(R.id.noSheaves);
        final EditText diam = view.findViewById(R.id.diameter);
        final EditText ropeSize = view.findViewById(R.id.ropeSize);
        final EditText note2 = view.findViewById(R.id.notes2);

        Button next2 = view.findViewById(R.id.btnNext2);


        final Bundle bundle = this.getArguments();


        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedID = rg.getCheckedRadioButtonId();
                switch (selectedID) {
                    case R.id.single:
                        bundle.putString("type", "Single Sheave");
                        break;
                    case R.id.block:
                        bundle.putString("type", "Sheave Block");
                        break;
                    case R.id.rope:
                        bundle.putString("type", "Wire Rope");
                        break;
                    default:
                        Toast.makeText(getContext(), "error no any Inspection type selected", Toast.LENGTH_LONG).show();
                        break;

                }

                if (selectedID == 0 ) Toast.makeText(getContext(), "error no any Inspection type selected", Toast.LENGTH_LONG).show();
                else if (model.getText().length() == 0) model.setError("Date Required");
                else if (serial.getText().length() == 0) serial.setError("Site Required");
                else if (noSheaves.getText().length() == 0) noSheaves.setError("Inspector Required");
                else if (diam.getText().length() == 0) diam.setError("phone Required");
                else if (ropeSize.getText().length() == 0) ropeSize.setError("emailRequired");
                else if (note2.getText().length() == 0) note2.setError("notes required");

                else{
                    Fragment3InputSheave fragment3 = new Fragment3InputSheave();

                    bundle.putString("model", model.getText().toString());
                    bundle.putInt("serial",Integer.parseInt(serial.getText().toString()));
                    bundle.putInt("noSheaves", Integer.parseInt(noSheaves.getText().toString()));
                    bundle.putFloat("diam",Float.parseFloat(diam.getText().toString())) ;
                    bundle.putString("ropeSize", ropeSize.getText().toString());
                    bundle.putString("note2", note2.getText().toString());


                    fragment3.setArguments(bundle);


                    FragmentTransaction fr = getFragmentManager().beginTransaction();
                    fr.replace(R.id.fragment_container, fragment3);
                    fr.commit();
                }



            }
        });

        // Inflate the layout for this fragment
        return view;


    }


}
