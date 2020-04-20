package com.shreya.c0777726_w2020_mad3125_fp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.shreya.c0777726_w2020_mad3125_fp.Fragments.BillFragment;
import com.shreya.c0777726_w2020_mad3125_fp.Model.Bill;
import com.shreya.c0777726_w2020_mad3125_fp.Model.Customer;
import com.shreya.c0777726_w2020_mad3125_fp.R;
import com.shreya.c0777726_w2020_mad3125_fp.Util.UtilMethods;

import java.util.ArrayList;

public class BillDetailsActivity extends AppCompatActivity
{
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    private TextView txtTotalAmount;
    private ImageView imgAddButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_bill_details);

        Intent mIntent = getIntent();
        Customer customerObj = mIntent.getParcelableExtra("CustomerBills");

        ArrayList<Bill> bills = customerObj.getBills();

        txtTotalAmount = findViewById(R.id.txtTotalAmount);
        imgAddButton = findViewById(R.id.imgAddBill);
        imgAddButton.setImageResource(R.drawable.ic_action_addbill);

        imgAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(BillDetailsActivity.this, AddNewBillActivity.class);
                startActivity(mIntent);
            }
        });

        txtTotalAmount.setText(UtilMethods.getInstance().doubleFormatter(customerObj.getTotalAmount()));

        ActionBar mActionBar = getSupportActionBar();
        mActionBar.hide();

        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.add(R.id.container, new BillFragment());
        mFragmentTransaction.commit();

//        mFragmentTransaction = mFragmentManager.beginTransaction();
//        mFragmentTransaction.add(R.id.container2, new BillsFragment());
//        mFragmentTransaction.commit();
    }

}
