package com.example.passingdataikhsan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class GetDataPassing extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_data_passing);

        TextView TV1 = (TextView) findViewById(R.id.TV1);
        TextView TV2 = (TextView) findViewById(R.id.TV2);
        TextView TV3 = (TextView) findViewById(R.id.TV3);
        TV1.setText(getIntent().getStringExtra("data1"));
        TV2.setText(getIntent().getStringExtra("data2"));
        TV3.setText(getIntent().getStringExtra("data3"));
    }

//
//    if(GetDataPassing().getExtras()!=null){
//        /**
//         * Jika Bundle ada, ambil data dari Bundle
//         */
//        Bundle bundle = getIntent().getExtras();
//        TV1.setText(bundle.getString("data1"));
//        TV2.setText(bundle.getString("data2"));
//        TV3.setText(bundle.getString("data3"));
//    }else{
//        /**
//         * Apabila Bundle tidak ada, ambil dari Intent
//         */
//
//    }
}
