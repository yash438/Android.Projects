package com.example.yash.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Yash on 23-01-2018.
 */


public class MyCustomAdapter extends BaseAdapter
{
    Context context;

    public MyCustomAdapter(Context context)
    {
        this.context=context;
    }

    public Integer picture[]=
            {
                    R.drawable.u,
                    R.drawable.v,
                    R.drawable.w,
                    R.drawable.x,
                    R.drawable.y,
                    R.drawable.z,

            };

    @Override
    public int getCount() {
        return picture.length;
    }

    @Override
    public Object getItem(int position) {
        return picture[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ImageView imageView=new ImageView(context);
        imageView.setLayoutParams(new GridView.LayoutParams(400,400));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(picture[position]);
        imageView.setPadding(8,8,8,8);
        return imageView;
    }
}
