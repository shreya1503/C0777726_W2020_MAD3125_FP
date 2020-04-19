package com.shreya.c0777726_w2020_mad3125_fp.Activity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.shreya.c077776_w2020_mad3125_fp.Model.Bill;
import com.shreya.c077776_w2020_mad3125_fp.Model.Customer;
import com.shreya.c077776_w2020_mad3125_fp.Model.Hydro;
import com.shreya.c077776_w2020_mad3125_fp.Model.Internet;
import com.shreya.c077776_w2020_mad3125_fp.Model.Mobile;
import com.shreya.c077776_w2020_mad3125_fp.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.Calendar;

public class AddNewBillActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    private Spinner spnBillType;
    private TextInputLayout edtBillId,edtNumber,edtBillDate,edtDataUsed,edtMinsUsed,edtManuftrName;
    private TextInputLayout edtPlanName,edtUnitsUsed,edtAgencyName;
    private TextInputEditText edtBillIdText,edtNumberText,edtBillDateText,edtDataUsedText,edtMinsUsedText,edtManuftrNameText;
    private TextInputEditText edtPlanNameText,edtUnitsUsedText,edtAgencyNameText;
    private Button btnBillAdd,btnBillClear;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    Customer custObj;
}
