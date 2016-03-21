package com.example.studentstatus;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
/**
 * 具体评价老师
 * @author ty
 *
 */
public class EvluateTeacherActivity extends Activity implements OnClickListener{
	private ImageView back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_evluateteacher);
		init();
	}

	private void init() {
		back=(ImageView) findViewById(R.id.back);
		back.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		switch(view.getId()){
		case R.id.back :
			finish();
			break;
		}
		
	}
}
