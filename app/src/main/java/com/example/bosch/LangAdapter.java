package com.example.bosch;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LangAdapter extends RecyclerView.Adapter<LangAdapter.LangViewHolder> {
    public static String TAG = LangAdapter.class.getSimpleName();
    String[] languages;
    public LangAdapter(String[] languagesJson) {
        languages = languagesJson;
    }

    @NonNull
    @Override
    public LangViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.i(TAG,"manish - buy a row plank");
        View rowPlank = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_plank,parent,false);
        return new LangViewHolder(rowPlank);
    }

    @Override
    public void onBindViewHolder(@NonNull LangViewHolder sahilHolder, int position) {
        Log.i(TAG,"Dharshini - writing on row plank");
        sahilHolder.tvRowPlank.setText(languages[position]);


    }

    @Override
    public int getItemCount() {
        Log.i(TAG,"sabhari - counting data items"+languages.length);

        return languages.length;
    }

    class LangViewHolder extends RecyclerView.ViewHolder {
        TextView tvRowPlank;
        public LangViewHolder(@NonNull View itemView) {
            super(itemView);
            Log.i(TAG,"sahil - reserve planks in the  view holder");
            tvRowPlank = itemView.findViewById(R.id.tvRow);

        }
    }
}
