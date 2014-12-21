package com.menguasaimipasks.app;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class matematikaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.matematika);
		
		Button button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v) 
			{
				Intent A=new Intent (getApplicationContext(), mathActivity.class);
				startActivity(A);
				// TODO Auto-generated method stub
			}     
		});
	}

public void onClick(View v) 
{
	// TODO Auto-generated method stub
	if(v.getId()==R.id.button1)
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

 