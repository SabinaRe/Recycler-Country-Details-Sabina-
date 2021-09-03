package com.example.recyv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recy_ve;
    adapter adap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recy_ve = findViewById(R.id.recy_ve);
        recy_ve.setLayoutManager(new LinearLayoutManager(this));

        adap = new adapter(interface_data(), details_l(), getApplicationContext());
        recy_ve.setAdapter(adap);
        setTitle("Countries");
    }

    public ArrayList<views_model> interface_data() {
        ArrayList<views_model> holder = new ArrayList<>();

        views_model ob1 = new views_model();
        ob1.setCountry_flag(R.drawable.nepal);
        ob1.setCountry_code("+977");
        ob1.setCountry_n("Nepal");
        holder.add(ob1);

        views_model ob2 = new views_model();
        ob2.setCountry_flag(R.drawable.in);
        ob2.setCountry_code("+91");
        ob2.setCountry_n("India");
        holder.add(ob2);

        views_model ob3 = new views_model();
        ob3.setCountry_flag(R.drawable.phi);
        ob3.setCountry_code("+63");
        ob3.setCountry_n("Philippines");
        holder.add(ob3);

        views_model ob4 = new views_model();
        ob4.setCountry_flag(R.drawable.thai);
        ob4.setCountry_code("+66");
        ob4.setCountry_n("Thailand");
        holder.add(ob4);

        views_model ob5 = new views_model();
        ob5.setCountry_flag(R.drawable.uk);
        ob5.setCountry_code("+44");
        ob5.setCountry_n("UK");
        holder.add(ob5);

        views_model ob6 = new views_model();
        ob6.setCountry_flag(R.drawable.usa);
        ob6.setCountry_code("+1");
        ob6.setCountry_n("USA");
        holder.add(ob6);

        views_model ob7 = new views_model();
        ob7.setCountry_flag(R.drawable.germ);
        ob7.setCountry_code("+49");
        ob7.setCountry_n("Germany");
        holder.add(ob7);

        return holder;
    }

    public ArrayList<details_model> details_l(){

        ArrayList<details_model> holder = new ArrayList<>();

        details_model detail1 = new details_model();
            detail1.setCountryID("Nepal");
            detail1.setAreaID("147,516 km sq");
            detail1.setReligionID("Hindu");
            detail1.setPopulationID("28.61 m");
            detail1.setDetailsID("this is nepal");
            detail1.setFlagID(R.drawable.nepal);
            detail1.setAnimalsID("Cow");
            detail1.setBirdsID("Himalayan Monal");
            holder.add(detail1);

        details_model detail2 = new details_model();
            detail2.setCountryID("India");
            detail2.setAreaID("3.287 m km sq");
            detail2.setReligionID("Hindu");
            detail2.setPopulationID("1.366 b");
            detail2.setDetailsID("this is India");
            detail2.setFlagID(R.drawable.in);
            detail2.setAnimalsID("Tiger");
            detail2.setBirdsID("Peacock");
            holder.add(detail2);

        details_model detail3 = new details_model();
            detail3.setCountryID("Philippines");
            detail3.setAreaID("300,000 km sq");
            detail3.setReligionID("Christian, Muslim");
            detail3.setPopulationID("108.1 m");
            detail3.setDetailsID("this is nepal");
            detail3.setFlagID(R.drawable.phi);
            detail3.setAnimalsID("Carabao");
            detail3.setBirdsID("Philippine Eagle");
            holder.add(detail3);

        details_model detail4 = new details_model();
            detail4.setCountryID("Thailand");
            detail4.setAreaID("513.12000 km sq");
            detail4.setReligionID("Christian, Muslim");
            detail4.setPopulationID("69.63 m");
            detail4.setDetailsID("this is thai");
            detail4.setFlagID(R.drawable.thai);
            detail4.setAnimalsID("Elephants");
            detail4.setBirdsID("Siamese Fireback");
            holder.add(detail4);

        details_model detail5 = new details_model();
            detail5.setCountryID("UK");
            detail5.setAreaID("242,495 km sq");
            detail5.setReligionID("Christian");
            detail5.setPopulationID("66.65 m");
            detail5.setDetailsID("this is nepal");
            detail5.setFlagID(R.drawable.uk);
            detail5.setAnimalsID("Lion");
            detail5.setBirdsID("European Robin");
            holder.add(detail5);

        details_model detail6 = new details_model();
            detail6.setCountryID("USA");
            detail6.setAreaID("9.834 m km sq");
            detail6.setReligionID("Christian");
            detail6.setPopulationID("328.2 m");
            detail6.setDetailsID("this is nepal");
            detail6.setFlagID(R.drawable.usa);
            detail6.setAnimalsID("American Bison");
            detail6.setBirdsID("Bald Egale");
            holder.add(detail6);

        details_model detail7 = new details_model();
            detail7.setCountryID("Germany");
            detail7.setAreaID("357,386 km sq");
            detail7.setReligionID("Christian");
            detail7.setPopulationID("83.02 m");
            detail7.setDetailsID("this is nepal");
            detail7.setFlagID(R.drawable.germ);
            detail7.setAnimalsID("Federal Egal");
            detail7.setBirdsID("Eagle");
            holder.add(detail7);
        return holder;
    }
}