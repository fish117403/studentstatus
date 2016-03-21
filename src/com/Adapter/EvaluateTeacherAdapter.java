package com.Adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.studentstatus.R;

public class EvaluateTeacherAdapter extends BaseAdapter {
	private LayoutInflater inflater;
	private List<String> list;
	public EvaluateTeacherAdapter(Context context,List<String> list){
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
		return 4;
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
			convertView=inflater.inflate(R.layout.listview_evaluateteacher, parent,false);
			holder.imag_head=(ImageView) convertView.findViewById(R.id.imag_head);
			holder.txt_name=(TextView) convertView.findViewById(R.id.txt_name);
			convertView.setTag(holder);
		}else{
			holder=(AdapterHolder) convertView.getTag();
		}
		holder.txt_name.setText(list.get(position));
		return convertView;
	}
	class AdapterHolder{
		private TextView txt_name;
		private ImageView imag_head;
		
	}
}
