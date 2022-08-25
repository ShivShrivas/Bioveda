package com.example.bioveda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bioveda.adapters.CropGridAdapter;

import java.sql.Array;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;

int[] array= new int[]{R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5, R.drawable.img6,R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5, R.drawable.img6};
Button generateCropPrice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        generateCropPrice=findViewById(R.id.generateCropPrice);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2,RecyclerView.HORIZONTAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(new CropGridAdapter(this,array));
        generateCropPrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Generate_Crop_Price.class));
            }
        });

    }
}