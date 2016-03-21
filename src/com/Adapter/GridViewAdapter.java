package com.Adapter;

import java.util.List;

import com.entity.HomeCategory;
import com.example.studentstatus.R;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridViewAdapter extends BaseAdapter {
	private List<HomeCategory>list;
	private Context context;
	
	public GridViewAdapter(Context context, List<HomeCategory> list) {
		super();
		this.list = list;
		this.context = context;
	}

	public int getCount() {
		return list.size();
	}

	public HomeCategory getItem(int arg0) {
		return list.get(arg0);
	}

	public long getItemId(int arg0) {
		return arg0;
	}

	public View getView(int position, View view, ViewGroup arg2) {
		
		view = LayoutInflater.from(arg2.getContext()).inflate(R.layout.fragment_home_gridview_item, null);
		
		ViewHolder holder = new ViewHolder();
		ViewUtils.inject(holder, view);
		
		HomeCategory homecategory = getItem(position);//获取每一项内容
		holder.iv.setImageResource(homecategory.getCategoryID());
		holder.tv.setText(homecategory.getCategoryDesc());
		
		
		return view;
	}
	public class ViewHolder{
		@ViewInject(R.id.home_gridview_icon)
		public ImageView iv;
		@ViewInject(R.id.home_gridview_desc)
		public TextView tv;
		
	}
	

	

}
