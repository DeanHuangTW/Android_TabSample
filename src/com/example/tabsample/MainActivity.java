package com.example.tabsample;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;

//要用FragmentActivity
public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//獲取TabHost控制元件
		FragmentTabHost mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        //設定Tab頁面的顯示區域，帶入Context、FragmentManager、Container ID
        mTabHost.setup(this, getSupportFragmentManager(), R.id.container);
        
        // tab1. 如果要在tab加圖片修改setIndicator(label, icon)參數
        mTabHost.addTab(mTabHost.newTabSpec("one").setIndicator("第一頁") ,
                FirstFragment.class,
                null);
        
        // tab2
        mTabHost.addTab(mTabHost.newTabSpec("two").setIndicator("第二頁") ,
                SecondFragment.class,
                null);
	}

}
