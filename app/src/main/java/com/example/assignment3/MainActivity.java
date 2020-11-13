package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.assignment3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding bind ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());
        final String nam = bind.name.getText().toString();
        bind.tName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, nam, Toast.LENGTH_SHORT).show();
            }
        });
        bind.tBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bind.tBtn.isChecked()){
                    Toast.makeText(MainActivity.this, "Toogle On", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Toggle os Off", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    public void GetVal(View v){
        StringBuilder bil = new StringBuilder();
          if (bind.m.isChecked()){
              bil.append(bind.m.getText().toString()+"\n");

          }
        if (bind.fm.isChecked()){
            bil.append(bind.fm.getText().toString());

        }
        else {
            bil.append("UnChecked");
          }
        Toast.makeText(this, bil, Toast.LENGTH_SHORT).show();
    }
}