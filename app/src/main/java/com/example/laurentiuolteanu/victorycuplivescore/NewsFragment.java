package com.example.laurentiuolteanu.victorycuplivescore;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NewsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_news, container, false);

        NewsAdapter adapter = new NewsAdapter(ContentManager.getNews());
        RecyclerView recyclerView = v.findViewById(R.id.news_recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(v.getRootView().getContext()));
        recyclerView.setAdapter(adapter);

        return v;
    }

}