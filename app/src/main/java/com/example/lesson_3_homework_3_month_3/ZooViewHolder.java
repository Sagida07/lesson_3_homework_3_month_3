package com.example.lesson_3_homework_3_month_3;

import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ZooViewHolder extends RecyclerView.ViewHolder {
    private TextView tvNames;

    public ZooViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNames = itemView.findViewById(R.id.tv_names);
    }

    public void bind(String zooNames){
        tvNames.setText(zooNames);
    }
}
