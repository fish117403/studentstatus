package com.fragment;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;

import com.Adapter.Teacher2meAdapter;
import com.example.studentstatus.R;

public class Fragment_Teacher2me extends Fragment {
	private View view;
	private ListView lv;
	
	private Teacher2meAdapter adapter;
	private List<String> list;
	private  SwipeRefreshLayout refresh;
	private int page=1;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view=inflater.inflate(R.layout.fragment_teacher2me, container,false);
		init();
		
		return view;
	}
	private void init() {
		lv=(ListView) view.findViewById(R.id.list);
		list=new ArrayList<String>();
		list.add("111");
		list.add("111");
		adapter=new Teacher2meAdapter(getActivity(),list );
		lv.setAdapter(adapter);
		lv.setOnScrollListener(new OnScrollListener() {
			
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
		refresh=(SwipeRefreshLayout) view.findViewById(R.id.refresh_2me);
		refresh.setOnRefreshListener(new OnRefreshListener() {
			
			@Override
			public void onRefresh() {
				page=1;
				adapter.setList(list);
			}
		});
	}
	

}
