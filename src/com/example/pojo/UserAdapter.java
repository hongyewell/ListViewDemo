package com.example.pojo;

import java.util.List;

import com.example.listviewtest.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class UserAdapter extends ArrayAdapter<User>{
	private int resourceId;

	public UserAdapter(Context context, int textViewResourceId, List<User> objects) {
		super(context, textViewResourceId, objects);
		resourceId = textViewResourceId;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		User user = getItem(position);
		View view = LayoutInflater.from(getContext()).inflate(resourceId, null);
		ImageView userImageView = (ImageView) view.findViewById(R.id.user_image);
		TextView userName = (TextView) view.findViewById(R.id.user_name);
		userImageView.setImageResource(user.getImageId());
		userName.setText(user.getName());
		return view;
	
	}

	
	

}
