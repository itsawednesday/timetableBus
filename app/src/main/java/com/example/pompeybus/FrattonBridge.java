package com.example.pompeybus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FrattonBridge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fratton_bridge);
        TextView textView = (TextView) findViewById(R.id.text9);

        textView.setText("0750 0805 0820 0834 0849 0904 0919 0934 0949 1004 1019 1034 1049 1109 1129 1149 1209 1229 1249 1309 1329 1349 1409  " +
                "1429 1449 1504 1519 1534 1549 1604 1619 1634 1649 1704 1719 1734 1749 1804 1819 1834 1910 1947 2027 2107 2147 2227 2307 2347 0027");
    }
}