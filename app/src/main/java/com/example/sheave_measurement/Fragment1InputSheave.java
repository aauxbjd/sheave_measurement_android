package com.example.sheave_measurement;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

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

                //Check if all text fields are filled

                if (date.getText().length() == 0) date.setError("Date Required");
                else if (site.getText().length() == 0) site.setError("Site Required");
                else if (inspector.getText().length() == 0) inspector.setError("Inspector Required");
                else if (phone.getText().length() == 0) phone.setError("phone Required");
                else if (email.getText().length() == 0) email.setError("emailRequired");
                else if (notes1.getText().length() == 0) notes1.setError("notes required");

                //call next fragment if every data is entered
                else {
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
        });

        return view;
    }


}
