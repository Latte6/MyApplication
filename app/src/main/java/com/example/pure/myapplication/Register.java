package com.example.pure.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Register extends AppCompatActivity {
    private EditText Name;
    private EditText StudentNo;
    private EditText DateOfBirth;
    private EditText  Course;
    private EditText email;
    private EditText Password;
    private Button CreateButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        Name = (EditText) findViewById(R.id.reg_name);
        StudentNo = (EditText) findViewById(R.id.reg_studentNo);
        DateOfBirth = (EditText) findViewById(R.id.reg_dob);
        Course = (EditText) findViewById(R.id.reg_course);
        email = (EditText) findViewById(R.id.reg_email);
        Password = (EditText) findViewById(R.id.reg_password);
        CreateButton = (Button) findViewById(R.id.reg_createButton);
        CreateButton.setOnClickListener(new View.OnClickListener()

        {
    public void onClick(View view) {
        validate(Name.getText().toString(), StudentNo.getText().toString(), DateOfBirth.getText().toString(), Course.getText().toString(), email.getText().toString(), Password.getText().toString());
    }
        });}


    public void validate(String Name1, String StudentNo1, String DateOfBirth1, String Course1, String Email1, String Password1)
    {
        String strUserName = Name.getText().toString();

        if(TextUtils.isEmpty(strUserName)) {
            Name.setError("Please insert your user name!");
            return;
        }

        String strStudentNo = StudentNo.getText().toString();

        if(TextUtils.isEmpty(strStudentNo)) {
            StudentNo.setError("Please insert your student number!");
            return;
        }

        String strUserDateOfBirth =DateOfBirth.getText().toString();

        if(TextUtils.isEmpty(strUserDateOfBirth)) {
            DateOfBirth.setError("Please insert your date of birth!");
            return;
        }
        String strUserCourse =Course.getText().toString();

        if(TextUtils.isEmpty(strUserCourse)) {
            Course.setError("Please insert your course title!");
            return;
        }


        String strUserEmail =email.getText().toString();

        if(TextUtils.isEmpty(strUserEmail)) {
            email.setError("Please insert your email address!");
            return;
        }
        String strUserPassword =Password.getText().toString();

        if(TextUtils.isEmpty(strUserPassword)) {
            Password.setError("Please insert your password!");
            return;
        }

        Intent intent = new Intent(Register.this, Main2Activity.class);
        startActivity(intent);

    }
}
