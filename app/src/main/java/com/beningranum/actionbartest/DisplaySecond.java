package com.beningranum.actionbartest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class DisplaySecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_second);

        android.support.v7.app.ActionBar testBar = getSupportActionBar();
        testBar.setDisplayShowHomeEnabled(false);
        testBar.setDisplayShowTitleEnabled(false);

        LayoutInflater testInflater = LayoutInflater.from(this);

        View testCustomView = testInflater.inflate(R.layout.menu_main_customized, null);

        testBar.setCustomView(testCustomView);
        testBar.setDisplayShowCustomEnabled(true);
        testBar.setDisplayHomeAsUpEnabled(true);
    }
}