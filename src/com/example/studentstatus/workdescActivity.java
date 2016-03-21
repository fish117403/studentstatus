package com.example.studentstatus;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.event.OnClick;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class workdescActivity extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_gridview_workdesc);
		ViewUtils.inject(this);
	}
	@OnClick({R.id.home_gridview_workdesc_backbtu})
	public void onClick(View view){
		finish();
	}

}
