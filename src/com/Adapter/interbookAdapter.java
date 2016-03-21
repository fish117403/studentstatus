package com.Adapter;

import java.util.List;

import com.entity.InterBook;
import com.example.studentstatus.R;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class interbookAdapter extends BaseAdapter {
	private List<InterBook>list;
	private Context context;
	
	public interbookAdapter(List<InterBook> list, Context context) {
		super();
		this.list = list;
		this.context = context;
	}

	public int getCount() {
		return list.size();
	}

	public InterBook getItem(int arg0) {
		return list.get(arg0);
	}

	public long getItemId(int positon) {
		return positon;
	}

	public View getView(int positon, View view, ViewGroup arg2) {
		
		view = LayoutInflater.from(arg2.getContext()).inflate(R.layout.home_gridview_interbook_item, null);
		ViewHolder holder = new ViewHolder();
		ViewUtils.inject(holder, view);
		
		InterBook book = getItem(positon);
		holder.bookIndex_tv.setText(book.getBookIndex());
		holder.bookname_tv.setText(book.getBookName());
		holder.bookIcon_iv.setImageResource(book.getBookIcon());
		
		return view;
	}
	//ViewHolder∏¥”√
	public class ViewHolder{
		@ViewInject(R.id.home_gridview_interbook_itemindex)
		TextView bookIndex_tv;
		@ViewInject(R.id.home_gridview_interbook_itemicon)
		ImageView bookIcon_iv;
		@ViewInject(R.id.home_gridview_interbook_itemname)
		TextView bookname_tv;
	}
	

}
