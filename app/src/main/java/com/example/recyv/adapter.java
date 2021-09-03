package com.example.recyv;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<view_holder> {

    ArrayList<views_model> data;
    ArrayList<details_model> detail;
    Context context;

    public adapter(ArrayList<views_model> data, ArrayList<details_model> detail, Context context) {
        this.data = data;
        this.detail = detail;
        this.context = context;
    }

    @NonNull
    @Override

    public view_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.single_row,parent, false);
        return new view_holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull view_holder holder, int position) {

        final details_model details = detail.get(position);

        holder.code.setText(data.get(position).getCountry_code());
        holder.con_n.setText(data.get(position).getCountry_n());
        holder.img.setImageResource(data.get(position).getCountry_flag());

        holder.con_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, details_holder.class);
                intent.putExtra("country_key", details.getCountryID());
                intent.putExtra("area_key", details.getAreaID());
                intent.putExtra("religion_key", details.getReligionID());
                intent.putExtra("population_key", details.getPopulationID());
                intent.putExtra("details_area", details.getDetailsID());
                intent.putExtra("flag_key", details.getFlagID());
                intent.putExtra("animals_key", details.getAnimalsID());
                intent.putExtra("birds_key", details.getBirdsID());

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
