package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class TabFragment1 extends Fragment {
    ArrayList<item> itemArrayList;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        itemArrayList = new ArrayList<>();
        itemArrayList.add(new item("아스피린", "2시", "ㅇ미;ㄹ"));
        itemArrayList.add(new item("아스피린2", "2시", "ㅇ미;ㄹ"));
        itemArrayList.add(new item("아스피린3", "2시", "ㅇ미;ㄹ"));
        itemArrayList.add(new item("아스피린4", "2시", "ㅇ미;ㄹ"));
        itemArrayList.add(new item("아스피린5", "2시", "ㅇ미;ㄹ"));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_fragment1, container, false);

        RecyclerView myrv = view.findViewById(R.id.recyclerView);
        MyAdapter myAdapter = new MyAdapter(itemArrayList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        myrv.setLayoutManager(linearLayoutManager);
        myrv.setAdapter(myAdapter);
        return view;
    }
}
