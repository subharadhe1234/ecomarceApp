 package com.example.ecomarceapp;

 import android.os.Bundle;

 import androidx.appcompat.app.AppCompatActivity;
 import androidx.recyclerview.widget.GridLayoutManager;

 import com.example.ecomarceapp.databinding.ActivityMainBinding;

 import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

ActivityMainBinding binding;
catagoryAdapter catagoryAdapter;

ArrayList<catagory> catagories;
productsAdapter productsAdapter;
ArrayList<prodects> prodects;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initcatagory();
        initprodects();

    }
    void  initcatagory(){
        catagories=new ArrayList<>();
        catagoryAdapter=new catagoryAdapter(this,catagories);
        catagories.add(new catagory("ram","https://commondatastorage.googleapis.com/codeskulptor-demos/riceracer_assets/img/car_3.png","#673AB7","krishna",1));
        catagories.add(new catagory("ram","https://commondatastorage.googleapis.com/codeskulptor-demos/riceracer_assets/img/car_3.png","#673AB7","krishna",1));
        catagories.add(new catagory("ram","https://commondatastorage.googleapis.com/codeskulptor-demos/riceracer_assets/img/car_3.png","#673AB7","krishna",1));

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,4);
        binding.listCatagory.setLayoutManager(gridLayoutManager);
        binding.listCatagory.setAdapter(catagoryAdapter);

    }
    void initprodects(){
        prodects=new ArrayList<>();
        prodects.add(new prodects("hare krishna","https://codeskulptor-demos.commondatastorage.googleapis.com/GalaxyInvaders/back01.jpg","",12.00,12.00,1,1));
        prodects.add(new prodects("hare krishna","https://codeskulptor-demos.commondatastorage.googleapis.com/GalaxyInvaders/back01.jpg","",12.00,12.00,1,1));
        prodects.add(new prodects("hare krishna","https://codeskulptor-demos.commondatastorage.googleapis.com/GalaxyInvaders/back01.jpg","",12.00,12.00,1,1));prodects.add(new prodects("hare krishna","https://codeskulptor-demos.commondatastorage.googleapis.com/GalaxyInvaders/back01.jpg","",12.00,12.00,1,1));
        prodects.add(new prodects("hare krishna","https://codeskulptor-demos.commondatastorage.googleapis.com/GalaxyInvaders/back01.jpg","",12.00,12.00,1,1));
        prodects.add(new prodects("hare krishna","https://codeskulptor-demos.commondatastorage.googleapis.com/GalaxyInvaders/back01.jpg","",12.00,12.00,1,1));prodects.add(new prodects("hare krishna","https://codeskulptor-demos.commondatastorage.googleapis.com/GalaxyInvaders/back01.jpg","",12.00,12.00,1,1));
        prodects.add(new prodects("hare krishna","https://codeskulptor-demos.commondatastorage.googleapis.com/GalaxyInvaders/back01.jpg","",12.00,12.00,1,1));
        prodects.add(new prodects("hare krishna","https://codeskulptor-demos.commondatastorage.googleapis.com/GalaxyInvaders/back01.jpg","",12.00,12.00,1,1));



        productsAdapter=new productsAdapter(this,prodects);

        GridLayoutManager LayoutManager=new GridLayoutManager(this,2);
        binding.listProduct.setLayoutManager(LayoutManager);
        binding.listProduct.setAdapter(productsAdapter);

    }
}
