package com.cidm4385.wt.mychecklistapp;

import android.support.v4.app.Fragment;

/**
 * Created by Amanda on 3/9/2018.
 */

public class CheckListItemActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CheckListItemFragment();
    }
}
