package com.example.laurentiuolteanu.victorycuplivescore;

import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class NavigationDrawerActivity extends AppCompatActivity{
    public String TAG = NavigationDrawerActivity.class.getName();
    private DrawerLayout mDrawerLayout;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void init() {
        mDrawerLayout = findViewById(R.id.drawer_layout);
        setContentFragment(new NewsFragment());

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);

        NavigationView navigationView = findViewById(R.id.navigation_bar);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                menuItem.setChecked(true);
                mDrawerLayout.closeDrawers();
                selectItemFromMenu(menuItem);
                return true;
            }
        });
    }

    private void selectItemFromMenu(MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.nav_news:
                NewsFragment newsFragment = new NewsFragment();
                setContentFragment(newsFragment);
                break;
            case R.id.nav_players:
                PlayersFragment playersFragment = new PlayersFragment();
                setContentFragment(playersFragment);
                break;
        }
    }

    private void setContentFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.content_frame, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
