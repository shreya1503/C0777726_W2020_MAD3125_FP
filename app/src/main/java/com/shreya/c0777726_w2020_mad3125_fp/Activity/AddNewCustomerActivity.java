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


}
