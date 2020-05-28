package com.example.test;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ExampleViewHolder> {
    private ArrayList<item> mDataset;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder{
        public TextView mName;
        public TextView mTime;
        public TextView mMemo;

        public ExampleViewHolder(View v){
            super(v);
            mMemo =  v.findViewById(R.id.name);
            mTime = v.findViewById(R.id.time);
            mMemo =  v.findViewById(R.id.memo);
        }
    }

    //생성자
    public MyAdapter(ArrayList<item> myDataset) {
        mDataset = myDataset;
    }

    //viewHolder
    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_tab_fragment1, parent, false);

        ExampleViewHolder viewHolder = new ExampleViewHolder(view);
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(MyAdapter.ExampleViewHolder holder, int position) {
        item currentItem = mDataset.get(position);
        holder.mName.setText(currentItem.getName());
        holder.mTime.setText(currentItem.getTime());
        holder.mMemo.setText(currentItem.getMemo());

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

}
