package com.example.orcamentos.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orcamentos.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>{

    private LayoutInflater mInflater;

    private int mSize;

    public RecyclerViewAdapter(Context context, int size) {

        mInflater = LayoutInflater.from(context);

        this.mSize = size;

    }

    public RecyclerViewAdapter.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View mItemView = mInflater.inflate(R.layout.recyclerview_item, parent, false);
        return new RecyclerViewHolder(mItemView,this);

    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.search_area.onActionViewExpanded();
        holder.search_material.onActionViewExpanded();
        holder.search_unit.onActionViewExpanded();

    }

    @Override
    public int getItemCount() {
        return mSize;
    }


    class RecyclerViewHolder extends RecyclerView.ViewHolder {

        RecyclerViewAdapter mAdapter;

        SearchView search_material, search_area, search_unit;

        public RecyclerViewHolder(View itemView, RecyclerViewAdapter adapter) {
            super(itemView);

            this.mAdapter = adapter;

            this.search_material = itemView.findViewById(R.id.input_material);
            this.search_area = itemView.findViewById(R.id.input_area);
            this.search_unit = itemView.findViewById(R.id.input_unit);
        }
    }


}
