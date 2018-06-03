package com.example.elkay.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText num;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand =  new Random();
        final int randnum = rand.nextInt(20)+1;

        num = findViewById(R.id.numEditText);
        btn = findViewById(R.id.btnguess);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int user_value = Integer.parseInt(num.getText().toString());
                if(user_value < randnum)
                    Toast.makeText(MainActivity.this, "Higher", Toast.LENGTH_SHORT).show();
                else if(user_value > randnum)
                    Toast.makeText(MainActivity.this, "Lower", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "You got it Right!", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
