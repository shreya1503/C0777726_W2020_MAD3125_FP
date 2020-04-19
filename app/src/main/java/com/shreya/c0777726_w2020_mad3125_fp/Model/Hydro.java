package com.shreya.c0777726_w2020_mad3125_fp.Model;

public class Hydro extends Bill
{
    private String agencyName;
    private Integer unitsUsed;

    public Hydro(String billId, String billDate, BillType billType, String agencyName, Integer unitsUsed)
    {
        super(billId, billDate, billType);
        this.agencyName = agencyName;
        this.unitsUsed = unitsUsed;
        this.billTotal = billCalculate();
    }
}
