package com.fragment;

import com.example.studentstatus.R;
import com.example.studentstatus.interbookActivity;
import com.example.studentstatus.myadviceActivity;
import com.example.studentstatus.myorderActivity;
import com.example.studentstatus.myselfActivity;
import com.example.studentstatus.mysettingActivity;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;
import com.utils.CreatePhoto;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MyFragment extends Fragment {
	@ViewInject(R.id.my_userImg)
	private ImageView userIcon;

	private CreatePhoto photo;

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View myFragment = inflater.inflate(R.layout.fragment_my, null);
		ViewUtils.inject(this, myFragment);

		Bitmap bitmap = BitmapFactory.decodeResource(getResources(),
				R.drawable.aa);
		photo = new CreatePhoto();
		userIcon.setImageBitmap(photo.createFramedPhoto(100, 100, bitmap, 20));

		return myFragment;
	}

	@OnClick({ R.id.mysetting_tv, R.id.mymyself_tv ,R.id.myadvice_tv,R.id.myinterbook_tv,R.id.myorder_tv})
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.mysetting_tv:
			Intent intent = new Intent(getActivity(),mysettingActivity.class);
			startActivity(intent);
			break;
		case R.id.mymyself_tv:
			startActivity(new Intent(getActivity(),myselfActivity.class));
			break;
		case R.id.myadvice_tv:
			startActivity(new Intent(getActivity(),myadviceActivity.class));
			break;
		case R.id.myinterbook_tv:
			startActivity(new Intent(getActivity(),interbookActivity.class));
			break;
		case R.id.myorder_tv:
			startActivity(new Intent(getActivity(),myorderActivity.class));
			break;
		default:
			break;
		}
	}

}
