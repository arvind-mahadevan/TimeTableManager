package com.androidfisac.scheduleapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.androidfisac.scheduleapp.datamodel.Timetable;
import com.androidfisac.scheduleapp.helpers.DbAdapter;

import java.util.ArrayList;

public class DeleteActivity extends AppCompatActivity {

    DbAdapter adapter;
    ArrayList<Timetable> timetableArrayList = new ArrayList<>();
    String tv1, tv2, tv3, tv4, tv5, tv6;
    RadioButton btn1, btn2, btn3, btn4, btn5, btn6;
    RadioGroup radioSexGroup;
    Button btnDelete;
    int flagPressed=0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deletescreen);

        radioSexGroup = findViewById(R.id.radioGroup);

        btn1 = findViewById(R.id.radioButton1);
        btn2 = findViewById(R.id.radioButton2);
        btn3 = findViewById(R.id.radioButton3);
        btn4 = findViewById(R.id.radioButton4);
        btn5 = findViewById(R.id.radioButton5);
        btn6 = findViewById(R.id.radioButton6);

        adapter = new DbAdapter(this);

        adapter.openRead();
        timetableArrayList = adapter.readTimetable();
        adapter.closeAdapter();

        btn1.setText(timetableArrayList.get(0).getClassName());
        btn2.setText(timetableArrayList.get(1).getClassName());
        btn3.setText(timetableArrayList.get(2).getClassName());
        btn4.setText(timetableArrayList.get(3).getClassName());
        btn5.setText(timetableArrayList.get(4).getClassName());
        btn6.setText(timetableArrayList.get(5).getClassName());

        tv1 = btn1.getText().toString();
        tv2 = btn2.getText().toString();
        tv3 = btn3.getText().toString();
        tv4 = btn4.getText().toString();
        tv5 = btn5.getText().toString();
        tv6 = btn6.getText().toString();

        btnDelete = findViewById(R.id.btnDelete);


        btnDelete.setOnClickListener(view ->{
//            adapter.openWrite();

            RadioButton rb;
            rb = findViewById(radioSexGroup.getCheckedRadioButtonId());
            Log.e("sfaesd", "got till here"+ radioSexGroup.getCheckedRadioButtonId());

//            adapter.deleteData(classNameDel);
//            adapter.closeAdapter();
        });

    }
}





