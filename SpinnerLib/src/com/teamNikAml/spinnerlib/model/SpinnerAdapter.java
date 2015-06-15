/**
 * @author Nikhil V
 *
 * Jun 15, 2015
 */
package com.teamNikAml.spinnerlib.model;

import java.util.List;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.teamNikAml.spinnerlib.R;

/**
 * @author Nikhil V
 *
 */
public class SpinnerAdapter {
	
	private Context context;
	private List<String> spinnerTextList;
	
	
	public SpinnerAdapter(Context context, List<String> spinnerTextList) {
		super();
		this.context = context;
		this.spinnerTextList = spinnerTextList;
	}


	public ArrayAdapter<String> getSpinnerAdaptor()
	{
		return new ArrayAdapter<String>(context, R.layout.spinnertext, spinnerTextList);
	}

}
