package com.example.sheave_measurement;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Fragment1InputSheave extends Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fragment1_input_sheave, container, false);
        Button btnFrag1 = view.findViewById(R.id.btnNext1);
        final TextView date = view.findViewById(R.id.date);
        final TextView site = view.findViewById(R.id.site);
        final TextView inspector = view.findViewById(R.id.inspector);
        final TextView phone = view.findViewById(R.id.phone);
        final TextView email = view.findViewById(R.id.email);
        final TextView notes1 = view.findViewById(R.id.notes1);


        btnFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //call next fragment if every data is entered
                if (validateData()) {
                    Fragment2InputSheave fragment2 = new Fragment2InputSheave();
                    Bundle bundle = new Bundle();

                    bundle.putString("date", date.getText().toString());
                    bundle.putString("site", site.getText().toString());
                    bundle.putString("inspector", inspector.getText().toString());
                    bundle.putString("phone", phone.getText().toString());
                    bundle.putString("email", email.getText().toString());
                    bundle.putString("notes1", notes1.getText().toString());

                    fragment2.setArguments(bundle);

                    FragmentTransaction fr = getFragmentManager().beginTransaction();
                    fr.replace(R.id.fragment_container, fragment2);
                    fr.commit();

                }

            }


            //Check if all text fields are filled and
            //validated in case of filled
            private Boolean validateData() {


                if (date.getText().toString().length() == 0 || !dateValidation(date.getText().toString())) {
                    date.setError("Date Required format mm/dd/yyy");
                    return false;
                }
                if (site.getText().length() == 0) {
                    site.setError("Site Required");
                    return false;
                }
                if (inspector.getText().length() == 0) {
                    inspector.setError("Inspector Required");
                    return false;
                }
                if (phone.getText().length() == 0) {
                    phone.setError("phone Required");
                    return false;
                }
                if (email.getText().length() == 0) {
                    email.setError("emailRequired");
                    return false;
                }
                if (notes1.getText().length() == 0) {
                    notes1.setError("notes required");
                    return false;
                } else {
                    return true;
                }


            }

            //validating date format (mm/dd/yyyy) using regex
            private Boolean dateValidation(String dateString) {
                String regex = "(0[1-9]|1[012])/(0[1-9]|[12][0-9]|3[01])/((19|20)\\d\\d)";

                if (dateString.matches(regex)) {
                    Log.d("yolog", "turu");
                    return true;
                } else {
                    Log.d("yolog", "falas");
                    return false;
                }
            }

        });

        return view;
    }


}
