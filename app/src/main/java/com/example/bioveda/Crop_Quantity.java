package com.example.bioveda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.bioveda.adapters.CropQuantityAdapter;

import java.util.ArrayList;

public class Crop_Quantity extends AppCompatActivity {
RecyclerView recyclerView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop_quantity);
        recyclerView3=findViewById(R.id.recyclerView3);
        recyclerView3.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        ArrayList arrayList=new ArrayList();
        arrayList.add("A");
        arrayList.add("A");
        arrayList.add("A");
        arrayList.add("A");
        arrayList.add("A");
        arrayList.add("A");
        recyclerView3.setAdapter(new CropQuantityAdapter(this,arrayList));

    }
}