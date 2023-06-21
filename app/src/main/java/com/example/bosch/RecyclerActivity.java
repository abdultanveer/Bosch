package com.example.bosch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RecyclerActivity extends AppCompatActivity {
    String[] languagesJson = {"English","hindi","urdu","tamil",
            "English","hindi","urdu","tamil",
            "English","hindi","urdu","tamil",
            "English","hindi","urdu","tamil",
            "English","hindi","urdu","tamil",
            "English","hindi","urdu","tamil",
            "English","hindi","urdu","tamil",
            "English","hindi","urdu","tamil",
            "English","hindi","urdu","tamil",
            "English","hindi","urdu","tamil",
            "English","hindi","urdu","tamil",};
    RecyclerView langRecylerView;
    public static String TAG = RecyclerActivity.class.getSimpleName();
    @Override

    //
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"im create");
        setContentView(R.layout.activity_recycler);   //R.layout -- my app
        langRecylerView = findViewById(R.id.langList);
        langRecylerView.setLayoutManager(new LinearLayoutManager(this));
        LangAdapter adapter = new LangAdapter(languagesJson);
        langRecylerView.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"im started-- visible");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"im resume - back to the foreground-- restore state");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"im pause - background--store state");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"im stopping - cold storage--- relase resource");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"im destroy - no more");

    }
}