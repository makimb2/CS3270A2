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
public class FragmentB extends Fragment {


    public FragmentB() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Button loadFrag3;
        final TextView fragmentContainer2;


        // Inflate the layout for this fragment
        final View rootView2 = inflater.inflate(R.layout.fragment_b, container, false);

        loadFrag3 = (Button) rootView2.findViewById(R.id.loadFrag3);
        fragmentContainer2 = (TextView) rootView2.findViewById(R.id.fragmentContainer2);
        // editText1 = (TextView)rootView.findViewById(R.id.editText1);


        loadFrag3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                fragmentContainer2.setText("@string/fragment_b");


            }
        });

        return rootView2;

    }


}
