package com.husq.test.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {
	//打印类的信息，包括类的成员变量，成员方法
	public static void printClassMessage(Object obj){
		
		
		//要获取类的信息，首先要获取类的类类型
		Class c = obj.getClass();//传递的是哪个子类的对象，c就是该子类的类类型
		//获取类的名称
		System.out.println("类的名称是："+c.getName());
		
		//获取构造方法
		Constructor[] cs = c.getDeclaredConstructors();
		for(Constructor cst:cs){
			System.out.println(cst.getName()+"(");
			Class[] paramTypes = cst.getParameterTypes();
			for(Class classp:paramTypes){
				System.out.println(classp.getName());
			}
			System.out.println(")");
		}
		

		/*
		 * Method类，方法对象
		 * 一个成员方法就是一个Method对象
		 * getMethods()方法获取的是所有的public的函数，包括父类继承而来的
		 * getDeclaredMethods()获取的是所有该类自己生命的方法，不问访问权限
		 * */
		Method[] ms = c.getMethods();//c.getDeclaredMethods();
		for(int i=0;i<ms.length;i++){
			//得到返回值类型的类类型
			Class returnType = ms[i].getReturnType();
			
			//得到方法名称
			System.out.println(ms[i].getName()+"(");
			
			//获取参数类型--》得到的是参数列表的类型的类类型
			Class[] paramTypes = ms[i].getParameterTypes();
			for(Class class1:paramTypes){
				System.out.println(class1.getName()+",");
				
			}
			System.out.println(")");
		}
		
		
		/*
		 * 成员变量也是对象
		 * java.lang.reflect.Field
		 * field类封装了关于成员变量的操作
		 * getFields()方法获取的是所有的public的成员变量的信息
		 * getDeclaredFields()获取的是所有该类自己生命的变量，不问访问权限
		 * */
		//Field[] fs = c.getFields();
		Field[] fs = c.getDeclaredFields();
		for(Field field:fs){
			Class fieldType = field.getType();
			String typename = fieldType.getName();
			//得到成员变量的名称
			String fieldname = field.getName();
			System.out.println(typename+" "+fieldname);
		}
	}
}
