package com.shreya.c0777726_w2020_mad3125_fp.Model;

import java.time.LocalDate;

public class Internet extends Bill
{
    private String providerName;
    private Double gbUsed;

    public Internet(String billId, String billDate, BillType billType, String providerName, Double gbUsed) {
        super(billId, billDate, billType);
        this.providerName = providerName;
        this.gbUsed = gbUsed;
        this.billTotal = billCalculate();
    }
}
