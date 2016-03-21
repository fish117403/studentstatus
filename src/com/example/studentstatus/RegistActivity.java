package com.example.studentstatus;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.event.OnClick;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistActivity extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_regist);
		ViewUtils.inject(this);
	}
	@OnClick({R.id.regist_backbtu,R.id.regist_nextBtu})
	public void onClick(View view){
		switch (view.getId()) {
		case R.id.regist_backbtu:
			finish();
			break;
		case R.id.regist_nextBtu:
			startActivity(new Intent(this,RegistParentsActivity.class));
			break;
		default:
			break;
		}
	}
	

}
