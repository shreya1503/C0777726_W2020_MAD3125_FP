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
    {}

    private HashMap<String, Customer> customerMap = new HashMap<>();

    public HashMap getCustomerMap() {
        return this.customerMap;
    }

    public void populateData()
    {
        Customer c1 = new Customer("C01","Shreya","Patel",
                "Female","shreya@mail.com","Shreya1234","Shreya1234","Scarborough",
                "01/Jan/1999", R.drawable.female);
        Customer c2 = new Customer("C02","Palak","Joshi",
                "Female","palak12@mail.com","Palak789","Palak789","Brampton",
                "01/Aug/1995",R.drawable.female);
        Customer c3 = new Customer("C03","Krishiv","Raj",
                "Male","Krish@mail.com","Palak789","123456","Markham",
                "17/Feb/1997",R.drawable.male);

        Mobile m1 = new Mobile("MB01",
                "09/Nov/2010",
                Bill.BillType.Mobile,
                "APPLE INC.",
                "Best Plan",
                "4372435081",
                5,
                29);

        Hydro h1 = new Hydro( "HY01",
                "01/Dec/2013",
                Bill.BillType.Hydro,
                "YourHydro",
                28);

        Hydro h2 = new Hydro( "HY02",
                "14/Jan/2016",
                Bill.BillType.Hydro,
                "Home Fast",
                15);

        Internet in1 = new Internet("IN01",
                "25/July/2003",
                Bill.BillType.Internet,
                "Virgin",
                21.3);





    }
}

}