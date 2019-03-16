package com.example.FIRST;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText UName;
    private EditText Password;
    private Button Login;
    private TextView Info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UName = (EditText) findViewById(R.id.etUname);
        Password= (EditText) findViewById(R.id.etPw);
        Login = (Button) findViewById(R.id.btnLogin);
        Info = (TextView) findViewById(R.id.tvInfo);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(UName.getText().toString(),Password.getText().toString());
            }
        });

    }

    private  void validate(String userName, String userPassword){
        if((userName.equals("Thila")) && (userPassword.equals("0527"))){
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }

        else {
            Info.setText("Login Faild");

        }

    }

}
