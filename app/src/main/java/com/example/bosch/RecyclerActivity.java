package com.example.bosch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RecyclerActivity extends AppCompatActivity {
    String[] languagesJson = {"English","hindi","urdu","tamil"};
    RecyclerView langRecylerView;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);   //R.layout -- my app
        langRecylerView = findViewById(R.id.langList);
        langRecylerView.setLayoutManager(new LinearLayoutManager(this));
        LangAdapter adapter = new LangAdapter(languagesJson);
        langRecylerView.setAdapter(adapter);



    }
}