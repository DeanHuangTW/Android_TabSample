package com.example.tabsample;

import android.os.Bundle;
import android.support.v4.app.Fragment;  //�n��v4���A���MMainActivity�|�૬����
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FirstFragment extends Fragment{
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //�ɤJTab������Fragment Layout,���F��K,���tab�ΦP�@��layout
        return inflater.inflate(R.layout.fragment_layout, container, false);
    }
	
	 @Override
     public void onActivityCreated(Bundle savedInstanceState) {
		 super.onActivityCreated(savedInstanceState);
		
		 //���oTextView����ña�Jtext�r��
		 TextView mText = (TextView) getView().findViewById(R.id.textView1);
		 mText.setText("This is tab 1");
		
     }
}
