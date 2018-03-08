package com.cidm4385.wt.mychecklistapp;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CheckListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new CheckListFragment();
    }
}
