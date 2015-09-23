package com.example.tabsample;

import android.os.Bundle;
import android.support.v4.app.Fragment;  //要用v4的，不然MainActivity會轉型失敗
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FirstFragment extends Fragment{
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //導入Tab分頁的Fragment Layout,為了方便,兩個tab用同一個layout
        return inflater.inflate(R.layout.fragment_layout, container, false);
    }
	
	 @Override
     public void onActivityCreated(Bundle savedInstanceState) {
		 super.onActivityCreated(savedInstanceState);
		
		 //取得TextView元件並帶入text字串
		 TextView mText = (TextView) getView().findViewById(R.id.textView1);
		 mText.setText("This is tab 1");
		
     }
}
