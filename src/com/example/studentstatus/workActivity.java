package com.example.studentstatus;

import java.util.ArrayList;
import java.util.List;

import com.Adapter.ExpandableListViewAdapter;
import com.entity.WorkChild;
import com.entity.WorkGroup;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;

public class workActivity extends Activity {
	@ViewInject(R.id.home_gridview_work_backbtu)
	private ImageView titlebtu;
	@ViewInject(R.id.home_gridview_work_expandable)
	private ExpandableListView expandable;
	private ExpandableListViewAdapter adapter;
	
	
	private List<WorkGroup> grouplist;
	private List<List<WorkChild>> childlist;
	private List<WorkChild> idata;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_gridview_work);
		ViewUtils.inject(this);
		
		expandable.setGroupIndicator(null); //默认图标不显示
		expandable.setDivider(null); //去掉分割线
		
		
		grouplist =new ArrayList<WorkGroup>();
			grouplist.add(new WorkGroup("今天", "2016年3月16日  16:05"));
			grouplist.add(new WorkGroup("星期二", "2016年3月15日  16:05"));
			grouplist.add(new WorkGroup("星期一", "2016年3月14日  16:05"));
		
		childlist = new ArrayList<List<WorkChild>>();
		idata = new ArrayList<WorkChild>();
		idata.add(new WorkChild("语文", R.drawable.aa, 
				"1.完成《在山那边》课后练习", "2.默写附录古诗《龟虽寿》",
				"3.完成《语文练习册》第三单元", "2016年3月16日  16:05"));
		idata.add(new WorkChild("语文", R.drawable.aa, 
				"1.完成《在山那边》课后练习", "2.默写附录古诗《龟虽寿》",
				"3.完成《语文练习册》第三单元", "2016年3月16日  16:05"));
		idata.add(new WorkChild("语文", R.drawable.aa, 
				"1.完成《在山那边》课后练习", "2.默写附录古诗《龟虽寿》",
				"3.完成《语文练习册》第三单元", "2016年3月16日  16:05"));
		childlist.add(idata);
		//第二组
		idata =new ArrayList<WorkChild>();
		idata.add(new WorkChild("语文", R.drawable.aa, 
				"1.完成《在山那边》课后练习", "2.默写附录古诗《龟虽寿》",
				"3.完成《语文练习册》第三单元", "2016年3月16日  16:05"));
		idata.add(new WorkChild("语文", R.drawable.aa, 
				"1.完成《在山那边》课后练习", "2.默写附录古诗《龟虽寿》",
				"3.完成《语文练习册》第三单元", "2016年3月16日  16:05"));
		idata.add(new WorkChild("语文", R.drawable.aa, 
				"1.完成《在山那边》课后练习", "2.默写附录古诗《龟虽寿》",
				"3.完成《语文练习册》第三单元", "2016年3月16日  16:05"));
		childlist.add(idata);
		
		adapter = new ExpandableListViewAdapter(getApplicationContext(), grouplist, childlist);
		expandable.setAdapter(adapter);
		
		
		expandable.setOnChildClickListener(new OnChildClickListener() {
			
			public boolean onChildClick(ExpandableListView parent, View view, int groupPosition,
					int childPosition, long id) {
				Intent intent = new Intent(workActivity.this,workdescActivity.class);
				startActivity(intent);
				return true;
			}
		});
		
	
	}
	@OnClick({R.id.home_gridview_work_backbtu})
	public void onClick(View view){
		Intent intent = new Intent(this,MainActivity.class);
		startActivity(intent);
	}

}
