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
public class FragmentC extends Fragment {


    public FragmentC() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Button loadFrag4;
        final TextView fragmentContainer3;

        // Inflate the layout for this fragment
        View rootView3 = inflater.inflate(R.layout.fragment_c, container, false);

        loadFrag4 = (Button) rootView3.findViewById(R.id.loadFrag4);
        fragmentContainer3 = (TextView) rootView3.findViewById(R.id.fragmentContainer3);



        loadFrag4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                fragmentContainer3.setText("@string/fragment_c");


            }
        });
        return rootView3;
    }


}
