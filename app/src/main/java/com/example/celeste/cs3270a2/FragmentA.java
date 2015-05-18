package com.example.celeste.cs3270a2;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {


    public FragmentA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Button loadFrag2;
        final TextView fragmentContainer1;


        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_a, container, false);


        loadFrag2 = (Button) rootView.findViewById(R.id.loadFrag2);
        fragmentContainer1 = (TextView) rootView.findViewById(R.id.fragmentContainer1);
       // editText1 = (TextView)rootView.findViewById(R.id.editText1);


        loadFrag2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                fragmentContainer1.setText("@string/fragment_a");

            }
        });

        return rootView;
    }


}
