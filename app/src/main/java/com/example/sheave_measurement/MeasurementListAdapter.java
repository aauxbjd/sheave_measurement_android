package com.example.sheave_measurement;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MeasurementListAdapter extends ArrayAdapter<SheaveMeasurements> {
    private static final String TAG = "MeasurementListAdapter";
    private Context  mContext;
    private int layoutResourceId;


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        try {
            SheaveMeasurements item = getItem(position);
            View v = null;
            if (convertView == null) {
                LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                v = inflater.inflate(layoutResourceId, null);

            } else {
                v = convertView;
            }

            TextView date = (TextView) v.findViewById(R.id.txtDate);
            TextView site = (TextView) v.findViewById(R.id.txtSite);
            TextView type = (TextView) v.findViewById(R.id.txtType);

            date.setText(item.getInspectionDate());
            site.setText(item.getInspectionSite());
            type.setText(item.getInspectionType());

            return v;
        } catch (Exception ex) {
            Log.e("Exceptionnnnn", "error", ex);
            return null;
        }
    }

    public MeasurementListAdapter(Context context, int resource, ArrayList<SheaveMeasurements> objects) {
        super(context, resource, objects);
        layoutResourceId = resource;
    }
}
