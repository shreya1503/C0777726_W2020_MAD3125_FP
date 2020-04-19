package com.shreya.c0777726_w2020_mad3125_fp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.shreya.c0777726_w2020_mad3125_fp.Adapter.BillAdapter;
import com.shreya.c0777726_w2020_mad3125_fp.Model.Bill;
import com.shreya.c0777726_w2020_mad3125_fp.Model.Customer;
import com.shreya.c0777726_w2020_mad3125_fp.R;
import com.shreya.c0777726_w2020_mad3125_fp.Util.UtilMethods;

import java.util.ArrayList;

public class ShowBillDetailActivity extends AppCompatActivity
{
    private RecyclerView rvBillsList;
    private ArrayList billsArrayList;
    private BillAdapter billsAdapter;
    private ImageView imgAddButton;
    private TextView txtTotalAmount;
    Customer customerObj;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_bill_detail);
        ActionBar mActionBar = getSupportActionBar();
        mActionBar.setTitle("Utility Bills");
        Intent mIntent = getIntent();
        customerObj = mIntent.getParcelableExtra("CustomerBills");
        billsArrayList = customerObj.getBills();
        txtTotalAmount = findViewById(R.id.txtTotalAmount);
        if(!billsArrayList.isEmpty()){
            txtTotalAmount.setText("Total Bill To Pay Is:"+ UtilMethods.getInstance().doubleFormatter((customerObj.getTotalAmount())));
        }
        else
        {
            txtTotalAmount.setText("There Are No Bills To Pay");
        }
        rvBillsList = findViewById(R.id.rvBillsList);
        billsAdapter = new BillAdapter(this.billsArrayList);

        RecyclerView.LayoutManager mLinearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        rvBillsList.setLayoutManager(mLinearLayoutManager);
        rvBillsList.setAdapter(billsAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);
        return true;
    }


}
