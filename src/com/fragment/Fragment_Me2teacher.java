package com.fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupClickListener;

import com.Adapter.Me2TeacherAdapter;
import com.example.studentstatus.R;

public class Fragment_Me2teacher extends Fragment {
	private View view;
	private ExpandableListView listView;
	private Me2TeacherAdapter adapter;
	private List<String> list;
	private SwipeRefreshLayout refresh;
	private int page = 1;
	private Map<String, List<String>> map = null;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_me2teacher, container, false);

		return view;
	}

	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {
		init();
		super.onActivityCreated(savedInstanceState);
	}

	private void init() {
		listView = (ExpandableListView) view
				.findViewById(R.id.expandableListView_2teacher);
		list = new ArrayList<String>();
		list.add("111");
		list.add("111");
		map = new HashMap<String, List<String>>();
		adapter = new Me2TeacherAdapter(getActivity(), list, map);
		listView.setAdapter(adapter);
		for (int i = 0; i < list.size(); i++) {
			listView.expandGroup(i);
		}
		listView.setOnGroupClickListener(new OnGroupClickListener() {

			@Override
			public boolean onGroupClick(ExpandableListView arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				return true;
			}
		});
		//listview滚动监听
		listView.setOnScrollListener(new OnScrollListener() {

			@Override
			public void onScrollStateChanged(AbsListView view, int scrollState) {
				switch (scrollState) {
				//停止滚动 
				case OnScrollListener.SCROLL_STATE_IDLE:
					//判断是否是最后一项
					if (view.getLastVisiblePosition() == view.getCount() - 1) {
						
//						page++;
//						list = new ArrayList<String>();
//						list.add("111");
//						list.add("111");
//						ArrayList<String> list1 = (ArrayList<String>) adapter
//								.getParentList();
//						list1.addAll(list);
//						
//						adapter.setParentList(list1);
					}
					break;

				}

			}

			@Override
			public void onScroll(AbsListView arg0, int arg1, int arg2, int arg3) {
				// TODO Auto-generated method stub

			}
		});
		refresh = (SwipeRefreshLayout) view.findViewById(R.id.refresh_2teacher);
		refresh.setOnRefreshListener(new OnRefreshListener() {

			@Override
			public void onRefresh() {
				// page = 1;
				// adapter.setList(list);
			}
		});
	}
}
