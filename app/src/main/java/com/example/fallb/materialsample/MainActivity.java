package com.example.fallb.materialsample;

import android.app.UiModeManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String MODE = "DAY_OR_NIGHT";
    private static int sAppMode = UiModeManager.MODE_NIGHT_YES;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            sAppMode = savedInstanceState.getInt(MODE,UiModeManager.MODE_NIGHT_NO);
        }
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(MODE, sAppMode);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case R.id.action_model:
                //change theme
                if (sAppMode==UiModeManager.MODE_NIGHT_YES) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    sAppMode = UiModeManager.MODE_NIGHT_NO;
                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    sAppMode = UiModeManager.MODE_NIGHT_YES;
                }
                Toast.makeText(getApplicationContext(), "change Them", Toast.LENGTH_LONG).show();
                recreate();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
