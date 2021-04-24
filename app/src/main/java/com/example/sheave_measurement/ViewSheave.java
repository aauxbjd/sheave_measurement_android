package com.example.sheave_measurement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ViewSheave extends AppCompatActivity {
    private ListView lv;
    ArrayList<SheaveMeasurements> list = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_sheave);
        final MeasurementListAdapter adapter = new MeasurementListAdapter(this, R.layout.adapter_view_layout,list);

        lv = findViewById(R.id.listView);
        lv.setAdapter(adapter);

        DatabaseReference df = FirebaseDatabase.getInstance().getReference().child("Measurements");

        df.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                list.clear();

                Iterable<DataSnapshot> measurements = dataSnapshot.getChildren();

                for(DataSnapshot child: measurements){
                    SheaveMeasurements sm = child.getValue(SheaveMeasurements.class);
                    list.add(sm);
                    Log.d("Data\n",sm.toString());
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled( DatabaseError databaseError) {

            }
        });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SheaveMeasurements sv = (SheaveMeasurements) lv.getItemAtPosition(position);
                Intent intent = new Intent(ViewSheave.this,SingleListItem.class);
                intent.putExtra("data", sv );
                startActivity(intent);
                Toast.makeText(getApplicationContext(), sv.toString(), Toast.LENGTH_LONG).show();
            }
        });




    }
}
