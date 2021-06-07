package kasia.aplikacja.moja_aplikacja_18_05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Akt3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akt3);
    }

    public void kliknieto_85( View v)
    {
        finish();
    }
    public void kliknieto_26( View v)
    {
        Intent iss = new Intent( this, Akt26.class);
        startActivity( iss);
    }
    public void kliknieto_28( View v)
    {
        Intent iss = new Intent( this, Akt28.class);
        startActivity( iss);}}