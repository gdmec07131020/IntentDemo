package cn.edu.gdmec.s07131020.IntentDemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {
TextView mytv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.second);
		 Intent myintent = getIntent();
		 mytv=(TextView) findViewById(R.id.textView1);
		 Bundle mybundle = myintent.getExtras();
		 String msg = mybundle.getString("para1");
		 mytv.setText(msg);
	}

}
