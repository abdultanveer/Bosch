package com.example.bosch;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LangAdapter extends RecyclerView.Adapter<LangAdapter.LangViewHolder> {
    public static String TAG = LangAdapter.class.getSimpleName();

    @NonNull
    @Override
    public LangViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.i(TAG,"manish - buy a row plank");
        View rowPlank = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_plank,parent,false);
        return new LangViewHolder(rowPlank);
    }

    @Override
    public void onBindViewHolder(@NonNull LangViewHolder holder, int position) {
        Log.i(TAG,"Dharshini - writing on row plank");

    }

    @Override
    public int getItemCount() {
        Log.i(TAG,"sabhari - counting data items");

        return 0;
    }

    class LangViewHolder extends RecyclerView.ViewHolder {
        public LangViewHolder(@NonNull View itemView) {
            super(itemView);
            Log.i(TAG,"sahil - reserve planks in the  view holder");

        }
    }
}
