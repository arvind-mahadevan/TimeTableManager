package com.androidfisac.scheduleapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.androidfisac.scheduleapp.helpers.DbAdapter;

public class AddActivity extends AppCompatActivity
{
    EditText sNoBlank;
    EditText classNameBlank;
    EditText startTimeBlank;
    EditText endTimeBlank;
    EditText roomNoBlank;

    Button addBtn;

    DbAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addscreen);
        sNoBlank = findViewById(R.id.sNoBlank);
        classNameBlank = findViewById(R.id.classNameBlank);
        startTimeBlank = findViewById(R.id.startTimeBlank);
        endTimeBlank = findViewById(R.id.endTimeBlank);
        roomNoBlank = findViewById(R.id.roomNoBlank);

        addBtn = findViewById(R.id.addBtn);

        adapter = new DbAdapter(this);

        addBtn.setOnClickListener(view -> {
            adapter.openWrite();
            adapter.insertData(sNoBlank.getText().toString(),classNameBlank.getText().toString(),startTimeBlank.getText().toString(),endTimeBlank.getText().toString(),
                    roomNoBlank.getText().toString());

        });
    }
}





