package com.example.lesson_3_homework_3_month_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ZooAdapter extends RecyclerView.Adapter<ZooViewHolder> {

    private ArrayList<String> zooList;

    public ZooAdapter(ArrayList<String> zooList) {
        this.zooList = zooList;
    }

    @NonNull
    @Override
    public ZooViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ZooViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_zoo, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ZooViewHolder holder, int position) {
        holder.bind(zooList.get(position));
    }

    @Override
    public int getItemCount() {
        return zooList.size();
    }
}
