package com.example.recyv;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class view_holder extends RecyclerView.ViewHolder {
    ImageView img;
    TextView code, con_n;

    public view_holder(@NonNull View itemView) {
        super(itemView);

        img = itemView.findViewById(R.id.img);
        code = itemView.findViewById(R.id.code);
        con_n = itemView.findViewById(R.id.con_n);

    }
}
