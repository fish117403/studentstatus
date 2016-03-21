package com.fragment;

import java.util.ArrayList;
import java.util.List;

import com.Adapter.GridViewAdapter;
import com.entity.HomeCategory;
import com.example.studentstatus.R;
import com.example.studentstatus.informActivity;
import com.example.studentstatus.interactiveActivity;
import com.example.studentstatus.workActivity;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.utils.CreatePhoto;

import android.app.Fragment;
import android.content.Intent;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;

public class HomeFragment extends Fragment implements OnItemClickListener {
	@ViewInject(R.id.home_category)
	private GridView category;
	@ViewInject(R.id.home_userImg)
	private ImageView userIcon;

	private List<HomeCategory> list;// GridView������Դ
	private CreatePhoto photo;

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View homeFragment = inflater.inflate(R.layout.fragment_home, null);
		ViewUtils.inject(this, homeFragment);

		//Բ��ͷ����
		Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.aa);
		photo = new CreatePhoto();
		userIcon.setImageBitmap(photo.createFramedPhoto(100, 100, bitmap, 20));
		
		setGridViewdatas();
		category.setAdapter(new GridViewAdapter(getActivity(), list));
		category.setOnItemClickListener(this);
		
		

		return homeFragment;

	}

	// GridView����Դ
	private void setGridViewdatas() {
		list = new ArrayList<HomeCategory>();

		list.add(new HomeCategory(R.drawable.gridview_map, "ѧ����λ"));
		list.add(new HomeCategory(R.drawable.gridview_zuoye, "��ҵ"));
		list.add(new HomeCategory(R.drawable.gridview_chengji, "�ɼ�"));
		list.add(new HomeCategory(R.drawable.gridview_evaluate, "����"));
		list.add(new HomeCategory(R.drawable.gridview_inform, "֪ͨ"));
		list.add(new HomeCategory(R.drawable.gridview_kaoqin, "ѧ������"));
		list.add(new HomeCategory(R.drawable.gridview_interactive, "����"));
		list.add(new HomeCategory(R.drawable.gridview_fanli, "�̳Ƿ���"));
		list.add(new HomeCategory(R.drawable.gridview_more, "����"));

	}

	// girdview�ĵ���¼�
	public void onItemClick(AdapterView<?> arg0, View view, int position, long id) {
		
//		if (id==0) {
//			Intent intent = new Intent(getActivity(), informActivity.class);
//			startActivity(intent);
//		}
		if (id==1) {
			Intent intent = new Intent(getActivity(), workActivity.class);
			startActivity(intent);
		}
//		if (id==2) {
//			Intent intent = new Intent(getActivity(), informActivity.class);
//			startActivity(intent);
//		}
//		if (id==3) {
//			Intent intent = new Intent(getActivity(), informActivity.class);
//			startActivity(intent);
//		}
		//֪ͨ
		if (id==4) {
			Intent intent = new Intent(getActivity(), informActivity.class);
			startActivity(intent);
		}
//		if (id==5) {
//			Intent intent = new Intent(getActivity(), informActivity.class);
//			startActivity(intent);
//		}
		//����
		if (id==6) {
			Intent intent = new Intent(getActivity(), interactiveActivity.class);
			startActivity(intent);
		}
		
	}

}
