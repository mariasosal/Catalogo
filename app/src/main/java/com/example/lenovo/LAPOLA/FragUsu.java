package com.example.lenovo.LAPOLA;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.catalogo.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragUsu extends Fragment {


    public FragUsu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag_usu, container, false);
    }

}
