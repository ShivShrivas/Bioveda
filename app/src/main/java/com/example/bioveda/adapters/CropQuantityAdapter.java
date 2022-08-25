package com.example.bioveda.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bioveda.Crop_Quantity;
import com.example.bioveda.R;

import java.util.ArrayList;

public class CropQuantityAdapter extends RecyclerView.Adapter<CropQuantityAdapter.CropQuantityVoewHolder> {
    Context context;
    ArrayList arrayList;
    public CropQuantityAdapter(Context context, ArrayList arrayList) {
        this.arrayList=arrayList;
        this.context=context;
    }

    @NonNull
    @Override
    public CropQuantityVoewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.crop_quantity_item_card,parent,false);
        return new CropQuantityVoewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CropQuantityVoewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class CropQuantityVoewHolder extends RecyclerView.ViewHolder{
        public CropQuantityVoewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
