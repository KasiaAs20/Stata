package kasia.aplikacja.moja_aplikacja_18_05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Akt1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akt1);
    }


    public void kliknieto_6( View v)
    {
        Intent iss = new Intent( this, Akt6.class);
        startActivity( iss);

    }

    public void kliknieto_7( View v)
    {
        Intent iss = new Intent( this, Akt7.class);
        startActivity( iss);
    }

    public void kliknieto_8( View v)
    {
        Intent iss = new Intent( this, Akt8.class);
        startActivity( iss);
    }
    public void kliknieto_9( View v)
    {
        Intent iss = new Intent( this, Akt9.class);
        startActivity( iss);
    }


    public void kliknieto_15( View v)
    {finish();
    }}