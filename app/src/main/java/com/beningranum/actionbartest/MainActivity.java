package com.beningranum.actionbartest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // http://www.androidhive.info/2013/11/android-working-with-action-bar/
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main_actions, menu);

        return super.onCreateOptionsMenu(menu);
    }

    // http://www.androidhive.info/2013/11/android-working-with-action-bar/
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.action_check_updates:
                return true;
            case R.id.action_location_found:
                foundMe();
                return true;
            case R.id.action_refresh:
                refreshMe();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void foundMe(){
        Intent intent = new Intent(this, DisplaySecond.class);
        startActivity(intent);
    }

    private void refreshMe(){
        Intent intent = new Intent(this, DisplayRefresh.class);
        startActivity(intent);
    }
}
