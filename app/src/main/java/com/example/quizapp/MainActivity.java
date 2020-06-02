package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view) {
        EditText etName = findViewById(R.id.name);
        String name = etName.getText().toString();


        if (!name.equals("")) {
        Intent i = new Intent(this, QuizActivity.class);
            i.putExtra("name", name);
            startActivity(i);
        } else {
            Toast.makeText(this, "Please enter your Name!!", Toast.LENGTH_SHORT).show();
        }
    }
}
