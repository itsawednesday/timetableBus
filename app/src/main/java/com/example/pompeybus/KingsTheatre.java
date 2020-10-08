package com.example.pompeybus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class KingsTheatre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kings_theatre);

        TextView textView = (TextView) findViewById(R.id.text3);

        textView.setText("0744 0759 0813 0828 0843 0858 0913 0928 0943 0958 1013 1028 1048 1108 1128 1148 1208 1228 1248 1308 1328 1348" +
                "1408 1428 1443 1458 1513 1528 1543 1558 1613 1628 1643 1658 1713 1728 1743 1758 1813 1853 1931 2011 2051 2131 2211" +
                "2251 2331 0011");
    }
}