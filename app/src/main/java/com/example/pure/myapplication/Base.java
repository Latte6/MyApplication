package com.example.pure.myapplication;

/**
 * Created by Pure on 08.03.2018.
 */
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Bundle;



public class Base extends AppCompatActivity {




    public void reset(MenuItem item) {}

    public void logout(MenuItem item) {
        SharedPreferences.Editor editor = getSharedPreferences("loginPrefs", 0).edit();
        editor.putBoolean("loggedin", false);
        editor.commit();

        startActivity(new Intent(Base.this,MainActivity.class)
                .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK));
        finish();
    }
}