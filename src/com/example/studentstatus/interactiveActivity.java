package com.example.studentstatus;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class interactiveActivity extends Activity {
	@ViewInject(R.id.home_gridview_inter_backbtu)
	private ImageButton imagebtu;
	@ViewInject(R.id.home_gridview_interbook)
	private ImageView imgInterbook;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_gridview_interactive);
		ViewUtils.inject(this);
	}
	@OnClick({R.id.home_gridview_inter_backbtu,R.id.home_gridview_interbook})
	public void onClick(View view){
		switch (view.getId()) {
		case R.id.home_gridview_inter_backbtu:
			Intent intent = new Intent(this,MainActivity.class);
			startActivity(intent);
			break;
		case R.id.home_gridview_interbook:
			Intent intent2 = new Intent(this,interbookActivity.class);
			startActivity(intent2);
			break;

		default:
			break;
		}
	}

}
