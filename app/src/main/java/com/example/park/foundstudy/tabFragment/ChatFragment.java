package com.example.park.foundstudy.tabFragment;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.park.foundstudy.Activity.MainActivity;
import com.example.park.foundstudy.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChatFragment extends Fragment {


    public ChatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View  view = inflater.inflate(R.layout.fragment_chat, container, false);

        // Test Code
        Button btn = view.findViewById(R.id.cbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity a = getActivity();
                Toast.makeText(a, "버튼 클릭하였습니다.", Toast.LENGTH_SHORT).show();
            }
        });
        // Test Code /////


        // 여기 안에서 구현을 해줘야함.






        return view;
    }
}
