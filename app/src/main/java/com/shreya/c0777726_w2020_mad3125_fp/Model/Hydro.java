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

    @Override
    public Double billCalculate()
    {
        double billAmount = 0.0;
        if (unitsUsed < 10)
        {
            billAmount = 1.5 * unitsUsed;
        }
        else
        {
            billAmount = 2 * unitsUsed;
        }
        return billAmount;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public Integer getUnitsUsed() {
        return unitsUsed;
    }

    public void setUnitsUsed(Integer unitsUsed) {
        this.unitsUsed = unitsUsed;
    }

}

