package com.example.park.foundstudy.tabFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
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
        return inflater.inflate(R.layout.fragment_study, container, false);
    }

}