package com.example.bosch;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LangAdapter extends RecyclerView.Adapter<LangAdapter.LangViewHolder> {


    @NonNull
    @Override
    public LangViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull LangViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class LangViewHolder extends RecyclerView.ViewHolder {
        public LangViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
