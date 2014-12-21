package com.menguasaimipasks.app;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() 
        {	
			@Override
			public void onClick(View v) 
			{
				Intent i=new Intent (getApplicationContext(),menuActivity.class);
				startActivity(i);
				// TODO Auto-generated method stub
			}
		}
    );

Button button2 = (Button) findViewById(R.id.button2);
button2.setOnClickListener(new View.OnClickListener()
{
	@Override
	public void onClick(View v) 
	{
		Intent A=new Intent (getApplicationContext(), tentangActivity.class);
		startActivity(A);
		// TODO Auto-generated method stub
	}     
});
}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) 
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    } 
}