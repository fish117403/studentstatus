package com.Adapter;

import java.util.ArrayList;
import java.util.List;

import com.entity.WorkChild;
import com.entity.WorkGroup;
import com.example.studentstatus.R;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ExpandableListViewAdapter extends BaseExpandableListAdapter {
	private Context context;
	private List<WorkGroup> grouplist;
	private List<List<WorkChild>> childlist;

	// 构造方法，初始化获取上下文对象
	public ExpandableListViewAdapter(Context context,List<WorkGroup> grouplist,List<List<WorkChild>> childlist) {
		super();
		this.context = context;
		this.grouplist = grouplist;
		this.childlist = childlist;
	}

	/**
	 * child子项
	 * */
	
	public Object getChild(int groupPosition, int childPosition) {
		return childlist.get(groupPosition).get(childPosition);
	}

	public long getChildId(int  groupPosition, int childPosition) {
		return childPosition;
	}

	public View getChildView(int  groupPosition, int childPosition, boolean isLastchild, View view,
			ViewGroup parent) {
		
			view = LayoutInflater.from(context).inflate(R.layout.home_gridview_work_child, null);
			ViewHolderChild holderchild = new ViewHolderChild();
			ViewUtils.inject(holderchild, view);
			
			holderchild.workcourse.setText(childlist.get(groupPosition).get(childPosition).getCourse());
			holderchild.workIcon.setImageResource(childlist.get(groupPosition).get(childPosition).getIcon());
			holderchild.workcontent1.setText(childlist.get(groupPosition).get(childPosition).getContent1());
			holderchild.workcontent2.setText(childlist.get(groupPosition).get(childPosition).getContent2());
			holderchild.workcontent3.setText(childlist.get(groupPosition).get(childPosition).getContent3());
		
        return view;
	}

	public int getChildrenCount(int groupPosition) {
		 
		return childlist.get(groupPosition).size();
	}

	/**
	 * group组
	 */
	public Object getGroup(int groupPosition) {
		return grouplist.get(groupPosition);
	}
	
	public int getGroupCount() {
		return grouplist.size();
		
	}

	public long getGroupId(int groupPosition) {
		return groupPosition;
	}

	public View getGroupView(int groupPosition, boolean isExpanded, View view, ViewGroup parent) {
		
		view = LayoutInflater.from(context).inflate(R.layout.home_gridview_work_group, null);
		ViewHolderGroup holderGroup = new ViewHolderGroup();
		ViewUtils.inject(holderGroup, view);
		
		holderGroup.workweek.setText(grouplist.get(groupPosition).getWeek());
		holderGroup.workdate.setText(grouplist.get(groupPosition).getDate());
		
		return view;
	}

	public boolean hasStableIds() {
		return false;
	}
    //设置子列表是否可选中
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		return true;
	}
	
	/***
	 * 
	 *ViewHolder复用类
	 */
	class ViewHolderGroup{
		@ViewInject(R.id.work_group_week)
		private TextView workweek;
		@ViewInject(R.id.work_group_date)
		private TextView workdate;
	}
	class ViewHolderChild{
		@ViewInject(R.id.work_child_course)
		private TextView workcourse;
		@ViewInject(R.id.work_child_icon)
		private ImageView workIcon;
		@ViewInject(R.id.work_child_content1)
		private TextView workcontent1;
		@ViewInject(R.id.work_child_content2)
		private TextView workcontent2;
		@ViewInject(R.id.work_child_content3)
		private TextView workcontent3;
	}

}
