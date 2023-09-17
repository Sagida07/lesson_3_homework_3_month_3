package com.example.lesson_3_homework_3_month_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FragmentA extends Fragment {

    private RecyclerView rvZoo;
    private ArrayList<String> zooList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvZoo = requireActivity().findViewById(R.id.rv_zoo);
        loadData();
        ZooAdapter adapter = new ZooAdapter(zooList);
        rvZoo.setAdapter(adapter);
    }

    private void loadData() {
        zooList.add("Tiger \uD83D\uDC2F");
        zooList.add("Lion \uD83E\uDD81");
        zooList.add("Crocodile \uD83D\uDC0A");
        zooList.add("Bear \uD83D\uDC3B");
        zooList.add("Fox \uD83E\uDD8A");
        zooList.add("Zebra \uD83E\uDD93");
        zooList.add("Giraffe \uD83E\uDD92");
        zooList.add("Hippopotamus \uD83E\uDD9B");
        zooList.add("Monkey \uD83D\uDC35");
        zooList.add("Penguin \uD83D\uDC27");
        zooList.add("Snake \uD83D\uDC0D");
        zooList.add("Peacock \uD83E\uDD9A");
        zooList.add("Flamingo \uD83E\uDDA9");
        zooList.add("Lizard \uD83E\uDD8E");
        zooList.add("Elephant \uD83D\uDC18");
        zooList.add("Panda \uD83D\uDC3C");
        zooList.add("Koala \uD83D\uDC28");
    }
}