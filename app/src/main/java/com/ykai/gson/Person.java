/*
 * Copyright (c) 2015-2015 by Shanghai shootbox Information Technology Co., Ltd.
 * Create: 2015/10/8 3:47:23
 * Project: Gson
 * File: Person.java
 * Class: Person
 * Module: app
 * Author: yangyankai
 * Version: 1.0
 */

package com.ykai.gson;

/**
 * Created by yangyankai on 2015/10/8.
 */

public class Person {

	private String name;
	private int age;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString()
	{
		return name + ":" +age;
	}
}
