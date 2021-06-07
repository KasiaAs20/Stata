package kasia.aplikacja.moja_aplikacja_18_05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Akt7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akt7);
    }

    public void kliknieto_7( View v)
    {
        final RadioButton pytanie1, pytanie2, pytanie3, pytanie4;

        setContentView(R.layout.activity_main);
        pytanie1 = (RadioButton)findViewById(R.id.rdb1);
        pytanie3 = (RadioButton)findViewById(R.id.rdb2);
        pytanie2 = (RadioButton)findViewById(R.id.rdb3);

        Button btn = (Button)findViewById(R.id.getBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "Wybrane odpowiedzi ";
                result+= (pytanie1.isChecked())?"dobrze":(pytanie3.isChecked())?"zle":(pytanie2.isChecked())?"zle":":";
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void kliknieto_68( View v)
    {finish();
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        String str="";
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rdb1:
                if(checked)
                    str = "dobrze";
                break;
            case R.id.rdb2:
                if(checked)
                    str = "zle";
                break;
            case R.id.rdb3:
                if(checked)
                    str = "zle";
                break;

        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }
}
