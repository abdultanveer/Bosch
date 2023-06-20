package com.example.bosch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText nameEt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView = inflating xml layout
        setContentView(R.layout.activity_main);
        nameEt = findViewById(R.id.etName);
    }

    public void showToast(View view) {
        String name = nameEt.getText().toString();
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
       Intent hIntent = new Intent(MainActivity.this,HomeActivity.class);
       hIntent.putExtra("hkey",name);
        startActivity(hIntent);
    }

    //https://developer.android.com/guide/components/intents-common#java
    public void openDialer(View view) {
        Intent dialIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:98765432"));
        startActivity(dialIntent);
    }
}