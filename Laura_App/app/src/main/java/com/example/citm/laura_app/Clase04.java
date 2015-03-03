package com.example.citm.laura_app;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class Clase04 extends Activity implements RebreMissatgeDeFragment{

    View parentView;
    public boolean showing_frag1 = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clase04);

        if(savedInstanceState != null)
            return;

        getFragmentManager().beginTransaction().add(R.id.container1, new Frag1()).commit();
        getFragmentManager().beginTransaction().add(R.id.container2, new Frag2()).commit();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_clase04, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.action_settings) {
            if(showing_frag1){
                getFragmentManager().beginTransaction().replace(R.id.container1, new Frag2()).commit();
                showing_frag1 = false;
            }
            else{
                getFragmentManager().beginTransaction().replace(R.id.container1, new Frag1()).commit();
                showing_frag1 = true;
            }
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void Boton1(View v) {
        Frag1 f = (Frag1) getFragmentManager().findFragmentById(R.id.container1);
        if (f != null) {
            f.cambiar_mensaje1("Hola a frag1 desde la Activity");
        }
    }

    public void Boton2(View v2) {
        Frag2 f2 = (Frag2) getFragmentManager().findFragmentById(R.id.container2);
        if (f2 != null) {
            f2.cambiar_mensaje2("Hola a frag2 desde la Activity");
        }
    }

    @Override
    public void RebreMissatgeDeFrag(String msg) {
        TextView titulo_nuevo = (TextView) parentView.findViewById(R.id.titulo);
        titulo_nuevo.setText(msg);
    }
}
