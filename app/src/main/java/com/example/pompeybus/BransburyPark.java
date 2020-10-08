package com.example.pompeybus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BransburyPark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bransbury_park);

        TextView textView = (TextView) findViewById(R.id.text6);

        textView.setText("0740 0755 0810 0824 0839 0854 0909 0924 0939 0954 1009 1024 1039 1059 1119 1139 1159 1219 1239 1259 1319 1339 1359 " +
                "1419 1439 1454 1509 1524 1539 1554 1609 1624 1639 1654 1709 1724 1739 1754 1809 1824 1903 1940 2020 2100 2140 2220 2300 2340 0020");
    }
}