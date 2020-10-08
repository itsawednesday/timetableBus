package com.example.pompeybus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class StreetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_street);
        TextView textView = (TextView) findViewById(R.id.text1);

        textView.setText("0805 0820 0835 0850 0905 0920 0935 0950 1005 1020 1040 1100 1120 1140 1200 1220 1240 1300 1320 1340" +
                "1400 1420 1435 1450 1505 1520 1535 1550 1605 1620 1635 1650 1705 1720 1735 1750 1805 1845 1925 2005 2045 2125 2205 2245 2325 0005");
    }
}