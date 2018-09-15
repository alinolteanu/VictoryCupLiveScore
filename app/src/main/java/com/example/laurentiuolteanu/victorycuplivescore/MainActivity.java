package com.example.laurentiuolteanu.victorycuplivescore;

import android.os.Bundle;

public class MainActivity extends NavigationDrawerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TAG = MainActivity.class.getName();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        super.init();
    }
}
