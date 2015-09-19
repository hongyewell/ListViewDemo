package com.example.listviewtest;
import java.util.ArrayList;
import java.util.List;

import com.example.pojo.User;
import com.example.pojo.UserAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


public class MainActivity extends Activity {
	private List<User> userList = new ArrayList<User>();
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUsers();//初始化人口数据
        UserAdapter adapter = new UserAdapter(MainActivity.this,R.layout.user_item,userList);
       
        ListView listView = (ListView) findViewById(R.id.list_view);
       listView.setAdapter(adapter);
        
    }

	private void initUsers() {
		User hongyeUser = new User("hongye", R.drawable.avril);
		userList.add(hongyeUser);
		User yingmiUser = new User("Geek_ymv", R.drawable.ym);
		userList.add(yingmiUser);
		User yeyeUser = new User("android", R.drawable.why);
		userList.add(yeyeUser);
		User miyingUser = new User("dog", R.drawable.yyy);
		userList.add(miyingUser);
		
	}


    
}
