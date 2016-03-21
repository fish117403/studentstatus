package com.example.studentstatus;

import com.example.studentstatus.R;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class informdescActivity extends Activity {
	@ViewInject(R.id.home_gridview_informdesc_backbtu)
	private ImageButton imagebtu;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_gridview_informdesc);
		ViewUtils.inject(this);
	}
	@OnClick({R.id.home_gridview_informdesc_backbtu})
	public void onClick(View view){
		finish();
	}
	

}
