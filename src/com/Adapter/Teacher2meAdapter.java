package com.Adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.studentstatus.R;

public class Teacher2meAdapter extends BaseAdapter {
	private LayoutInflater inflater;
	private List<String> list;
	public Teacher2meAdapter(Context context,List<String> list){
		inflater=LayoutInflater.from(context);
		this.list=list;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
		this.notifyDataSetChanged();
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return this.list.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		AdapterHolder holder=null;
		if(null==convertView){
			holder=new AdapterHolder();
			convertView=inflater.inflate(R.layout.listview_teacher2me, parent,false);
			holder.imag_head=(ImageView) convertView.findViewById(R.id.imag_head);
			holder.txt_content=(TextView) convertView.findViewById(R.id.txt_content);
			holder.txt_count=(TextView) convertView.findViewById(R.id.txt_count);
			holder.txt_date=(TextView) convertView.findViewById(R.id.txt_date);
			holder.txt_name=(TextView) convertView.findViewById(R.id.txt_name);
			holder.txt_time=(TextView) convertView.findViewById(R.id.txt_time);
			holder.txt_zhicheng=(TextView) convertView.findViewById(R.id.txt_zhicheng);
			convertView.setTag(holder);
		}else{
			holder=(AdapterHolder) convertView.getTag();
		}
		
		return convertView;
	}
	class AdapterHolder{
		private TextView txt_name;
		private ImageView imag_head;
		private TextView txt_count;
		private TextView txt_content;
		private TextView txt_date;
		private TextView txt_time;
		private RatingBar ratingBar;
		private TextView txt_zhicheng;
	}

}
