package com.example.orcamentos.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orcamentos.R;
import com.example.orcamentos.Adapters.RecyclerViewAdapter;


public class TabFragmentMaterial extends Fragment {

    private RecyclerView recyclerView;

    private RecyclerViewAdapter mAdapter;

    Button btn_add, btn_remove;

    private int mSize = 1;

    public TabFragmentMaterial() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tab_material, container, false);

        recyclerView = view.findViewById(R.id.recycler_view);

        mAdapter = new RecyclerViewAdapter(getContext(), mSize);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(view.getContext(), DividerItemDecoration.VERTICAL));

        btn_add = view.findViewById(R.id.btn_add);

        btn_remove = view.findViewById(R.id.btn_remove);

        btn_add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                mSize++;

                mAdapter = new RecyclerViewAdapter(getContext(), mSize);
                recyclerView.setAdapter(mAdapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

            }
        });

        btn_remove.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(mSize == 1)
                    return;

                mSize--;

                mAdapter = new RecyclerViewAdapter(getContext(), mSize);
                recyclerView.setAdapter(mAdapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

            }
        });

        return view;
    }




}