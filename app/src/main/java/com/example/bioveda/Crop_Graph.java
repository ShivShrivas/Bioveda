package com.example.bioveda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Crop_Graph extends AppCompatActivity {
Button process_with_date_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop_graph);
        process_with_date_button=findViewById(R.id.process_with_date_button);
        process_with_date_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Crop_Graph.this,Crop_Quantity.class));
            }
        });
    }
}