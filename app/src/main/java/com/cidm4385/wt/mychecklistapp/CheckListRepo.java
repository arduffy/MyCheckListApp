package com.cidm4385.wt.mychecklistapp;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amanda on 3/8/2018.
 */

public class CheckListRepo {

    private static CheckListRepo sCheckListRepo;

    private List<CheckListItems> mCheckListItems;

    public static CheckListRepo get(Context context) {
        if (sCheckListRepo == null) {
            sCheckListRepo = new CheckListRepo(context);
        }

        return sCheckListRepo;
    }

    private CheckListRepo(Context context) {
        ArrayList<String> CheckListItems= new ArrayList<String>();
            CheckListItems.add("RAM");
            CheckListItems.add("Monitor");


    }

    public List<CheckListItems> getCheckListItems() {
        return mCheckListItems;
    }
}
