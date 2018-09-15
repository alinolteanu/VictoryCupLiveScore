package com.example.laurentiuolteanu.victorycuplivescore;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;

public class NewsActivity extends NavigationDrawerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TAG = NewsActivity.class.getName();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        super.init();
    }
}
