package com.example.laturtimetable;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomListAdapter extends ArrayAdapter<String> {
    private Context context;
    private ArrayList<String> items;

    public CustomListAdapter(Context context, ArrayList<String> items) {
        super(context, R.layout.activity_custom_list_adapter, items);
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        if (convertView == null)
        {
            convertView = LayoutInflater.from(context).inflate(R.layout.activity_custom_list_adapter, parent, false);
        }

        TextView textViewItem = convertView.findViewById(R.id.textViewItem);
        ImageView locationIcon = convertView.findViewById(R.id.locationIcon);

        String item = items.get(position);
        textViewItem.setText(item);

        // Show location icon only for items that have village names
        if (!item.isEmpty() && item.startsWith("▶"))
        {
            locationIcon.setVisibility(View.VISIBLE);
        }
        else
        {
            locationIcon.setVisibility(View.GONE);
        }

        return convertView;
    }
}