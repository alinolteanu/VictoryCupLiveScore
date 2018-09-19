package com.example.laurentiuolteanu.victorycuplivescore;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.MyViewHolder> {
    private List<News> news;

    public NewsAdapter(List<News> n){
        news = n;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_news, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.bindData(news.get(position));
    }

    @Override
    public int getItemCount() {
        return news.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView titleTextView;
        private ImageView imageView;
        private TextView contentTextView;

        public MyViewHolder(final View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.title_news);
            imageView = itemView.findViewById(R.id.image_news);
            contentTextView = itemView.findViewById(R.id.content_news);
        }

        public void bindData(News news) {
            titleTextView.setText(news.title);
            Context context = imageView.getContext();
            int id = context.getResources().getIdentifier(news.imageName, "drawable", context.getPackageName());
            imageView.setImageResource(id);
            contentTextView.setText(ContentManager.minContent(news.content));
        }
    }
}
