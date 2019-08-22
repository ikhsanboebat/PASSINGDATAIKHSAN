package com.example.passingdataikhsan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void buttongambar1(View view) {
        Intent mart = new Intent(HomeActivity.this,GoMart.class);
        startActivity(mart);
    }

    public void buttongambar2(View view) {
        Intent ride = new Intent(HomeActivity.this,GoRide.class);
        startActivity(ride);
    }

    public void buttongambar3(View view) {
        Intent food = new Intent(HomeActivity.this,GoFood.class);
        startActivity(food);
    }

    public void buttongambar4(View view) {
        Intent send = new Intent(HomeActivity.this,GoSend.class);
        startActivity(send);
    }
}
