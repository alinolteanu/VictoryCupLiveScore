package com.example.laurentiuolteanu.victorycuplivescore;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsRecyclerViewHolder> {
    private List<News> news;

    public NewsAdapter(List<News> n){
        news = n;
    }

    @NonNull
    @Override
    public NewsRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_news, parent, false);
        return new NewsRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsRecyclerViewHolder holder, int position) {
        holder.bindData(news.get(position));
    }

    @Override
    public int getItemCount() {
        return news.size();
    }

    public class NewsRecyclerViewHolder extends RecyclerView.ViewHolder {
        private TextView titleTextView;
        private ImageView imageView;
        private TextView contentTextView;

        public NewsRecyclerViewHolder(final View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.title_news);
            imageView = itemView.findViewById(R.id.image_news);
            contentTextView = itemView.findViewById(R.id.content_news);
        }

        public void bindData(final News news) {
            titleTextView.setText(news.title);
            Context context = imageView.getContext();
            int id = context.getResources().getIdentifier(news.imageName, "drawable", context.getPackageName());
            imageView.setImageResource(id);
            contentTextView.setText(ContentManager.minContent(news.content));

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    newsCardClickListener(view, news);
                }
            });
        }

        private void newsCardClickListener(View view, News news) {
            FragmentManager fragmentManager = ((MainActivity) view.getContext()).getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            NewsDetailsFragment fragment = new NewsDetailsFragment();
            Bundle b = new Bundle();
            b.putSerializable("news", news);
            fragment.setArguments(b);
            fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_left, R.anim.slide_out_right, R.anim.slide_in_right);
            fragmentTransaction.replace(R.id.content_frame, fragment);
            fragmentTransaction.addToBackStack(null);

            fragmentTransaction.commit();
        }
    }
}
