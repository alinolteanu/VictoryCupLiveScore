package com.example.laurentiuolteanu.victorycuplivescore;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsDetailsFragment extends Fragment {

    TextView titleView;
    TextView contentView;
    ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_news_details, container, false);
        titleView = v.findViewById(R.id.title_news);
        contentView = v.findViewById(R.id.content_news);
        imageView = v.findViewById(R.id.image_news);
        populateViews();

        return v;
    }

    private void populateViews() {
        News news;
        Bundle bundle = this.getArguments();
        try {
            news = (News) bundle.getSerializable("news");
            titleView.setText(news.title);
            contentView.setText(news.content);
            int id = getResources().getIdentifier(news.imageName, "drawable", getContext().getPackageName());
            imageView.setImageResource(id);
        } catch (NullPointerException npe){
            Log.e(NavigationDrawerActivity.TAG, npe.getMessage());
        }
    }
}