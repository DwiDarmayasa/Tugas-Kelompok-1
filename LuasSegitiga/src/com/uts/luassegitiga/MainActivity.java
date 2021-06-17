package com.uts.luassegitiga;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
	EditText a,t;
	Button GoToHasil;
	TextView Hasil;
	Button hitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = (EditText) findViewById(R.id.editText1);
        t = (EditText) findViewById(R.id.editText2);
        hitung = (Button) findViewById(R.id.button2);
        Hasil = (TextView) findViewById(R.id.textView1);
        hitung.setOnClickListener(new View.OnClickListener(){
        	
        	@Override
        	public void onClick(View View){
        		if(a.length()==0 && t.length()==0){
        			Toast.makeText(getApplication(),"Mohon Masukan Alas dan Tinggi",Toast.LENGTH_LONG).show();
        		}
        		else if (a.length()==0){
        			Toast.makeText(getApplication(),"Mohon Masukan Alas",Toast.LENGTH_LONG).show();
        		}
        		else if (t.length()==0){
        			Toast.makeText(getApplication(),"Mohon Masukan Tinggi",Toast.LENGTH_LONG).show();
        		}
        		else{
        			String isialas = a.getText().toString();
        			String isitinggi = t.getText().toString();
        			double a = Double.parseDouble(isialas);
        			double t = Double.parseDouble(isitinggi);
        			double hs = LuasSegitiga(a,t);
        			String output = String.valueOf(hs);
        			Hasil.setText(output.toString());
        		}
        	}
        });
}
    public double LuasSegitiga(double a, double t){return a*t/2;}
    public void GoToNama(View View){
    	Intent Intent = new Intent(this, Nama.class);
    	startActivity(Intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
