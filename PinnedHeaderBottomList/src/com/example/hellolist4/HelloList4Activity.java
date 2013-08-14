package com.example.hellolist4;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class HelloList4Activity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello_list4);
		
		Intent intent = new Intent();
	

		intent.putExtra("counts", new int[] { 10, 12, 13 });
		intent.putExtra("names", new String[] { "name1", "name2", "name3" });
		intent.putExtra("showIfEmpty",new boolean[] { true, true, true });
		intent.putExtra("headers",new boolean[] { true, true, true });
		intent.putExtra("delays",  new int[] { 0, 0, 0 });

		// int[] counts = extras.getIntArray("counts");
		// String[] names = extras.getStringArray("names");
		// boolean[] showIfEmpty = extras.getBooleanArray("showIfEmpty");
		// boolean[] hasHeader = extras.getBooleanArray("headers");
		// int[] delays = extras.getIntArray("delays");
		
		intent.setClass(HelloList4Activity.this, PinnedHeaderListDemoActivity.class);
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hello_list4, menu);
		return true;
	}

}
