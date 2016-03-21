package com.example.studentstatus;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.Adapter.interbookAdapter;
import com.entity.InterBook;
import com.example.studentstatus.R.drawable;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;
import com.utils.CreatePhoto;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

public class interbookActivity extends Activity {
	@ViewInject(R.id.home_gridview_interbook_backbtu)
	private ImageButton imagebtu;
	
	@ViewInject(R.id.home_gridview_interbook_list)
	private ListView lv;
	private List<InterBook>list;//������Դ�ļ���
	
	private CreatePhoto photo;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_gridview_interbook);
		ViewUtils.inject(this);
		
		setDatas();
		
		interbookAdapter adapter = new interbookAdapter(list, getApplication());
		lv.setAdapter(adapter);
		
	}
	@OnClick({R.id.home_gridview_interbook_backbtu})
	public void onClick(View view){
		Intent intent = new Intent(this,interactiveActivity.class);
		startActivity(intent);
		finish();
	}
	
	// ��ȡ����
	private void setDatas() {
		list = new ArrayList<InterBook>();
		
		InterBook book1= new InterBook("A", R.drawable.girl , "��ѽѽ");
		InterBook book2= new InterBook("B", R.drawable.girl, "����");
		InterBook book3= new InterBook("C", R.drawable.girl, "����");
		InterBook book4= new InterBook("D", R.drawable.girl, "����");
		InterBook book5= new InterBook("E", R.drawable.girl, "���");
		InterBook book6= new InterBook("F", R.drawable.girl, "���");
		list.add(book1);
		list.add(book2);
		list.add(book3);
		list.add(book4);
		list.add(book5);
		list.add(book6);
		
	}
	
	

}
