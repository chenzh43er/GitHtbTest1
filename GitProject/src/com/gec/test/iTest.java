package com.gec.test;

public interface iTest {
	int save();
	void add();
	int delete();
	
	//添加select注释
	int select();
	
	/*
	 * 添加一个张三的方法
	 */
	int zhangsan1();
	
	//在主方法中添加一个方法
	int master_Method();
	
	//在分支中添加一个方法
	int test_brank();
	
	//李四在11:36提交了新的方法
	int lisi_1136();

	//张三在11:35中提交了一个新的方法
	int zhangsan2_1135();

}
