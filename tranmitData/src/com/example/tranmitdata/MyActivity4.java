package com.example.tranmitdata;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MyActivity4 extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myactivity);
		TextView textView = (TextView) findViewById(R.id.textview);
		MyApp myApp = (MyApp) getApplicationContext();

		textView.setText("MyApp.country��" + myApp.country + "\nMyApp.data.id��"
				+ myApp.data.id + "\nMyApp.data.name" + myApp.data.name);

	}

}
