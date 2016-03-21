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
import android.widget.TextView;

public class informActivity extends Activity {
	@ViewInject(R.id.home_gridview_inform_backbtu)
	private ImageButton imagebtu;
	@ViewInject(R.id.home_gridview_inform_title)
	private TextView titletv;
	@ViewInject(R.id.home_gridview_inform_contents)
	private TextView contentstv;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_gridview_inform);

		ViewUtils.inject(this);

	}

	@OnClick({ R.id.home_gridview_inform_backbtu,
			R.id.home_gridview_inform_title, R.id.home_gridview_inform_contents })
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.home_gridview_inform_backbtu:
			startActivity(new Intent(this,MainActivity.class));
			break;
		case R.id.home_gridview_inform_title:
			startActivity(new Intent(this, informdescActivity.class));
			break;
		case R.id.home_gridview_inform_contents:
			startActivity(new Intent(this, informdescActivity.class));
			break;

		default:
			break;
		}

	}

}
