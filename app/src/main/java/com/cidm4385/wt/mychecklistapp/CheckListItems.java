package com.cidm4385.wt.mychecklistapp;

/**
 * Created by Amanda on 3/8/2018.
 */

public class CheckListItems {


    private String mItemName;
    private boolean mChecked;


    public String getItemName(){
        return mItemName;
    }

    public void setItemName(String itemName){
        mItemName = itemName;
    }

    public boolean isChecked(){
        return mChecked;
    }

    public void setChecked(boolean checked){
        mChecked = checked;
    }
}
