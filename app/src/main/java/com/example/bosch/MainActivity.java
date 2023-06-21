package com.example.bosch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnFocusChangeListener {
EditText nameEt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView = inflating xml layout
        setContentView(R.layout.activity_main);
        nameEt = findViewById(R.id.etName);
        nameEt.setOnFocusChangeListener(this);
    }

    public void showToast(View view) {
        String name = nameEt.getText().toString();
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
       Intent hIntent = new Intent(MainActivity.this,HomeActivity.class);
       hIntent.putExtra("hkey",name);
        add(10,20);
      //  startActivity(hIntent);
    }

    private void add(int i, int i1) {
        int c = i1+i;
       c = c*20;

        throw new NullPointerException("some exception");


    }

    //https://developer.android.com/guide/components/intents-common#java
    public void openDialer(View view) {
        Intent dialIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:98765432"));
        startActivity(dialIntent);
    }

    @Override
    public void onFocusChange(View view, boolean isFocussed) {
        if(isFocussed){
            Snackbar.make(findViewById(android.R.id.content), "focussed", Snackbar.LENGTH_SHORT).show();

        }
        else{
            Snackbar.make(findViewById(android.R.id.content), "lost focus", Snackbar.LENGTH_SHORT).show();

        }

    }
}