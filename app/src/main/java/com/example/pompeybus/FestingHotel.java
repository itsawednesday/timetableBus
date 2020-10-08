package com.example.pompeybus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FestingHotel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festing_hotel);

        TextView textView = (TextView) findViewById(R.id.text4);

        textView.setText(". 0748 0803 0817 0832 0847 0902 0917 0932 0947 1002 1017 1032 1052 1112 1132 1152 1212 1232 1252 1312 1332 1352 " +
                "1412 1432 1447 1502 1517 1532 1547 1602 1617 1632 1647 1702 1717 1732 1747 1802 1817 1857 1934 2014 2054 2134 2214 2254 2334 0014"
        );
    }
}