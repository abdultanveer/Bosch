package com.example.bosch;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

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

        registerForContextMenu(langRecylerView);
        langRecylerView.setLayoutManager(new LinearLayoutManager(this));
        LangAdapter adapter = new LangAdapter(languagesJson);
        langRecylerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.recycler_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
         super.onOptionsItemSelected(item);
         switch (item.getItemId()){
             case R.id.settings:
                 Snackbar.make(findViewById(android.R.id.content), "settings", Snackbar.LENGTH_SHORT).show();

                 break;
             case  R.id.logout:
                 Snackbar.make(findViewById(android.R.id.content), "logging out", Snackbar.LENGTH_SHORT).show();

                 break;
         }
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.recycler_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
         super.onContextItemSelected(item);
        switch (item.getItemId()){
            case R.id.settings:
                Snackbar.make(findViewById(android.R.id.content), "settings", Snackbar.LENGTH_SHORT).show();

                break;
            case  R.id.logout:
                Snackbar.make(findViewById(android.R.id.content), "logging out", Snackbar.LENGTH_SHORT).show();

                break;
        }
        return true;
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