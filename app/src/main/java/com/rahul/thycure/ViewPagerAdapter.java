package com.rahul.thycure;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new FragmentToDoList();
            case 1:
                return new FragmentFreezerList();
            case 2:
                return new FragmentAppStatistics();

        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "To-Do List";
            case 1:
                return "Freezer List";
            case 2:
                return "App Statistics";
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
