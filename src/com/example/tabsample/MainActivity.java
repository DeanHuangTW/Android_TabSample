package com.example.tabsample;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;

//�n��FragmentActivity
public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//���TabHost�����
		FragmentTabHost mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        //�]�wTab��������ܰϰ�A�a�JContext�BFragmentManager�BContainer ID
        mTabHost.setup(this, getSupportFragmentManager(), R.id.container);
        
        // tab1. �p�G�n�btab�[�Ϥ��ק�setIndicator(label, icon)�Ѽ�
        mTabHost.addTab(mTabHost.newTabSpec("one").setIndicator("�Ĥ@��") ,
                FirstFragment.class,
                null);
        
        // tab2
        mTabHost.addTab(mTabHost.newTabSpec("two").setIndicator("�ĤG��") ,
                SecondFragment.class,
                null);
	}

}
