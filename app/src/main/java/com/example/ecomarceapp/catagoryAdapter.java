package com.example.ecomarceapp;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecomarceapp.databinding.ItemCatagoriseBinding;

import java.util.ArrayList;

public class catagoryAdapter extends RecyclerView.Adapter<catagoryAdapter.catatagoryAdapterViewHolder> {

    Context context;
    ArrayList<catagory> catagories;

    public catagoryAdapter(Context context, ArrayList<catagory> catagories) {
        this.context = context;
        this.catagories = catagories;
    }

    @NonNull
    @Override
    public catatagoryAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new catatagoryAdapterViewHolder(LayoutInflater.from(context).inflate(R.layout.item_catagorise,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull catatagoryAdapterViewHolder holder, int position) {
        catagory catagory= catagories.get(position);
        holder.binding.label.setText(catagory.getName());
        Glide.with(context)
                .load(catagory.getIcon())
                .into(holder.binding.image);
        holder.binding.image.setBackgroundColor(Color.parseColor(catagory.getColor()));
    }

    @Override
    public int getItemCount() {
        return catagories.size();
    }

    public  class  catatagoryAdapterViewHolder extends RecyclerView.ViewHolder{

        ItemCatagoriseBinding binding;
        public catatagoryAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            binding=ItemCatagoriseBinding.bind(itemView);
        }
    }
}
