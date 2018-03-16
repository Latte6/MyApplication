package com.example.pure.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "App designed by 20067214", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void assigmentClick(View view){
        Intent intent = new Intent(Main2Activity.this, assigments.class);
        startActivity(intent);
    }
    public void timeTableClick(View view){
        Intent intent = new Intent(Main2Activity.this, TimeTable.class);
        startActivity(intent);
    }
    public void resultsClick(View view){
        Intent intent = new Intent(Main2Activity.this, Results.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_app, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.menuReset:
            Intent intent1 = new Intent(this, Main2Activity.class);
            this.startActivity(intent1);
            return true;
            case R.id.menuLogout:
                Intent intent2 = new Intent(this, MainActivity.class);
                this.startActivity(intent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    public void onBackPressed() {
        int counter=0;
        if (counter==-1) {
            counter++;
        } else {
            counter++;
        }
    }

}
