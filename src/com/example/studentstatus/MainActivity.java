package com.example.studentstatus;

import com.fragment.HomeFragment;
import com.fragment.MyFragment;
import com.fragment.ShopFragment;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnRadioGroupCheckedChange;

import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends FragmentActivity {
	@ViewInject(R.id.main_hometab)
	private RadioButton hometab;

	@ViewInject(R.id.fl)
	private FrameLayout fl;
//	@ViewInject(R.id.home_titlebtu)
	private ImageButton titlebtu;
	private DrawerLayout drawerlayout;// 定义Drawerlayout

	private FragmentManager fm;// fragment管理类

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ViewUtils.inject(this);

		fm = getFragmentManager();
		changeFragment(new HomeFragment());
		
//		titlebtu = (ImageButton) findViewById(R.id.home_titlebtu);
//		titlebtu.setOnClickListener(new View.OnClickListener() {
//			public void onClick(View arg0) {
//				drawerlayout.openDrawer(Gravity.LEFT);
//			}
//		});

	}

	@OnRadioGroupCheckedChange({ R.id.main_tabs })
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		switch (checkedId) {
		case R.id.main_hometab:
			changeFragment(new HomeFragment());
			break;
		case R.id.main_shoptab:
			changeFragment(new ShopFragment());
			break;
		case R.id.main_mytab:
			changeFragment(new MyFragment());
			break;

		default:
			break;
		}
	}

	// 切换fragment
	private void changeFragment(Fragment fragment) {

		FragmentTransaction transaction = fm.beginTransaction();
		transaction.replace(R.id.fl, fragment);
		transaction.commit();

	}

	
}
