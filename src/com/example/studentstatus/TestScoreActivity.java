package com.example.studentstatus;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.Adapter.TestScoreAdapter;

/**
 * 具体成绩
 * 
 * @author ty
 * 
 */
public class TestScoreActivity extends Activity implements OnClickListener {
	private ListView listView;
	private List<String> list;
	private TestScoreAdapter adapter;
	private SwipeRefreshLayout refresh;
	private int page = 1;
	private ImageView back;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_test_score);
		init();
	}

	private void init() {
		back = (ImageView) findViewById(R.id.back);
		back.setOnClickListener(this);
		listView = (ListView) findViewById(R.id.listview_testscore);
		list = new ArrayList<String>();
		list.add("哈哈期中");
		list.add("哈哈期末");
		list.add("2016期中");
		list.add("2016期末");
		adapter = new TestScoreAdapter(this, list);
		LinearLayout layout = (LinearLayout) LayoutInflater.from(this).inflate(
				R.layout.listview_foot, null);
		listView.addFooterView(layout);
		listView.setAdapter(adapter);

		listView.setOnScrollListener(new OnScrollListener() {

			@Override
			public void onScrollStateChanged(AbsListView view, int scrollState) {
				switch (scrollState) {
				case OnScrollListener.SCROLL_STATE_IDLE:
					if (view.getLastVisiblePosition() >= view.getCount() - 2) {
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
		refresh = (SwipeRefreshLayout) findViewById(R.id.refresh_testscore);
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
