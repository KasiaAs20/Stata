package kasia.aplikacja.moja_aplikacja_18_05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class akt5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akt5);
    }

    public void kliknieto_200( View v)
    {
        finish();
    }

    public void kliknieto_39( View v)
    {
        Intent iss = new Intent( this, Akt39.class);
        startActivity( iss);
    }
    public void kliknieto_40( View v)
    {
        Intent iss = new Intent( this, Akt40.class);
        startActivity( iss);
    }}