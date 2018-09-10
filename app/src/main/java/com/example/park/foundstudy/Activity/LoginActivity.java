package com.example.park.foundstudy.Activity;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.park.foundstudy.R;

import java.util.Calendar;
import java.util.Date;

public class LoginActivity extends AppCompatActivity {

    private final Calendar cal = Calendar.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // 위젯 find
        EditText et_nickName = findViewById(R.id.login_et_nickName);
        Button btn_birth = findViewById(R.id.login_btn_birth);
        RadioGroup rd_gender = findViewById(R.id.login_rd_gender);

        // 날짜 버튼 클릭 시
        btn_birth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog dialog = new DatePickerDialog(LoginActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {

                        // DatePicker 으로부터 선택된 값 가져옴
                        Toast.makeText(LoginActivity.this, year+ " / " + (month+1) + " / " + day, Toast.LENGTH_SHORT).show();
                    }
                }, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE));

                //입력한 날짜 이후로 클릭 안되게 옵션
                dialog.getDatePicker().setMaxDate(new Date().getTime());

                // dialog show
                dialog.show();
            }
        });



    }
}
