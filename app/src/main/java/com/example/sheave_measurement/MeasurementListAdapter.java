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

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        try {
            SheaveMeasurements item = getItem(position);
            View v = null;
            if (convertView == null) {
                LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                v = inflater.inflate(layoutResourceId, null);

            } else {
                v = convertView;
            }

            TextView site = (TextView) v.findViewById(R.id.txtSite);
            TextView type = (TextView) v.findViewById(R.id.txtType);

            site.setText(item.getInspectionSite());
            type.setText(item.getInspectionType());

            return v;
        } catch (Exception ex) {
            Log.e("Exceptionnnnn", "error", ex);
            return null;
        }
    }

    public MeasurementListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<SheaveMeasurements> objects) {
        super(context, resource, objects);
        layoutResourceId = resource;
    }
}
