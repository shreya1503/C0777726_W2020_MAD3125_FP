package com.shreya.c0777726_w2020_mad3125_fp.Activity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.shreya.c0777726_w2020_mad3125_fp.Model.Customer;
import com.shreya.c0777726_w2020_mad3125_fp.R;
import com.shreya.c0777726_w2020_mad3125_fp.Util.DataSingelton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Calendar;

public class AddNewCustomerActivity extends AppCompatActivity
{

    private TextInputLayout edtCustomerId, edtFirstName, edtLastName, edtBirthDate, edtUsername;
    private TextInputLayout edtEmail, edtPassword, edtLocation;
    private RadioButton rdBtnMale, rdBtnFemale, rdBtnOther;
    private TextInputEditText edtCustomerIdText, edtFirstNameText, edtLastNameText, edtBirthDateText;
    private TextInputEditText edtUsernameText, edtEmailText, edtPasswordText, edtLocationText;
    private Button btnAdd, btnClear;
    private DatePickerDialog.OnDateSetListener mDateSetListener;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_customer);
        edtCustomerId = findViewById(R.id.edtCustomerId);
        edtFirstName = findViewById(R.id.edtFirstName);
        edtLastName = findViewById(R.id.edtLastName);
        edtBirthDate = findViewById(R.id.edtBirthDate);
        edtUsername = findViewById(R.id.edtUsername);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        edtLocation = findViewById(R.id.edtLocation);
        edtCustomerIdText = findViewById(R.id.edtCustomerIdText);
        edtFirstNameText = findViewById(R.id.edtFirstNameText);
        edtLastNameText = findViewById(R.id.edtLastNameText);
        edtBirthDateText = findViewById(R.id.edtBirthDateText);
        edtUsernameText = findViewById(R.id.edtUsernameText);
        edtEmailText = findViewById(R.id.edtEmailText);
        edtPasswordText = findViewById(R.id.edtPasswordText);
        edtLocationText = findViewById(R.id.edtLocationText);

        rdBtnMale = findViewById(R.id.rdBtnMale);
        rdBtnFemale = findViewById(R.id.rdBtnFemale);
        rdBtnOther = findViewById(R.id.rdBtnOther);

        btnAdd = findViewById(R.id.btnAdd);
        btnClear = findViewById(R.id.btnClear);

        ActionBar mActionBar = getSupportActionBar();
        mActionBar.hide();

        addDatePicker();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fieldCheck();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fieldClear();
            }
        });
    }

    private void addDatePicker() {
        edtBirthDateText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        AddNewCustomerActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener,
                        year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                String date = "";
                month = month + 1;
                String monthName = getMonthName(month);
                if (day < 10) {
                    date = "0" + day + "/" + monthName + "/" + year;
                } else {
                    date = day + "/" + monthName + "/" + year;
                }
                edtBirthDateText.setText(date);
            }
        };
    }


}
