package com.example.passingdataikhsan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GoFood extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_food);
    }

    public void GetFood(View view){
        EditText ETFood1 = (EditText) findViewById(R.id.ETFood1);
        EditText ETFood2 = (EditText) findViewById(R.id.ETFood2);
        EditText ETFood3 = (EditText) findViewById(R.id.ETFood3);
        Intent ride = new Intent(GoFood.this,GetDataPassing.class);
        ride.putExtra("data1", ETFood1.getText().toString());
        ride.putExtra("data2", ETFood2.getText().toString());
        ride.putExtra("data3", ETFood3.getText().toString());
        startActivity(ride);
    }
}
