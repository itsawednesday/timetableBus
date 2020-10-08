package com.example.pompeybus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FrancisAvenue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_francis_avenue);

        TextView textView = (TextView) findViewById(R.id.text8);

        textView.setText("0747 0802 0817 0831 0846 0901 0916 0931 0946 1001 1016 1031 1046 1106 1126 1146 1206 1226 1246 1306 1326 1346 1406  1426 1446 1501 1516 1531 1546 1601 1616 1631 1646 1701 1716 1731 1746 1801 1816 1831 1908 1945 2025 2105 2145 2225  " +
                "2305 2345 0025");
    }
}