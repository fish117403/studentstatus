package com.example.studentstatus;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.event.OnClick;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class mysettingActivity extends Activity {
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.my_setting);
		ViewUtils.inject(this);
	}
	
	@OnClick({R.id.mysetting_backbtu})
	public void onClick(View view){
		finish();
	}

}
