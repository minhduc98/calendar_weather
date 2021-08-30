package com.example.calendarweather;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle abdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dl = findViewById(R.id.dl);
        abdt = new ActionBarDrawerToggle(this,dl,R.string.Open,R.string.Close);

        abdt.setDrawerIndicatorEnabled(true);

        dl.addDrawerListener(abdt);
        abdt.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final NavigationView nav_view = (NavigationView) findViewById(R.id.nav_view);
        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                if (id == R.id.search) {
                    startActivity(new Intent(MainActivity.this,SearchActivity.class));
                    Toast.makeText(MainActivity.this,"Search",Toast.LENGTH_SHORT).show();
                }
                if (id == R.id.aboutme) {
                    Toast.makeText(MainActivity.this,"About me",Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });

        HomeFragmentPaperAdapter1 adapter = new HomeFragmentPaperAdapter1(getSupportFragmentManager());
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager1);
        viewPager.setOffscreenPageLimit(2);
        viewPager.setAdapter(adapter);



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        return abdt.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }
}