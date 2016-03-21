package com.example.studentstatus;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class RegistStudentActivity extends Activity {
	@ViewInject(R.id.registstudent_check)
	private CheckBox check;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.regist_student);
		ViewUtils.inject(this);
	}
	
	@OnClick({R.id.registstudent_backbtu,R.id.registstudent_addBtu,R.id.registstudent_commitBtu})
	public void onClick(View view){
		switch (view.getId()) {
		case R.id.registstudent_backbtu:
			finish();
			break;
		case R.id.registstudent_addBtu:
			
			break;
		case R.id.registstudent_commitBtu:
			if (check.isChecked()==false) {
				Toast.makeText(this, "«ÎÕÍ’˚ÃÓ–¥", Toast.LENGTH_SHORT).show();
			}else{
				startActivity(new Intent(this,MainActivity.class));
			}
			break;

		default:
			break;
		}
		
	}

}
