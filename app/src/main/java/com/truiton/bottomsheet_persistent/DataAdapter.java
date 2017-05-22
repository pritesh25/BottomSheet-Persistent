package com.truiton.bottomsheet_persistent;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<String> countries;

    public DataAdapter(ArrayList<String> countries) {
        this.countries = countries;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {

        viewHolder.tv1.setText(countries.get(i));
        viewHolder.tv2.setText(countries.get(i));
        viewHolder.tv3.setText(countries.get(i));
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv1,tv2,tv3;
        public ViewHolder(View view) {
            super(view);

                tv1= (TextView)view.findViewById(R.id.tv1);
            tv2= (TextView)view.findViewById(R.id.tv2);
            tv3= (TextView)view.findViewById(R.id.tv3);
        }
    }

}