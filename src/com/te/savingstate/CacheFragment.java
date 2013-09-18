package com.te.savingstate;

import android.os.Bundle;
import android.app.Fragment;

public class CacheFragment extends Fragment {

	private Cache cache = new Cache();
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		cache.setData("Data geos here");
		this.setRetainInstance(true);
		super.onCreate(savedInstanceState);
	}	
	
	public Cache getCache() {
		return cache;
	}

	public void setCache(Cache cache) {
		this.cache = cache;
	}

	class Cache {
		String data;

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}
		
	}
}


