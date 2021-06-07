package kasia.aplikacja.moja_aplikacja_18_05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Akt4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akt4);
    }
    public void kliknieto_50( View v)
    {finish();
    }


    public void kliknieto_105( View v)
    {
        finish();
    }
    public void kliknieto_32( View v)
    {
        Intent iss = new Intent( this, Akt32.class);
        startActivity( iss);
    }
    public void kliknieto_33( View v)
    {
        Intent iss = new Intent( this, Akt33.class);
        startActivity( iss);
    }}
