package com.example.citm.laura_app;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag2 extends Fragment implements View.OnClickListener {

    View parentView;

    public Frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        parentView = inflater.inflate(R.layout.fragment_frag2, container, false);
        parentView.findViewById(R.id.button_frag2).setOnClickListener(this);
        return parentView;
    }

    public void cambiar_mensaje2(String msg) {
        TextView mensaje2_nuevo = (TextView) parentView.findViewById(R.id.mensaje2);
        mensaje2_nuevo.setText(msg);
    }

    @Override
    public void onClick(View v) {

    }
}
