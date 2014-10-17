package cn.edu.gdmec.s07131020.IntentDemo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText myet;
    Button mybt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myet=(EditText) findViewById(R.id.editText1);
        mybt=(Button) findViewById(R.id.button1);
        
        mybt.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
		Intent myintent=new Intent(MainActivity.this,SecondActivity.class);
        myintent.putExtra("para1", myet.getText().toString());
        startActivity(myintent);

		
			}
        }
        );
        }
        
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
