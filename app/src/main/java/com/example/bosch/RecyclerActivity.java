package com.example.bosch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RecyclerActivity extends AppCompatActivity {
    String[] languagesJson = {"English","hindi","urdu","tamil"};
    ListView langListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);   //R.layout -- my app
        langListView = findViewById(R.id.langList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
               android.R.layout.simple_list_item_1, //R.layout -- android os
                languagesJson );
        langListView.setAdapter(adapter);
    }
}