package com.example.orcamentos.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.orcamentos.R;

public class TabFragmentWork extends Fragment {

    Spinner spinner;

    EditText input_parking, input_labor_price;

    public TabFragmentWork() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tab_work, container, false);

        spinner = view.findViewById(R.id.spinner_time);

        input_parking = view.findViewById(R.id.input_parking);

        input_labor_price = view.findViewById(R.id.input_labor_price);

        initSpinner(view);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {

                String[] time = getResources().getStringArray(R.array.array_time2);
                input_parking.setHint(getString(R.string.placeholder_parking) + " " + getString(R.string.label_per) + " " + time[position]);

                input_labor_price.setHint(getString(R.string.placeholder_labor_price) + " " + getString(R.string.label_per) + " " + time[position]);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                return;
            }

        });

        return view;
    }

    public void initSpinner(View view){

        ArrayAdapter<CharSequence> aa = ArrayAdapter.createFromResource( view.getContext(), R.array.array_time1, android.R.layout.simple_spinner_item);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(aa);

    }
}