package com.example.bioveda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.bioveda.adapters.CropGridAdapter;
import com.google.android.material.tabs.TabLayout;

public class Generate_Crop_Price extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    Button generateCropPrice,generateAveragePrice;
    ConstraintLayout constraintLayout4,constraintLayout3,constraintLayout5;
    RecyclerView recyclerView2;
    int[] array= new int[]{R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5, R.drawable.img6,R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5, R.drawable.img6};
    TextView textViewParameter,textViewQuantity,textViewCrop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_crop_price);
        recyclerView2=findViewById(R.id.recyclerView2);
        textViewParameter=findViewById(R.id.textViewParameter);
        textViewQuantity=findViewById(R.id.textViewQuantity);
        textViewCrop=findViewById(R.id.textViewCrop);
        generateCropPrice=findViewById(R.id.generateCropPrice);
        generateAveragePrice=findViewById(R.id.generateAveragePrice);
        constraintLayout4=findViewById(R.id.constraintLayout4);
        constraintLayout3=findViewById(R.id.constraintLayout3);
        constraintLayout5=findViewById(R.id.constraintLayout5);
        generateCropPrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                constraintLayout4.setVisibility(View.VISIBLE);
                constraintLayout3.setVisibility(View.INVISIBLE);
                constraintLayout5.setVisibility(View.INVISIBLE);
            }
        });
        generateAveragePrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                constraintLayout4.setVisibility(View.INVISIBLE);
                constraintLayout3.setVisibility(View.INVISIBLE);
                constraintLayout5.setVisibility(View.VISIBLE);
            }
        });


        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,3);
        recyclerView2.setLayoutManager(gridLayoutManager);
        recyclerView2.setAdapter(new CropGridAdapter(this,array));

    }
}