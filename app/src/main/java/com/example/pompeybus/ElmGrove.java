package com.example.pompeybus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ElmGrove extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elm_grove);

        TextView textView = (TextView) findViewById(R.id.text2);

        textView.setText("0809 0824 0839 0854 0909 0924 0939 0954 1009 1024 1044 1104 1124 1144 1204 1224 1244 1304 1324 1344  " +
                "1404 1424 1439 1454 1509 1524 1539 1554 1609 1624 1639 1654 1709 1724 1739 1754 1809 1849 1929 2009 2049 2129 2209 2249 2329 0009");
    }
}