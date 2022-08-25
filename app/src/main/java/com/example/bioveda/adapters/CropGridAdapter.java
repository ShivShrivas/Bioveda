package com.example.bioveda.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bioveda.Crop_Quantity;
import com.example.bioveda.MainActivity;
import com.example.bioveda.R;

public class CropGridAdapter extends RecyclerView.Adapter<CropGridAdapter.CropGridViewHolder> {
    Context context;
    int[] array;
    public CropGridAdapter(Context context, int[] array) {
        this.array=array;
        this.context=context;
    }

    @NonNull
    @Override
    public CropGridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.all_topics_item_card,parent,false);
        return new CropGridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CropGridViewHolder holder, int position) {
        holder.allToipcsItemImg.setImageDrawable(context.getDrawable(array[position]));
        holder.allToipcsItemImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, Crop_Quantity.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return array.length;
    }

    public class CropGridViewHolder extends RecyclerView.ViewHolder {
        ImageView allToipcsItemImg;
        public CropGridViewHolder(@NonNull View itemView) {
            super(itemView);
            allToipcsItemImg=itemView.findViewById(R.id.allToipcsItemImg);
        }
    }
}
