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
        checkListItem.setItemName("RAM");
        checkListItem.setChecked(false);
        mCheckListItems.add(checkListItem);

        checkListItem = new CheckListItem();
        checkListItem.setItemName("CPU");
        checkListItem.setChecked(false);
        mCheckListItems.add(checkListItem);

        checkListItem = new CheckListItem();
        checkListItem.setItemName("Power Supply");
        checkListItem.setChecked(false);
        mCheckListItems.add(checkListItem);

        checkListItem = new CheckListItem();
        checkListItem.setItemName("Graphic/video card");
        checkListItem.setChecked(false);
        mCheckListItems.add(checkListItem);

        checkListItem = new CheckListItem();
        checkListItem.setItemName("Case");
        checkListItem.setChecked(false);
        mCheckListItems.add(checkListItem);

        checkListItem = new CheckListItem();
        checkListItem.setItemName("Motherboard");
        checkListItem.setChecked(false);
        mCheckListItems.add(checkListItem);

        checkListItem = new CheckListItem();
        checkListItem.setItemName("Monitor");
        checkListItem.setChecked(false);
        mCheckListItems.add(checkListItem);

        checkListItem = new CheckListItem();
        checkListItem.setItemName("Keyboard and mouse");
        checkListItem.setChecked(false);
        mCheckListItems.add(checkListItem);

        checkListItem = new CheckListItem();
        checkListItem.setItemName("Cooling fans");
        checkListItem.setChecked(false);
        mCheckListItems.add(checkListItem);

        checkListItem = new CheckListItem();
        checkListItem.setItemName("Hard drive");
        checkListItem.setChecked(false);
        mCheckListItems.add(checkListItem);

        checkListItem = new CheckListItem();
        checkListItem.setItemName("Sound Card");
        checkListItem.setChecked(false);
        mCheckListItems.add(checkListItem);
    }


    public List<CheckListItem> getCheckListItems() {
        return mCheckListItems;
    }
}
