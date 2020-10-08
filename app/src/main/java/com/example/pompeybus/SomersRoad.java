package com.example.pompeybus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SomersRoad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_somers_road);
        TextView textView = (TextView) findViewById(R.id.text10);

        textView.setText("0752 0807 0822 0836 0851 0906 0921 0936 0951 1006 1021 1036 1051 1111 1131 1151 1211 1231 1251 1311 1331 1351 1411   1431 1451 1506 1521 1536 1551 1606 1621 1636 1651 1706 1721 1736 1751 1806 1821 1836 1912 1949 2029 2109 2149 2229 " +
                "2309 2349 .");
    }
}