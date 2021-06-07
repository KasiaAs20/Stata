package kasia.aplikacja.moja_aplikacja_18_05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Akt10 extends AppCompatActivity {

        public void kliknieto_83( View v)
        {finish();
        }
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_akt10);

            final EditText simpleEditText = (EditText) findViewById(R.id.simpleEditText);
            Button displayText = (Button) findViewById(R.id.displayText);
            displayText.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (simpleEditText.getText().toString().equals("Krzywa normalna"))
                    {
                        Toast.makeText(Akt10.this,"Dobrze", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(Akt10.this,"Zle", Toast.LENGTH_LONG).show();
                    }
                }
            });
        }


    }



