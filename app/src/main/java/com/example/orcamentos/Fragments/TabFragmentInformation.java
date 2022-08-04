package com.example.orcamentos.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.orcamentos.R;

import java.util.Calendar;

public class TabFragmentInformation extends Fragment {

    EditText mTitle, mDay, mMonth, mYear;

    public TabFragmentInformation() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab_information, container, false);

        mTitle = view.findViewById(R.id.input_budget_title);

        mDay = view.findViewById(R.id.input_budget_date_day);

        mMonth = view.findViewById(R.id.input_budget_date_month);

        mYear = view.findViewById(R.id.input_budget_date_year);

        Calendar calendar = Calendar.getInstance();

        mDay.setText(String.valueOf(calendar.get(Calendar.DATE)));

        mMonth.setText(String.valueOf(calendar.get(Calendar.MONTH) +1));

        mYear.setText(String.valueOf(calendar.get(Calendar.YEAR)));

        return view;
    }
    
}