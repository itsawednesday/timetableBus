package com.example.pompeybus;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

import java.util.List;
import java.util.Map;
import java.util.Objects;


import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ListAdapter extends BaseExpandableListAdapter{


    private Activity context;
    private Map<String, List<String>> ParentListItems;
    private List<String> Items;

    ListAdapter(Activity context, List<String> Items, Map<String, List<String>> ParentListItems) {

        this.context = context;
        this.ParentListItems = ParentListItems;
        this.Items = Items;

    }



    @Override
    public int getGroupCount() {
        return Items.size();
    }


    @Override
    public Object getGroup(int groupPosition) {
        return Items.get(groupPosition);
    }



    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }


    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String string = (String) getGroup(groupPosition);
        if (convertView == null){
            LayoutInflater layoutInflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            assert layoutInflater !=null;
            convertView = layoutInflater.inflate(R.layout.parent_item, null);
        }
        TextView item = convertView.findViewById(R.id.textParent);
        item.setText(string);
        return convertView;
    }
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int getChildrenCount(int groupPosition) {
        return Objects.requireNonNull(ParentListItems.get(Items.get(groupPosition))).size();

    }
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return Objects.requireNonNull(ParentListItems.get(Items.get(groupPosition)).get(childPosition));
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final String childName = (String) getChild(groupPosition, childPosition);
        LayoutInflater inflater = context.getLayoutInflater();

        if (convertView == null){
            convertView = inflater.inflate(R.layout.child_item, null);

        }
        TextView item = convertView.findViewById(R.id.textChild);
        item.setText(childName);
        return convertView;

    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }




    @Override
    public boolean hasStableIds() {
        return true;
    }


}


