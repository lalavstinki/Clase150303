package com.example.citm.laura_app;


import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



/**
 * A simple {@link Fragment} subclass.
 */
public class Frag1 extends Fragment implements View.OnClickListener {

    View parentView;
    RebreMissatgeDeFragment MiCallback;

    public Frag1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        parentView = inflater.inflate(R.layout.fragment_frag1, container, false);
        parentView.findViewById(R.id.button_frag1).setOnClickListener(this);
        return parentView;
    }

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);

        MiCallback = (RebreMissatgeDeFragment) activity;
    }


    public void cambiar_mensaje1(String msg) {
        TextView mensaje1_nuevo = (TextView) parentView.findViewById(R.id.mensaje1);
        mensaje1_nuevo.setText(msg);
    }

    @Override
    public void onClick(View v) {
        MiCallback.RebreMissatgeDeFrag("Hola desde Frag1");
    }
}
