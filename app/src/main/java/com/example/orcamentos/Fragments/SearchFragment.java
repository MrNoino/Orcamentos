package com.example.orcamentos.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.orcamentos.R;


public class SearchFragment extends Fragment {

    private SearchView input_search;

    private RadioGroup filters;

    private RadioButton filter_title, filter_date, filter_customer;

    public SearchFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_search, container, false);

        input_search = view.findViewById(R.id.input_search);

        input_search.onActionViewExpanded();

        input_search.setQueryHint(getString(R.string.label_search_for) + " " + getString(R.string.label_budget_title));

        filters = view.findViewById(R.id.filters);

        filter_title = view.findViewById(R.id.filter_title);

        filter_date = view.findViewById(R.id.filter_date);

        filter_customer = view.findViewById(R.id.filter_customer);

        filters.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                View radioButton = filters.findViewById(checkedId);
                int index = filters.indexOfChild(radioButton);
                switch (index) {
                    case 0:

                        input_search.setQueryHint(getString(R.string.label_search_for) + " " + getString(R.string.label_budget_title));

                        break;

                    case 1:

                        input_search.setQueryHint(getString(R.string.label_search_for) + " " + getString(R.string.label_budget_date));


                        break;

                    case 2:

                        input_search.setQueryHint(getString(R.string.label_search_for) + " " + getString(R.string.label_customer_name));


                        break;
                }

            }

        });

        return view;
    }


}