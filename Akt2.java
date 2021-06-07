package kasia.aplikacja.moja_aplikacja_18_05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Akt2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akt2);
    }

    public void kliknieto_16( View v)
    {
        Intent iss = new Intent( this, Akt8.class);
        startActivity( iss);
    }

    public void kliknieto_11( View v){

        Intent iss = new Intent( this, Akt11.class);
        startActivity( iss);

}
    public void kliknieto_10 ( View v){
        Intent iss = new Intent( this, Akt10.class);
        startActivity( iss);
    }
    public void kliknieto_25( View v){
        {finish();
        }
    }
}


