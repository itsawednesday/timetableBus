package com.example.pompeybus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WinstonChurchillAvenue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winston_churchill_avenue);

        TextView textView = (TextView) findViewById(R.id.text11);

        textView.setText("0755 0810 0825 0839 0854 0909 0924 0939 0954 1009 1024 1039 1054 1114 1134 1154 1214 1234 1254 1314 1334 1354 1414  " +
                "1434 1454 1509 1524 1539 1554 1609 1624 1639 1654 1709 1724 1739 1754 1809 1824 1839 1915 1952 2032 2112 2152 2232 2312 2352");
    }
}