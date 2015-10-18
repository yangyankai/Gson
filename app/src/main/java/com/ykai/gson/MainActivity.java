/*
 * Copyright (c) 2015-2015 by Shanghai shootbox Information Technology Co., Ltd.
 * Create: 2015/10/8 3:56:25
 * Project: Gson
 * File: MainActivity.java
 * Class: MainActivity
 * Module: p
 * Author: yangyankai
 * Version: 1.0
 */

package com.ykai.gson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

	String str;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//		生成Json字符串

		Gson         gson = new Gson();
		List<Person> persons = new ArrayList<Person>();
		for (int i = 0; i < 10; i++) {
			Person p = new Person();
			p.setName("name" + i);
			p.setAge(i * 5);
			persons.add(p);
		}

		// 把类转化为Json
		str = gson.toJson(persons);

		str.toString();

		// 把 Json 转化为类
		//		Person person = gson.fromJson(str, Person.class);

		List<Person> ps = gson.fromJson(str, new TypeToken<List<Person>>(){}.getType());

		for(int i = 0; i < ps.size() ; i++)
		{
			Person p = ps.get(i);
			//			System.out.println(p.toString());
		}



	}

}
