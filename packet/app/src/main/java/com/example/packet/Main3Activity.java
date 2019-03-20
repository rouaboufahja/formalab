package com.example.packet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {


    TextView tot ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        tot =findViewById(R.id.total);
        tot.setText(Float.toString(achat.total));

    }

    @Override
    public void onResume(){
        super.onResume();
        // put your code here...
        tot.setText(Float.toString(achat.total));
    }
}
