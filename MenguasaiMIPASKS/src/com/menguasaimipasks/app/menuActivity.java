package com.menguasaimipasks.app;
 
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuActivity extends Activity implements OnClickListener 
{
		protected void onCreate (Bundle savedInstanceState)
		{ 
			super.onCreate(savedInstanceState);
			setContentView(R.layout.menu);
			Button button1 = (Button) findViewById(R.id.button1);
			button1.setOnClickListener(new View.OnClickListener()
			{
				@Override
				public void onClick(View v) 
				{
					Intent A=new Intent (getApplicationContext(), matematikaActivity.class);
					startActivity(A);
					// TODO Auto-generated method stub
				}     
			});
			Button button2 = (Button) findViewById(R.id.button2);
			button2.setOnClickListener(new View.OnClickListener()
			{
				@Override
				public void onClick(View v) 
				{
					Intent A=new Intent (getApplicationContext(), fisikaActivity.class);
					startActivity(A);
					// TODO Auto-generated method stub
				}     
			});
			Button button3 = (Button) findViewById(R.id.button3);
			button3.setOnClickListener(new View.OnClickListener()
			{
				@Override
				public void onClick(View v) 
				{
					Intent A=new Intent (getApplicationContext(), kimiaActivity.class);
					startActivity(A);
					// TODO Auto-generated method stub
				}     
			});
			Button button4 = (Button) findViewById(R.id.button4);
			button4.setOnClickListener(new View.OnClickListener()
			{
				@Override
				public void onClick(View v) 
				{
					Intent A=new Intent (getApplicationContext(), Activity.class);
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
			Intent i=new Intent(this,MainActivity.class);
			startActivity(i);
			finish();
		}
	}

	@Override
	public void onClick(DialogInterface arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}
 
}
