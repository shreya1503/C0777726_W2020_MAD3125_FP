package com.shreya.c0777726_w2020_mad3125_fp.Model;

import android.os.Parcelable;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public abstract class Bill implements Serializable
{

    public enum BillType
    {
        Mobile,
        Hydro,
        Internet,
    }
}