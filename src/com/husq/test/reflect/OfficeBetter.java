package com.husq.test.reflect;

public class OfficeBetter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//动态加载类，在运行时刻加载
			Class c = Class.forName(args[0]);
			//通过类类型创建该类对象
			OfficeAble oa = c.newInstance();
			oa.start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
