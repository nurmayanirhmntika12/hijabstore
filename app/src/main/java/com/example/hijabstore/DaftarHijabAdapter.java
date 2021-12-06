package com.example.hijabstore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

import com.example.hijabstore.model.Hijab;

public class DaftarHijabAdapter extends ArrayAdapter<Hijab> {

    Context context;

    public DaftarHijabAdapter(Context context, List<Hijab> hijabs) {
        super(context, R.layout.row_daftar_hijab, hijabs);
        this.context = context;
    }

    private static class ViewHolder  {
        TextView textJenis;
        TextView textBahan;
        ImageView gambar;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Hijab hijab = getItem(position);
        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_daftar_hijab, parent, false);
            viewHolder.textJenis =  convertView.findViewById(R.id.row_text_jenis);
            viewHolder.textBahan = (TextView) convertView.findViewById(R.id.row_text_bahan);
            viewHolder.gambar = convertView.findViewById(R.id.row_image_hijab);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.textJenis.setText(hijab.getNama());
        viewHolder.textBahan.setText(hijab.getBahan());
        viewHolder.gambar.setImageDrawable(context.getDrawable(hijab.getDrawableRes()));
        return convertView;
    }

}
