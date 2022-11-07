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
        sc=adapter.openRead();
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
        tvSNo1=sc.get(0).getsNo();
        tvSNo2=sc.get(1).getsNo();
        tvSNo3=sc.get(2).getsNo();
        tvSNo4=sc.get(3).getsNo();
        tvSNo5=sc.get(4).getsNo();
        tvSNo6=sc.get(5).getsNo();
        tvSubject1=sc.get(0).getClassName();
        tvSubject2=sc.get(1).getClassName();
        tvSubject3=sc.get(2).getClassName();
        tvSubject4=sc.get(3).getClassName();
        tvSubject5=sc.get(4).getClassName();
        tvSubject6=sc.get(5).getClassName();
        tvRoomNo1=sc.get(0).getRoomNo();
        tvRoomNo2=sc.get(1).getRoomNo();
        tvRoomNo3=sc.get(2).getRoomNo();
        tvRoomNo4=sc.get(3).getRoomNo();
        tvRoomNo5=sc.get(4).getRoomNo();
        tvRoomNo6=sc.get(5).getRoomNo();
        tvStartTime1=sc.get(0).getStartTime();
        tvStartTime2=sc.get(1).getStartTime();
        tvStartTime3=sc.get(2).getStartTime();
        tvStartTime4=sc.get(3).getStartTime();
        tvStartTime5=sc.get(4).getStartTime();
        tvStartTime6=sc.get(5).getStartTime();
        tvEndTime1=sc.get(0).getEndTime();
        tvEndTime2=sc.get(1).getEndTime();
        tvEndTime3=sc.get(2).getEndTime();
        tvEndTime4=sc.get(3).getEndTime();
        tvEndTime5=sc.get(4).getEndTime();
        tvEndTime6=sc.get(5).getEndTime();
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
