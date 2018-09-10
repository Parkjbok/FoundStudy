package com.example.park.foundstudy.tabFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.park.foundstudy.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class StudyFragment extends Fragment {


    public StudyFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View  view = inflater.inflate(R.layout.fragment_study, container, false);


        // 여기 안에서 구현을 해줘야함.

        return view;
    }

}
