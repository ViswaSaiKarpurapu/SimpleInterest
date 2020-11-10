package com.example.simpleinterest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cal(View view) {
        EditText p,t,r;
        p=findViewById(R.id.principal);
        t=findViewById(R.id.tim);
        r=findViewById(R.id.rate);

        int prin=Integer.parseInt(p.getText().toString());
        int rat= Integer.parseInt(r.getText().toString());
        int timm=Integer.parseInt(t.getText().toString());
        float res=(prin*timm*rat)/100;
        TextView textView = findViewById(R.id.result);
        String mytext=Float.toString(res);
        textView.setText(mytext);


    }
}