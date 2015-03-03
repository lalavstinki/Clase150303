package com.example.citm.laura_app;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;



public class Clase04 extends Activity {

    public boolean showing_frag1 = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clase04);

        if(savedInstanceState != null)
            return;

        getFragmentManager().beginTransaction().add(R.id.container1, new Frag1()).commit();
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
}
