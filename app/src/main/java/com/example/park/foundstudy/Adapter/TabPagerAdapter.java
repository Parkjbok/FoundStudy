package com.example.park.foundstudy.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.park.foundstudy.tabFragment.ChatFragment;
import com.example.park.foundstudy.tabFragment.SettingFragment;
import com.example.park.foundstudy.tabFragment.StudyFragment;

public class TabPagerAdapter extends FragmentStatePagerAdapter {

    //Count number of tabs
    private int tabCount;

    public TabPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }


    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position){
            case 0:
                  StudyFragment study = new StudyFragment();
                return study;
            case 1:
                ChatFragment chat = new ChatFragment();
                return chat;
            case 2:
                SettingFragment setting = new SettingFragment();
                return setting;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
