package com.example.saveobjecttosharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import Data_loacal.DataLocalManager;
import Model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView txtuser=findViewById(R.id.txtusser);
        User user= DataLocalManager.getuser();
        if(user!=null){
            txtuser.setText(user.toString());
        }
    }
}