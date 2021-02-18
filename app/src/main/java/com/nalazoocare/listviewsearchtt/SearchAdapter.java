package com.nalazoocare.listviewsearchtt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by nalazoo.yeomeme@gmail.com on 2020-05-11
 */
public class SearchAdapter extends BaseAdapter {
    private Context context;
    private List<String> list;
    private LayoutInflater inflate;
    private ViewHolder viewHolder;

    public SearchAdapter(List<String> list, Context context) {
        this.list = list;
        this.context = context;
        this.inflate = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = inflate.inflate(R.layout.row_listview, null);
            viewHolder = new ViewHolder();
            viewHolder.label = convertView.findViewById(R.id.label);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.label.setText(list.get(position));
        return convertView;
    }

    class ViewHolder {
        public TextView label;
    }
}
