package com.example.ecomarceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import com.example.ecomarceapp.databinding.ActivityMainBinding;
import android.os.Bundle;
import android.widget.GridLayout;

import com.example.ecomarceapp.R;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

ActivityMainBinding binding;
catagoryAdapter catagoryAdapter;

ArrayList<catagory> catagories;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,4);
        binding.listCatagory.setLayoutManager(gridLayoutManager);
    }
}
