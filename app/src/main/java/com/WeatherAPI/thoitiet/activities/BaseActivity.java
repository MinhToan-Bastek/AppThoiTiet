package com.WeatherAPI.thoitiet.activities;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.WeatherAPI.thoitiet.utils.UI;
import com.WeatherAPI.thoitiet.R;

@SuppressLint("Registered")
public class BaseActivity extends AppCompatActivity {
    protected int theme;
    protected boolean darkTheme;
    protected boolean blackTheme;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        //noinspection ConstantConditions
        setTheme(theme = UI.getTheme(prefs.getString("theme", "fresh")));
        darkTheme = theme == R.style.AppTheme_NoActionBar_Dark ||
                theme == R.style.AppTheme_NoActionBar_Classic_Dark;
        blackTheme = theme == R.style.AppTheme_NoActionBar_Black ||
                theme == R.style.AppTheme_NoActionBar_Classic_Black;

        UI.setNavigationBarMode(BaseActivity.this, darkTheme, blackTheme);
    }
}
