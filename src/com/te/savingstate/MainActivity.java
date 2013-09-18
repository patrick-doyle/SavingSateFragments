package com.te.savingstate;

import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	CacheFragment frag;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		FragmentManager fm = this.getFragmentManager();
		
		if(fm.findFragmentByTag("cache")!=null)
		{
			frag = (CacheFragment) fm.findFragmentByTag("cache");
			Toast.makeText(this, frag.getCache().getData(), Toast.LENGTH_SHORT).show();
		}
		else
		{
			frag = new CacheFragment();
			FragmentTransaction ft = fm.beginTransaction();
			ft.add(frag, "cache");
			ft.commit();
		}
			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
