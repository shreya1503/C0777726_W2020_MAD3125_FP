package com.shreya.c0777726_w2020_mad3125_fp.Util;

import com.shreya.c0777726_w2020_mad3125_fp.Model.Bill;
import com.shreya.c0777726_w2020_mad3125_fp.Model.Customer;
import com.shreya.c0777726_w2020_mad3125_fp.Model.Hydro;
import com.shreya.c0777726_w2020_mad3125_fp.Model.Internet;
import com.shreya.c0777726_w2020_mad3125_fp.Model.Mobile;
import com.shreya.c0777726_w2020_mad3125_fp.R;


import java.util.HashMap;

public class DataSingleton
{
    private static DataSingleton repoObj = new DataSingleton();

    public static DataSingleton getInstance() {
        return repoObj;
    }

    private DataSingleton()
    {
    }

    private HashMap<String, Customer> customerMap = new HashMap<>();

    public HashMap getCustomerMap() {
        return this.customerMap;
    }

}