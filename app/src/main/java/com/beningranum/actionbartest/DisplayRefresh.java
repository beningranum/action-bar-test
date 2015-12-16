package com.beningranum.actionbartest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayRefresh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_refresh);

        TextView aboutTextFull = (TextView) findViewById(R.id.aboutJobTextView);
        TextView salariesTextFull = (TextView) findViewById(R.id.salariesTextView);

        aboutTextFull.setVisibility(View.GONE);
        salariesTextFull.setVisibility(View.GONE);

        android.support.v7.app.ActionBar actionbar = getSupportActionBar();
//        assert getSupportActionBar() != null;
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setTitle("Refresh");
    }

    public void onClickJobDesc(View v){
        TextView jobTextFull = (TextView) findViewById(R.id.JobDescTextView);
        TextView aboutTextFull = (TextView) findViewById(R.id.aboutJobTextView);
        TextView salariesTextFull = (TextView) findViewById(R.id.salariesTextView);

        jobTextFull.setVisibility(View.VISIBLE);
        aboutTextFull.setVisibility(View.GONE);
        salariesTextFull.setVisibility(View.GONE);
    }

    public void onClickAboutJob(View v){
        TextView jobTextFull = (TextView) findViewById(R.id.JobDescTextView);
        TextView aboutTextFull = (TextView) findViewById(R.id.aboutJobTextView);
        TextView salariesTextFull = (TextView) findViewById(R.id.salariesTextView);

        jobTextFull.setVisibility(View.GONE);
        aboutTextFull.setVisibility(View.VISIBLE);
        salariesTextFull.setVisibility(View.GONE);
    }

    public void onClickSalaries(View v){
        TextView jobTextFull = (TextView) findViewById(R.id.JobDescTextView);
        TextView aboutTextFull = (TextView) findViewById(R.id.aboutJobTextView);
        TextView salariesTextFull = (TextView) findViewById(R.id.salariesTextView);

        jobTextFull.setVisibility(View.GONE);
        aboutTextFull.setVisibility(View.GONE);
        salariesTextFull.setVisibility(View.VISIBLE);
    }
}
