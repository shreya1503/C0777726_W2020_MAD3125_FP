package com.shreya.c0777726_w2020_mad3125_fp.Model;

import java.time.LocalDate;

public class Mobile extends Bill
{

    private String manufacturerName;
    private String planName;
    private String mobileNumber;
    private Integer mobGbUsed;
    private Integer minute;

    public Mobile(String billId, String billDate, BillType billType, String manufacturerName, String planName, String mobileNumber, Integer mobGbUsed, Integer minute) {
        super(billId, billDate, billType);

        this.manufacturerName = manufacturerName;
        this.planName = planName;
        this.mobileNumber = mobileNumber;
        this.mobGbUsed = mobGbUsed;
        this.minute = minute;
        this.billTotal = billCalculate();
    }

}