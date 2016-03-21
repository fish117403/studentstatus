package com.Adapter;

import java.util.List;
import java.util.Map;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.studentstatus.R;

public class Me2TeacherAdapter extends BaseExpandableListAdapter {
	private LayoutInflater inflater;
	private List<String> parentList;
	private Context context;
	 Map<String, List<String>> map = null;
	public Me2TeacherAdapter(Context context,List<String> parentList,Map<String, List<String>> map){
		inflater=LayoutInflater.from(context);
		this.parentList=parentList;
		this.context=context;
		this.map=map;
	}

	public List<String> getParentList() {
		return parentList;
	}

	public void setParentList(List<String> parentList) {
		this.parentList = parentList;
	}

	public Map<String, List<String>> getMap() {
		return map;
	}

	public void setMap(Map<String, List<String>> map) {
		this.map = map;
	}

	@Override
	public Object getChild(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public long getChildId(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return childPosition;
	}
	@Override
	public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView,
			ViewGroup parent) {
		AdapterHolder holder=null;
		if(null==convertView){
			holder=new AdapterHolder();
			convertView=inflater.inflate(R.layout.listview_child_me2teacher, parent,false);
			holder.imag_head=(ImageView) convertView.findViewById(R.id.imag_head);
			holder.txt_content=(TextView) convertView.findViewById(R.id.txt_content);
			holder.txt_count=(TextView) convertView.findViewById(R.id.txt_count);
			holder.txt_name=(TextView) convertView.findViewById(R.id.txt_name);
			holder.txt_zhicheng=(TextView) convertView.findViewById(R.id.txt_zhicheng);
			holder.ratingBar=(RatingBar) convertView.findViewById(R.id.ratingbar);
			convertView.setTag(holder);
		}else{
			holder=(AdapterHolder) convertView.getTag();
		}
		
		return convertView;
	}
	@Override
	public int getChildrenCount(int arg0) {
		// TODO Auto-generated method stub
		return 5;
	}
	@Override
	public Object getGroup(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getGroupCount() {
		// TODO Auto-generated method stub
		return parentList.size();
	}
	@Override
	public long getGroupId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public View getGroupView(int position, boolean arg1, View convertView, ViewGroup parent) {
		AdapterParentHolder holder=null;
		if(null==convertView){
			holder=new AdapterParentHolder();
			convertView=inflater.inflate(R.layout.listview_me2teacher, parent,false);
			holder.imag_head=(ImageView) convertView.findViewById(R.id.imag_head);
			holder.txt_date=(TextView) convertView.findViewById(R.id.txt_date);
			convertView.setTag(holder);
		}else{
			holder=(AdapterParentHolder) convertView.getTag();
		}
		holder.txt_date.setText(parentList.get(position));
		
		return convertView;
	}
	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isChildSelectable(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return false;
	}
	


	class AdapterParentHolder{
		private TextView txt_date;
		private ImageView imag_head;
		private ListView listView;
	}
		
	class AdapterHolder{
		private TextView txt_name;
		private ImageView imag_head;
		private TextView txt_count;
		private TextView txt_content;
		private RatingBar ratingBar;
		private TextView txt_zhicheng;
	}
}

