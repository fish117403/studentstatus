package com.example.studentstatus;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.event.OnClick;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistParentsActivity extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.regist_parents);
		ViewUtils.inject(this);
	}
	@OnClick({R.id.registparents_backbtu,R.id.registparents_nextBtu})
	public void onClick(View view){
		switch (view.getId()) {
		case R.id.registparents_backbtu:
			finish();
			break;
		case R.id.registparents_nextBtu:
			startActivity(new Intent(this,RegistStudentActivity.class));
			break;

		default:
			break;
		}
		
	}
	

}
