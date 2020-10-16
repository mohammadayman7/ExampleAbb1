package com.example.labone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText edtname;
private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtname=findViewById(R.id.edtname);
        password =findViewById(R.id.password);
    }

    public void btssubmitonclike(View view) {
String name =edtname.getText().toString();
String pass =  password.getText().toString();
String msg= "name : " + name + " pass: " + pass;
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}