package com.WeatherAPI.thoitiet.activities;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.WeatherAPI.thoitiet.R;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }


    private boolean isForegroundServicesPermissionGanted() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.P)
            return true;    // There is no need for this permission prior Android Pie (Android SDK 28)
        return ContextCompat.checkSelfPermission(this, Manifest.permission.FOREGROUND_SERVICE)
                == PackageManager.PERMISSION_GRANTED;
    }
}
