package com.example.studentstatus;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ImageView;
import android.widget.ListView;

import com.Adapter.AttendanceAdapter;
/**
 * 考勤页
 * @author ty
 *
 */
public class AttendanceActivity extends Activity implements OnClickListener{
	private ListView listView;
	private List<String> list;
	private AttendanceAdapter adapter;
	private  SwipeRefreshLayout refresh;
	private int page=1;
	private ImageView imag_calender;
	private ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_attendance);
        init();
    }
    private void init() {
    	back=(ImageView) findViewById(R.id.back);
    	back.setOnClickListener(this);
    	imag_calender=(ImageView) findViewById(R.id.imag_calender);
    	imag_calender.setOnClickListener(this);
		listView=(ListView) findViewById(R.id.listview_attendance);
		list=new ArrayList<String>();
		list.add("哈哈期中");
		list.add("哈哈期末");
		list.add("2016期中");
		list.add("2016期末");
		adapter=new AttendanceAdapter(this, list);
		listView.setAdapter(adapter);
		listView.setOnScrollListener(new OnScrollListener() {
			
			@Override
			public void onScrollStateChanged(AbsListView view, int scrollState) {
				switch(scrollState){
				case OnScrollListener.SCROLL_STATE_IDLE:
					if(view.getLastVisiblePosition()==view.getCount()-1){
						page++;
						list=new ArrayList<String>();
						list.add("111");
						list.add("111");
						ArrayList<String> list1=(ArrayList<String>) adapter.getList();
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
		refresh=(SwipeRefreshLayout) findViewById(R.id.refresh_attendance);
		refresh.setOnRefreshListener(new OnRefreshListener() {
			
			@Override
			public void onRefresh() {
				page=1;
				adapter.setList(list);
			}
		});
	}
	@Override
	public void onClick(View view) {
		switch(view.getId()){
		case R.id.imag_calender:
			try {
	            Intent i = new Intent();
	            ComponentName cn = null;
	            if (Integer.parseInt(Build.VERSION.SDK) >= 8) {
	                cn = new ComponentName("com.android.calendar",
	                        "com.android.calendar.LaunchActivity");

	            } else {
	                cn = new ComponentName("com.google.android.calendar",
	                        "com.android.calendar.LaunchActivity");
	            }
	            i.setComponent(cn);
	            startActivity(i);
	        } catch (ActivityNotFoundException e) {
	        }
			break;
		case R.id.back:
			finish();
			break;
		}
		
	}
}
