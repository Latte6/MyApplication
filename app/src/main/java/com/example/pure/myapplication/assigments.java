package com.example.pure.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class assigments extends AppCompatActivity {
    DatabaseHelper mDatabaseHelper;
    private Button btnAdd, btnViewData;
    private EditText editText;

  @Override
    protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_assigments);
      Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
      setSupportActionBar(toolbar);

      FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
      fab.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                      .setAction("Action", null).show();
          }
      });
      editText = (EditText) findViewById(R.id.editText);
      btnAdd = (Button) findViewById(R.id.btnAdd);
      btnViewData = (Button) findViewById(R.id.btnViewData);
      mDatabaseHelper = new DatabaseHelper(this);

      btnAdd.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String newEntry = editText.getText().toString();
              if (editText.length() != 0){
                  AddData(newEntry);
                  editText.setText("");
              } else {
                  toastMessage("You must put something in the text field!");
              }
          }
      });

      btnViewData.setOnClickListener(new View.OnClickListener(){
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(assigments.this, ListDataActivity.class);
              startActivity(intent);
          }
      });
  }
    public void AddData(String newEntry) {
      boolean insertData = mDatabaseHelper.addData(newEntry);
      if (insertData) {
          toastMessage("Data Successfully Inserted!");
      } else {
          toastMessage("Something went wrong");
      }
    }


  private void toastMessage(String message){
      Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
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

}
