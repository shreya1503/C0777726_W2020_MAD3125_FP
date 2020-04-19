package com.shreya.c0777726_w2020_mad3125_fp.Model;


import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Customer implements Parcelable
{

    private String customerId;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String userName;
    private String password;
    private String location;
    private String dateOfBirth;
    private HashMap<String, Bill> customerBills = new HashMap<String, Bill>();
    private Double allTotal;
    private int customerImg;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    protected Customer(Parcel in)
    {
        customerId = in.readString();
        firstName = in.readString();
        lastName = in.readString();
        gender = in.readString();
        email = in.readString();
        userName = in.readString();
        password = in.readString();
        location = in.readString();
        dateOfBirth = in.readString();
        customerBills = in.readHashMap(Bill.class.getClassLoader());
        allTotal = in.readDouble();
        customerImg = in.readInt();
    }



}
