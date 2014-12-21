package com.menguasaimipasks.app;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fisikaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fisika); 
	}

public void onClick(View v) 
{
	// TODO Auto-generated method stub
	if(v.getId()==R.id.button2)
	{
		Intent i=new Intent(this,menuActivity.class);
		startActivity(i);
		finish();
	}
}

public void onClick(DialogInterface arg0, int arg1) {
	// TODO Auto-generated method stub
	
}

}

