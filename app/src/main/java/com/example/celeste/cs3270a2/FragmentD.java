package com.example.celeste.cs3270a2;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentD extends Fragment {


    public FragmentD() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Button loadFrag5;
        final TextView fragmentContainer4;

        // Inflate the layout for this fragment
        View rootView4 = inflater.inflate(R.layout.fragment_d, container, false);

        loadFrag5 = (Button) rootView4.findViewById(R.id.loadFrag4);
        fragmentContainer4 = (TextView) rootView4.findViewById(R.id.fragmentContainer3);



        loadFrag5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                fragmentContainer4.setText("@string/fragment_d");


            }
        });
        return rootView4;
    }


}
