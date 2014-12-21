 package com.menguasaimipasks.app;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tentangActivity extends Activity implements OnClickListener 
{
		protected void onCreate (Bundle savedInstanceState)
		{ 
			super.onCreate(savedInstanceState);
			setContentView(R.layout.tentang); 
		}

	public String onClick(String s) 
	{
		View v = null;
		// TODO Auto-generated method stub
		if(v.getId()==R.id.button2)
		{
			Intent i=new Intent(this,MainActivity.class);
			startActivity(i);
			finish();
		}
		return "Tentang aplikasi Kami "+s;
		
	}

	@Override
	public void onClick(DialogInterface arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}
 
}
