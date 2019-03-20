package com.example.packet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView liste ;
    public static adaptator array ;
    public static ArrayList<achat> base ;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        base= new ArrayList<achat>();
        liste=findViewById(R.id.liste1);
        array=new adaptator(this,R.layout.achat,base);

        liste.setAdapter(array);

    }

    @Override
    public void onResume(){
        super.onResume();
        // put your code here...
        array=new adaptator(this,R.layout.achat,base);

        liste.setAdapter(array);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu,menu);
        return true ;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if( item.getItemId()==R.id.but)
        {
            Intent intent = new Intent(MainActivity.this, Main2Activity.class); startActivity(intent);
        }

        if( item.getItemId()==R.id.total)
        {
            Intent intent = new Intent(MainActivity.this, Main3Activity.class); startActivity(intent);
        }
        return true ;
    }



}

