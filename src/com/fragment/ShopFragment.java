package com.fragment;

import com.example.studentstatus.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ShopFragment extends Fragment {
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View shopFrgment = inflater.inflate(R.layout.fragment_shop, null);
		return shopFrgment;
	}

}
