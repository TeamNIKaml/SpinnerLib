package com.teamNikAml.spinnerlib;

import java.util.ArrayList;
import java.util.List;

import com.teamNikAml.spinnerlib.model.SpinnerAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {
	
	private Spinner spinner;
	private List<String> spinnerTextList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		init();
		
		
	}

	/**
	@author Nikhil V
	Jun 15, 2015
	 */
	private void init() {
		// TODO Auto-generated method stub
	/*	roomSpinnerAdaptor = new ArrayAdapter<String>(getActivity()
				.getApplicationContext(), R.layout.spinnertext, roomsNameList);
		roomSpinner.setAdapter(roomSpinnerAdaptor);*/
		
		spinnerTextList = new ArrayList<String>();
		
		for(int i=0;i<10;i++)
		{
			spinnerTextList.add("item "+String.valueOf(i));
		}
		
		System.out.println(spinnerTextList);
		
		spinner =(Spinner) findViewById(R.id.spinner1);
		SpinnerAdapter adapter = new SpinnerAdapter(getApplicationContext(), spinnerTextList);
		spinner.setAdapter(adapter.getSpinnerAdaptor());
		
	}


}
