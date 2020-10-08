package com.example.pompeybus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PrinceAlbertRoad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prince_albert_road);

        TextView textView = (TextView) findViewById(R.id.text7);

        textView.setText("0744 0759 0814 0828 0843 0858 0913 0928 0943 0958 1013 1028 1043 1103 1123 1143 1203 1223 1243 1303 1323 1343 1403  " +
                "1423 1443 1458 1513 1528 1543 1558 1613 1628 1643 1658 1713 1728 1743 1758 1813 1828 1905 1942 2022 2102 2142 2222 2302 2342 0022");
    }
}