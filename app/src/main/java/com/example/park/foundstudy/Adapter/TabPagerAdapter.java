package com.example.park.foundstudy.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.park.foundstudy.tabFragment.ChatFragment;
import com.example.park.foundstudy.tabFragment.SettingFragment;
import com.example.park.foundstudy.tabFragment.StudyFragment;

public class TabPagerAdapter extends FragmentPagerAdapter {

    // 탭의 갯수
    private final int tabCount;

    public TabPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    // position값 선택된 탭의 index , position에 따라서 해당 Fragment를 Page에 보여줌.
    @Override
    public Fragment getItem(int position) {

        // position 값을 받아와서 해당 Fragment를 생성
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
