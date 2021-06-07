package kasia.aplikacja.moja_aplikacja_18_05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class Akt6 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akt6);
    }



    public void mess(View v)
    {

        ImageView im=(ImageView)findViewById(R.id.imageView1);

        switch(v.getId())
        {case R.id.button1:

            im.setImageResource(R.drawable.zadanie2);
            break;
            case R.id.button2:

                im.setImageResource(R.drawable.podpowiedz2);
                break;
            case R.id.button3:

                im.setImageResource(R.drawable.odpowiedz_zadanie2);
                break;
        }
    }
}


