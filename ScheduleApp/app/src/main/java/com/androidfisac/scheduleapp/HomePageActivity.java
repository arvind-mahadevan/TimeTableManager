package com.androidfisac.scheduleapp;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.helpers.DbAdapter;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HomePageActivity extends AppCompatActivity {
    private ArrayList<Timetable> sc;
    TextView tvSNo1,tvSubject1,tvRoomNo1,tvStartTime1,tvEndTime1,
            tvSNo2,tvSubject2,tvRoomNo2,tvStartTime2,tvEndTime2,
            tvSNo3,tvSubject3,tvRoomNo3,tvStartTime3,tvEndTime3,
            tvSNo4,tvSubject4,tvRoomNo4,tvStartTime4,tvEndTime4,
            tvSNo5,tvSubject5,tvRoomNo5,tvStartTime5,tvEndTime5,
            tvSNo6,tvSubject6,tvRoomNo6,tvStartTime6,tvEndTime6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_screen);
        DbAdapter adapter = new DbAdapter(this);
        
        tvSNo1=findViewById(R.id.sNum1);
        tvSNo2=findViewById(R.id.sNum2);
        tvSNo3=findViewById(R.id.sNum3);
        tvSNo4=findViewById(R.id.sNum4);
        tvSNo5=findViewById(R.id.sNum5);
        tvSNo6=findViewById(R.id.sNum6);
        tvSubject1=findViewById(R.id.className1);
        tvSubject2=findViewById(R.id.className2);
        tvSubject3=findViewById(R.id.className3);
        tvSubject4=findViewById(R.id.className4);
        tvSubject5=findViewById(R.id.className5);
        tvSubject6=findViewById(R.id.className6);
        tvStartTime1=findViewById(R.id.startTime1);
        tvStartTime2=findViewById(R.id.startTime2);
        tvStartTime3=findViewById(R.id.startTime3);
        tvStartTime4=findViewById(R.id.startTime4);
        tvStartTime5=findViewById(R.id.startTime5);
        tvStartTime6=findViewById(R.id.startTime6);
        tvEndTime1=findViewById(R.id.endTime1);
        tvEndTime2=findViewById(R.id.endTime2);
        tvEndTime3=findViewById(R.id.endTime3);
        tvEndTime4=findViewById(R.id.endTime4);
        tvEndTime5=findViewById(R.id.endTime5);
        tvEndTime6=findViewById(R.id.endTime6);
        tvRoomNo1=findViewById(R.id.roomNum1);
        tvRoomNo2=findViewById(R.id.roomNum2);
        tvRoomNo3=findViewById(R.id.roomNum3);
        tvRoomNo4=findViewById(R.id.roomNum4);
        tvRoomNo5=findViewById(R.id.roomNum5);
        tvRoomNo6=findViewById(R.id.roomNum6);
        tvSNo1.setText("1");
        tvSNo2.setText("2");
        tvSNo3.setText("3");
        tvSNo4.setText("4");
        tvSNo5.setText("5");
        tvSNo6.setText("6");
        tvSubject1.setText("PE-III");
        tvSubject2.setText("PE-IV");
        tvSubject3.setText("PE-V")
        tvSubject4.setText("PE-VI");
        tvSubject5.setText("PE-VII");
        tvSubject6.setText("OE");
        tvRoomNo1.setText("AB5-312");
        tvRoomNo2.setText("AB5-312");
        tvRoomNo3.setText("AB5-312");
        tvRoomNo4.setText("AB5-312");
        tvRoomNo5.setText("AB5-312");
        tvRoomNo6.setText("AB5-312")
        tvStartTime1.setText("9:00");
        tvStartTime2.setText("9:00");
        tvStartTime3.setText("9:00");
        tvStartTime4.setText("9:00");
        tvStartTime5.setText("9:00")
        tvStartTime6.setText("9:00");
        tvEndTime1.setText("10:00");
        tvEndTime2.setText("10:00");
        tvEndTime3.setText("10:00")
        tvEndTime4.setText("10:00");
        tvEndTime5.setText("10:00");
        tvEndTime6.setText("10:00");
        Button btnAdd=findViewById(R.id.btnAdd);
        Button btnDel=findViewById(R.id.btnDelete);
        btnAdd.setOnClickListener(view ->{
            startActivity(new Intent(getApplicationContext(),AddActivity.class));
        });
        btnDel.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(),DelActivity.class));
        });


    }

}
