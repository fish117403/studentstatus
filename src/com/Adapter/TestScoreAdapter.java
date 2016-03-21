package com.Adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.studentstatus.R;

public class TestScoreAdapter extends BaseAdapter {
	private LayoutInflater inflater;
	private List<String> list;
	public  static final  int HEAD=0;
	public  static final  int CONTENT=1;
	public  static final  int CONTENTDARK=2;
	public TestScoreAdapter(Context context, List<String> list) {
		inflater = LayoutInflater.from(context);
		this.list = list;
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
	public int getItemViewType(int position) {
		if(0==position){
			return HEAD;
		}else if(position%2==0){
			return CONTENTDARK;
		}
		return CONTENT;
	}

	@Override
	public int getViewTypeCount() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		AdapterHolder holder = null;
		AdapterHolder holder1 = null;
		 int type = getItemViewType(position);  
			if(null==convertView){
				switch(type){
				case HEAD :
					convertView = inflater.inflate(R.layout.listview_testscore_head,
							parent, false);
					convertView.setTag(holder);
					break;
				case CONTENT :
					holder = new AdapterHolder();
					
					convertView = inflater.inflate(R.layout.listview_testscore ,
							parent, false);
					holder.txt_class = (TextView) convertView
							.findViewById(R.id.txt_class);
					holder.txt_number = (TextView) convertView
							.findViewById(R.id.txt_number);
					holder.txt_name = (TextView) convertView
							.findViewById(R.id.txt_name);
					holder.txt_attendance = (TextView) convertView
							.findViewById(R.id.txt_attendance);
					convertView.setTag(holder);
					break;
				case CONTENTDARK:
					holder1 = new AdapterHolder();
					convertView = inflater.inflate(R.layout.listview_testscore_dark,
							parent, false);
					holder1.txt_class = (TextView) convertView
							.findViewById(R.id.txt_class);
					holder1.txt_number = (TextView) convertView
							.findViewById(R.id.txt_number);
					holder1.txt_name = (TextView) convertView
							.findViewById(R.id.txt_name);
					holder1.txt_attendance = (TextView) convertView
							.findViewById(R.id.txt_attendance);
					convertView.setTag(holder1);
				}
			}
		 else {
			 switch(type){
			 case CONTENT:
				 holder = (AdapterHolder) convertView.getTag();
				 break;
			 case CONTENTDARK:
				 holder1 = (AdapterHolder) convertView.getTag();
				 break;
			 }
		 }
		switch(type){
		case HEAD:
			break;
		case CONTENT:
			
			holder.txt_name.setText(list.get(position));
			break;
		case CONTENTDARK:
			holder1.txt_name.setText(list.get(position));
			break;
		}
		return convertView;
	}

	class AdapterHolder {
		private TextView txt_name;
		private TextView txt_class;
		private TextView txt_number;
		private TextView txt_attendance;
		
	}

}
