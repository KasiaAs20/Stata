package kasia.aplikacja.moja_aplikacja_18_05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Akt11 extends AppCompatActivity {
    public void kliknieto_84( View v)
    {finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akt11);
        final EditText simpleEditText = (EditText) findViewById(R.id.simpleEditText);//get the id for edit text
        Button displayText = (Button) findViewById(R.id.displayText);//get the id for button
        displayText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (simpleEditText.getText().toString().equals("Histogram"))//check whether the entered text is not null
                {
                    Toast.makeText(Akt11.this,"Dobrze", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(Akt11.this,"Zle", Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}



