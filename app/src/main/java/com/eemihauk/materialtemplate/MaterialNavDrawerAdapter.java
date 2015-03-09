package com.eemihauk.materialtemplate;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

public class MaterialNavDrawerAdapter extends ArrayAdapter {

    private Context mContext;

    public MaterialNavDrawerAdapter(Context context, int resource, int textViewResourceId, String[] objects) {
        super(context, resource, textViewResourceId, objects);
        mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewItem = super.getView(position, convertView, parent);
        int iconId = mContext.getResources().obtainTypedArray(R.array.nav_drawer_icons).getResourceId(position, -1);
        ImageView iconView = (ImageView) viewItem.findViewById(R.id.drawer_item_icon);
        iconView.setImageResource(iconId);
        return viewItem;
    }

}
