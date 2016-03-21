package com.example.studentstatus;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.event.OnClick;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class loginActvity extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		ViewUtils.inject(this);
	}
	@OnClick({R.id.login_login,R.id.login_regist})
	public void onClick(View view){
		switch (view.getId()) {
		case R.id.login_login:
			Intent intent = new Intent(this,MainActivity.class);
			startActivity(intent);
			break;
		case R.id.login_regist:
			startActivity(new Intent(this,RegistActivity.class));
			break;
		default:
			break;
		}
	}

}
