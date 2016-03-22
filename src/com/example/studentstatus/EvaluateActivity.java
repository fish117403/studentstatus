package com.example.studentstatus;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.Adapter.EvaluateTeacherAdapter;

/**
 * 老师列表
 * 
 * @author ty
 * 
 */
public class EvaluateActivity extends Activity implements OnClickListener {
	private ListView listView;
	private List<String> list;
	private EvaluateTeacherAdapter adapter;
	private SwipeRefreshLayout refresh;
	private int page = 1;
	
	private ImageView back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_evaluate);
		init();
	}

	private void init() {
		back=(ImageView) findViewById(R.id.back);
		back.setOnClickListener(this);
		
		listView = (ListView) findViewById(R.id.list_score);
		list = new ArrayList<String>();
		list.add("2015期中");
		list.add("2015期末");
		list.add("2016期中");
		list.add("2016期末");
		adapter = new EvaluateTeacherAdapter(this, list);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Intent intent=new Intent(EvaluateActivity.this,EvluateTeacherActivity.class);
				startActivity(intent);
				
			}
		});
		listView.setOnScrollListener(new OnScrollListener() {

			@Override
			public void onScrollStateChanged(AbsListView view, int scrollState) {
				switch (scrollState) {
				case OnScrollListener.SCROLL_STATE_IDLE:
					if (view.getLastVisiblePosition() == view.getCount() - 1) {
						page++;
						list = new ArrayList<String>();
						list.add("111");
						list.add("111");
						ArrayList<String> list1 = (ArrayList<String>) adapter
								.getList();
						list1.addAll(list);
						adapter.setList(list1);
					}
					break;

				}

			}

			@Override
			public void onScroll(AbsListView arg0, int arg1, int arg2, int arg3) {
				// TODO Auto-generated method stub

			}
		});
		refresh = (SwipeRefreshLayout) findViewById(R.id.refresh_evalueate);
		refresh.setOnRefreshListener(new OnRefreshListener() {

			@Override
			public void onRefresh() {
				page = 1;
				adapter.setList(list);
			}
		});
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.back:
			finish();
			break;
		}

	}

}
