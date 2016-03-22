package com.example.studentstatus;

import com.example.studentstatus.R.color;
import com.fragment.Fragment_Me2teacher;
import com.fragment.Fragment_Teacher2me;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabWidget;
import android.widget.TextView;
/**
 * 评价
 * @author ty
 *
 */
public class EvaluationActivity extends FragmentActivity implements
		OnClickListener {
	private FragmentTabHost mTabHost;
	private TextView txt_hangxian1;
	private TextView txt_hangxian2;
	private TextView txt_title1;
	private TextView txt_title2;
	private TextView txt_go;
	private ImageView imag_calender;
	private ImageView back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_evaluation);
		init();
	}

	private void init() {
		back=(ImageView) findViewById(R.id.back);
		back.setOnClickListener(this);
		txt_go=(TextView) findViewById(R.id.txt_go);
		txt_go.setOnClickListener(this);
		mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
		mTabHost.setup(this, getSupportFragmentManager(),
				android.R.id.tabcontent);
		TabWidget widget = mTabHost.getTabWidget();
		View view1 = LayoutInflater.from(this).inflate(R.layout.tabwidget1,
				null);
		txt_hangxian1 = (TextView) view1.findViewById(R.id.txt_hengxian);
		txt_title1 = (TextView) view1.findViewById(R.id.txt_title);
		View view2 = LayoutInflater.from(this).inflate(R.layout.tabwidget2,
				null);
		txt_hangxian2 = (TextView) view2.findViewById(R.id.txt_hengxian);
		txt_title2 = (TextView) view2.findViewById(R.id.txt_title);
		// 修改每一项选项卡的字体
		for (int i = 0; i < widget.getChildCount(); i++) {
			TextView tv = (TextView) widget.getChildTabViewAt(i).findViewById(
					android.R.id.title);
			tv.setTextSize(16);
		}
		mTabHost.addTab(
				mTabHost.newTabSpec("evaluationMe").setIndicator(view1),
				Fragment_Teacher2me.class, null);
		mTabHost.addTab(
				mTabHost.newTabSpec("evaluationTeacher").setIndicator(view2),
				Fragment_Me2teacher.class, null);
		mTabHost.setOnTabChangedListener(new OnTabChangeListener() {

			@Override
			public void onTabChanged(String name) {
				if ("evaluationMe".equals(name)) {
					txt_title1.setTextColor(getResources().getColor(R.color.forecolor));
					txt_title2.setTextColor(getResources().getColor(R.color.greywhite));
					txt_hangxian1.setVisibility(View.VISIBLE);
					txt_hangxian2.setVisibility(View.INVISIBLE);
				} else {
					txt_title2.setTextColor(getResources().getColor(R.color.forecolor));
					txt_title1.setTextColor(getResources().getColor(R.color.greywhite));
					txt_hangxian2.setVisibility(View.VISIBLE);
					txt_hangxian1.setVisibility(View.INVISIBLE);
				}

			}
		});
	}

	@Override
	public void onClick(View view) {

		switch (view.getId()) {
		case R.id.back:
			finish();
			break;
		case R.id.txt_go:
			startActivity(new Intent(this,EvaluateActivity.class));
			break;
		}

	}

}
