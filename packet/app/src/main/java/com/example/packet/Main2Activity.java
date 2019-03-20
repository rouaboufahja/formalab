package com.example.packet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import static com.example.packet.MainActivity.base;

public class Main2Activity extends AppCompatActivity {

    Button b ;
    EditText achatt ;
    EditText prix ;
    ListView liste1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b=findViewById(R.id.but);
        achatt=findViewById(R.id.nom);
        prix=findViewById(R.id.prix);


        b.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v)
            {
                String achats = achatt.getText().toString();
                Float prixx =Float.valueOf(prix.getText().toString());
                achat nouveau = new achat(achats, prixx);
                base.add(nouveau);
                Toast.makeText(Main2Activity.this, " ajouté "+Float.toString(achat.total), Toast.LENGTH_SHORT).show();
                MainActivity m =new MainActivity();
            }

        });
    }


}


