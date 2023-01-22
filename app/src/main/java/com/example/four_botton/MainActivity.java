package com.example.four_botton;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    int i = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if (is_boom()){
                    button.setText("BOOM!");
                    }
                else{
                    button.setText("This is click number: " + i);
                }
            }
        });
    }

    public boolean is_boom() {
        if (i%7==0){
            return true;
        }
        int j = i;
        while (j != 0) {
            if (j%10==7) {
                return true;
            }
            j=j/10;
        }
        return false;
    }
}

