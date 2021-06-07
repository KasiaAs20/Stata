package kasia.aplikacja.moja_aplikacja_18_05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;
public class Akt8 extends AppCompatActivity {
        public void kliknieto_70( View v)
        {finish();}
 RadioButton pytanie1, pytanie2, pytanie3, pytanie4;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akt8);}
        public void kliknieto_8( View v){
        {
        pytanie1 = (RadioButton)findViewById(R.id.rdb1);
        pytanie3 = (RadioButton)findViewById(R.id.rdb2);
        pytanie2 = (RadioButton)findViewById(R.id.rdb3);
        pytanie4 = (RadioButton)findViewById(R.id.rdb4);
        Button btn = (Button)findViewById(R.id.getBtn);
        btn.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        String result = "Wybrane odpowiedzi ";
        result+= (pytanie1.isChecked())?"zle":(pytanie3.isChecked())?"dobrze":(pytanie2.isChecked())?"zle":(pytanie4.isChecked())?"zle":"";
        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
        }
        });
        }

}}

