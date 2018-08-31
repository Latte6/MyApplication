package com.example.pure.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Pure on 15.03.2018.
 */

public class EditDataActivity  extends AppCompatActivity {

    private static final String TAG = "EditDataActivity";

    private Button btnSave, btnDelete;
    private EditText editable_item;
    DatabaseHelper mDatabaseHelper;

    private String selectedName;
    private int selectedID;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_data_layout);
        btnSave = (Button) findViewById(R.id.btnSave);
        btnDelete = (Button) findViewById(R.id.btnDelete);
        editable_item = (EditText) findViewById(R.id.editable_item);
        mDatabaseHelper = new DatabaseHelper(this);


        Intent recivedIntent = getIntent();

        selectedID = recivedIntent.getIntExtra("id", -1);

        selectedName = recivedIntent.getStringExtra("name");


        editable_item.setText(selectedName);

        btnSave.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
           String item = editable_item.getText().toString();
           if(!item.equals("")){
               mDatabaseHelper.updateName(item,selectedID,selectedName);
            }else {
               toastMessage("You must enter a name");
           }
        }});

        btnDelete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                mDatabaseHelper.deleteName(selectedID, selectedName);
                editable_item.setText("");
                toastMessage("removed from database");
                Intent intent = new Intent(EditDataActivity.this, assigments.class);
                startActivity(intent);
            }
        });



    }

    private void toastMessage(String message){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }
}
