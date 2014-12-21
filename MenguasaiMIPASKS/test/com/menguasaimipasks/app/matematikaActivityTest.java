package com.menguasaimipasks.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class matematikaActivityTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOnCreateBundle() {
	class matematikaActivity extends Activity {

			@Override
			protected void onCreate(Bundle savedInstanceState) {
				// TODO Auto-generated method stub
				super.onCreate(savedInstanceState);
				setContentView(R.layout.matematika);
				
				Button button2 = (Button) findViewById(R.id.button1);
				button2.setOnClickListener(new View.OnClickListener()
				{
					@Override
					public void onClick(View v) 
					{
						Intent A=new Intent (getApplicationContext(), biologiActivity.class);
						startActivity(A);
						// TODO Auto-generated method stub
					}     
				});
			}
	}
	}
}
