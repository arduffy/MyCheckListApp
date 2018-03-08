package com.cidm4385.wt.mychecklistapp;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amanda on 3/8/2018.
 */

public class CheckListRepo {

    private static CheckListRepo sCheckListRepo;

    private List<CheckListItem> mCheckListItems;

    public static CheckListRepo get(Context context) {
        if (sCheckListRepo == null) {
            sCheckListRepo = new CheckListRepo(context);
        }

        return sCheckListRepo;
    }

    private CheckListRepo(Context context) {
        mCheckListItems = new ArrayList<>();
        CheckListItem checkListItem = new CheckListItem();
        checkListItem.setItemName("CPU");
        checkListItem.setItemName("Monitor");
        checkListItem.setItemName("RAM");

        mCheckListItems.add(checkListItem);
    }

    public List<CheckListItem> getCheckListItems() {
        return mCheckListItems;
    }
}
