 package com.example.ecomarceapp;

 import android.os.Bundle;
 import android.util.Log;

 import androidx.appcompat.app.AppCompatActivity;
 import androidx.recyclerview.widget.GridLayoutManager;

 import com.android.volley.Request;
 import com.android.volley.RequestQueue;
 import com.android.volley.Response;
 import com.android.volley.VolleyError;
 import com.android.volley.toolbox.StringRequest;
 import com.android.volley.toolbox.Volley;
 import com.example.ecomarceapp.databinding.ActivityMainBinding;

 import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

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
        intcarasol();

    }

    private void intcarasol() {
        binding.carousel.addData(new CarouselItem("https://media.istockphoto.com/id/1419410282/photo/silent-forest-in-spring-with-beautiful-bright-sun-rays.jpg?s=2048x2048&w=is&k=20&c=t9_zg20wVbrBoGn0tw__1fFq4ykeKs15TQQ3x-ehVC0=","radhe radhe"));
        binding.carousel.addData(new CarouselItem("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_1280.jpg","hare krishna"));
    }

    void  initcatagory(){
        catagories=new ArrayList<>();
        catagoryAdapter=new catagoryAdapter(this,catagories);
        catagories.add(new catagory("ram","https://commondatastorage.googleapis.com/codeskulptor-demos/riceracer_assets/img/car_3.png","#673AB7","krishna",1));
        catagories.add(new catagory("ram","https://commondatastorage.googleapis.com/codeskulptor-demos/riceracer_assets/img/car_3.png","#673AB7","krishna",1));
        catagories.add(new catagory("ram","https://commondatastorage.googleapis.com/codeskulptor-demos/riceracer_assets/img/car_3.png","#673AB7","krishna",1));catagories.add(new catagory("ram","https://commondatastorage.googleapis.com/codeskulptor-demos/riceracer_assets/img/car_3.png","#673AB7","krishna",1));
        catagories.add(new catagory("ram","https://commondatastorage.googleapis.com/codeskulptor-demos/riceracer_assets/img/car_3.png","#673AB7","krishna",1));
        catagories.add(new catagory("ram","https://commondatastorage.googleapis.com/codeskulptor-demos/riceracer_assets/img/car_3.png","#673AB7","krishna",1));

        getcatagory();
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,4);
        binding.listCatagory.setLayoutManager(gridLayoutManager);
        binding.listCatagory.setAdapter(catagoryAdapter);

    }
    void  getcatagory(){
        RequestQueue queue=Volley.newRequestQueue(this);
        StringRequest request=new StringRequest((Request.Method.GET), "https://tutorials.mianasad.com/ecommerce/services/listCategory", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
            Log.d("rammm",""+response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("mmmm",""+error);
            }
        });

        queue.add(request);
    }

    void initprodects(){
        prodects=new ArrayList<>();
        prodects.add(new prodects("hare krishna","https://cdn.pixabay.com/photo/2013/12/16/15/59/tree-229335_960_720.jpg","",1290.00,12.00,1,1));
        prodects.add(new prodects("hare krishna","https://cdn.pixabay.com/photo/2014/12/24/05/02/drop-of-water-578897_1280.jpg","",1500.00,12.00,1,1));
        prodects.add(new prodects("hare krishna","https://cdn.pixabay.com/photo/2013/04/04/12/34/mountains-100367_1280.jpg","",1999.00,12.00,1,1));
        prodects.add(new prodects("hare krishna","https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832_960_720.jpg","",1700.00,12.00,1,1));
        prodects.add(new prodects("hare krishna","https://cdn.pixabay.com/photo/2017/05/08/13/15/bird-2295431_1280.jpg","",2599.00,12.00,1,1));
        prodects.add(new prodects("hare krishna","https://cdn.pixabay.com/photo/2015/07/09/22/45/tree-838667_1280.jpg","",3699.00,12.00,1,1));




        productsAdapter=new productsAdapter(this,prodects);

        GridLayoutManager LayoutManager=new GridLayoutManager(this,2);
        binding.listProduct.setLayoutManager(LayoutManager);
        binding.listProduct.setAdapter(productsAdapter);

    }
}
