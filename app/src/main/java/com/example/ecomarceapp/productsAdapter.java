package com.example.ecomarceapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ecomarceapp.databinding.ItemProdectsBinding;

import java.util.ArrayList;

public class productsAdapter extends RecyclerView.Adapter<productsAdapter.productsViewHolder>{

    Context context;
    ArrayList<prodects> prodects;

    public productsAdapter(Context context, ArrayList<com.example.ecomarceapp.prodects> prodects) {
        this.context = context;
        this.prodects = prodects;
    }

    @NonNull
    @Override
    public productsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new productsViewHolder(LayoutInflater.from(context).inflate(R.layout.item_prodects,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull productsViewHolder holder, int position) {
        prodects prodects1=prodects.get(position);
        Glide.with(context)
                .load(prodects1.getImage())
                .into(holder.binding.imageee);
        holder.binding.label.setText(prodects1.getName());
        holder.binding.price.setText("INR  "+(prodects1.getPrice()));

    }

    @Override
    public int getItemCount() {
        return prodects.size();
    }


    public class  productsViewHolder extends RecyclerView.ViewHolder{
        ItemProdectsBinding binding;
        public productsViewHolder(@NonNull View itemView) {

            super(itemView);
            binding=ItemProdectsBinding.bind(itemView);

        }
    }
}
