package com.example.layout;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NegaraAdapter extends BaseAdapter {

    String[][] data;
    Activity activity;


    public NegaraAdapter (Activity activity, String[][] data) {
        super();
        this.data = data;
        this.activity = activity;
    }

    @Override
    public int getCount() { return data.length; }

    @Override
    public Object getItem(int position) { return data[position]; }

    @Override
    public long getItemId(int position) { return 0; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(activity);
            v = vi.inflate(R.layout.activity_list_view, null);
        }
        Object p = getItem(position);
        if (p != null) {
          ImageView  imgView = v.findViewById(R.id.imgView);
          TextView text1 = v.findViewById(R.id.text1);
          TextView  text2 = v.findViewById(R.id.text2);

            int id = activity.getResources().getIdentifier(data[position][2],
                    "drawable", activity.getPackageName());
            Drawable drawable = activity.getResources().getDrawable(id);

            imgView.setImageDrawable(drawable);
            text1.setText(data[position][0]);
            text2.setText(data[position][1]);

        }
        return v;
    }

}