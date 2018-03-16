package com.example.pure.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private Button Register;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = (EditText) findViewById(R.id.UserName);
        Password = (EditText) findViewById(R.id.UserPassword);
        Info = (TextView) findViewById(R.id.IncorrectAtt);
        Login = (Button) findViewById(R.id.btnLogin);
        Register = (Button) findViewById(R.id.register_button);
        Info.setText("No of attempts remaining: 5");
    Register.setOnClickListener(new View.OnClickListener()
    {
        public void onClick (View view){
            registerScreen();
        }
    });
    Login.setOnClickListener(new View.OnClickListener()

    {
        public void onClick (View view){
        validate(Name.getText().toString(), Password.getText().toString());
    }
    });
}
   private void registerScreen(){
       Intent intent = new Intent(MainActivity.this, Register.class);
       startActivity(intent);
   }


    private void validate(String userName, String userPassword){

        String strUserName = Name.getText().toString();

        if(TextUtils.isEmpty(strUserName)) {
            Name.setError("Please insert your user name!");
            return;
        }
        String strUserPassword = Password.getText().toString();

        if(TextUtils.isEmpty(strUserPassword)) {
            Password.setError("Please insert your password!");
            return;
        }

        if((userName.equals("admin")) && (userPassword.equals("root"))) {
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);

        }else{
            counter--;
            Info.setText("No of attempts remaining: " + String.valueOf(counter));

            if(counter == 0){
                Login.setEnabled(false);
            }
        }
    }
}
