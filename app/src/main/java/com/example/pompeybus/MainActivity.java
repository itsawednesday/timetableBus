package com.example.pompeybus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    List<String> ChildList;
    Map<String, List<String>> ParentListItems;


    ExpandableListView ListView;
    //TextView textView;


    List<String> ParentList = new ArrayList<>();

    {
        ParentList.add("Bus Timetable Mon-Fri");
        ParentList.add("Routes");
    }

    String[] streetNames = {"PortsmouthUni", "Elm Grove", "Kings Theatre", "Festing Hotel", "Eastney Health Centre",
            "Bransbury Park", "Prince Albert Road", "Francis Avenue", "Fratton Bridge", "Somers Road", "Winston Churchill Avenue",};
    String[] route = {"Routes"};
    String[] defaultName = {"Route: From University of Portsmouth Cambridge Road, then via Cambridge Junction, Museum Road, King Road, Elm Grove, Victoria Road South, Albert Road, Highland Road, Eastney Road,\n" +
            "Goldsmith Avenue, Fratton Bridge, Victoria Road North, Bradford Junction, Winston Churchill Avenue, The Terraces and Cambridge Road."};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);





        ParentListItems = new LinkedHashMap<>();
        for (String HoldItem : ParentList){
            if(HoldItem.equals("Bus Timetable Mon-Fri")){
                loadChild(streetNames);}
            else if(HoldItem.equals("routes")){
                loadChild(route);}
            else
                loadChild(defaultName);
            ParentListItems.put(HoldItem, ChildList);

        }
        ListView = findViewById((R.id.expandListView));

        final ExpandableListAdapter expandableListAdapter= new ListAdapter(this, ParentList, ParentListItems);
        ListView.setAdapter(expandableListAdapter);

        ListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                final String selected = (String) expandableListAdapter.getChild(groupPosition, childPosition);
                Intent intent;

                switch(selected) {
                    case "PortsmouthUni":
                        intent = new Intent (MainActivity.this, StreetActivity.class);
                        startActivity(intent);
                        break;

                    case "Elm Grove":
                        intent = new Intent (MainActivity.this, ElmGrove.class);
                        startActivity(intent);
                        break;

                    case "Kings Theatre":
                        intent = new Intent (MainActivity.this, KingsTheatre.class);
                        startActivity(intent);
                        break;

                    case "Festing Hotel":
                        intent = new Intent (MainActivity.this, FestingHotel.class);
                        startActivity(intent);
                        break;

                    case "Eastney Health Centre":
                        intent = new Intent (MainActivity.this, EastneyHealthCentre.class);
                        startActivity(intent);
                        break;

                    case "Bransbury Park":
                        intent = new Intent (MainActivity.this, BransburyPark.class);
                        startActivity(intent);
                        break;

                    case "Prince Albert Road":
                        intent = new Intent (MainActivity.this, PrinceAlbertRoad.class);
                        startActivity(intent);
                        break;

                    case "Francis Avenue":
                        intent = new Intent (MainActivity.this, FrancisAvenue.class);
                        startActivity(intent);
                        break;


                    case "Fratton Bridge":
                        intent = new Intent (MainActivity.this, FrattonBridge.class);
                        startActivity(intent);
                        break;
                    case "Somers Road":
                        intent = new Intent (MainActivity.this, SomersRoad.class);
                        startActivity(intent);
                        break;

                    case "Winston Churchill Avenue":
                        intent = new Intent (MainActivity.this, WinstonChurchillAvenue.class);
                        startActivity(intent);
                        break;

                    //case "Routes":
                    //    intent = new Intent (MainActivity.this, uniBusback.class);
                     //   startActivity(intent);
                      //  break;





                }
                return true;
            }
        });
    }

    private void loadChild(String[] ParentElementName) {
        ChildList = new ArrayList<>();
        Collections.addAll(ChildList, ParentElementName);
    }


}



