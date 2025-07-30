package com.example.tpostudentss;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment1 extends Fragment {

    TextView tv2,tv3,tv4,tv5,tv17,tv18,tv19;

    public Fragment1() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);


        tv2 = (TextView)view.findViewById(R.id.t2);
        tv3 = (TextView)view.findViewById(R.id.t3);
        tv4 = (TextView)view.findViewById(R.id.t4);
        tv5 = (TextView)view.findViewById(R.id.t5);
        tv17 = (TextView)view.findViewById(R.id.t17);
        tv18 = (TextView)view.findViewById(R.id.t18);
        tv19 = (TextView)view.findViewById(R.id.t19);



        tv2.setText("DOB : " +getActivity().getIntent().getStringExtra("DOB"));
        tv3.setText("" +getActivity().getIntent().getStringExtra("EMAIL"));
        tv4.setText("" +getActivity().getIntent().getStringExtra("PHONE"));
        tv5.setText("" +getActivity().getIntent().getStringExtra("ADDRESS") + ", ");
        tv17.setText("" +getActivity().getIntent().getStringExtra("CITY") + ", ");
        tv18.setText("" +getActivity().getIntent().getStringExtra("STATE") + ", ");
        tv19.setText("" +getActivity().getIntent().getStringExtra("PINCODE" ));
        return view;
    }
}