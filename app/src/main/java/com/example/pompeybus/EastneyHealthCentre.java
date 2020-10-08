package com.example.pompeybus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class EastneyHealthCentre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eastney_health_centre);

        TextView textView = (TextView) findViewById(R.id.text5);

        textView.setText("0736 0751 0806 0820 0835 0850 0905 0920 0935 0950 1005 1020 1035 1055 1115 1135 1155 1215 1235 1255 1315 1335 1355 " +
                "1415 1435 1450 1505 1520 1535 1550 1605 1620 1635 1650 1705 1720 1735 1750 1805 1820 1900 1937 2017 2057 2137 2217 2257 2337 0017");
    }
}