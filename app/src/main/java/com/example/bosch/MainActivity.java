package com.example.bosch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        Toast.makeText(this, "welcome to android", Toast.LENGTH_SHORT).show();
        Intent hIntent = new Intent(MainActivity.this,HomeActivity.class);
        startActivity(hIntent);
    }

    //https://developer.android.com/guide/components/intents-common#java
    public void openDialer(View view) {
        Intent dialIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:98765432"));
        startActivity(dialIntent);
    }
}