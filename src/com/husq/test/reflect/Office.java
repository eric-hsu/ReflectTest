package com.husq.test.reflect;

public class Office {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//new 创建的对象是静态加载类，在编译时就需要加载所有的可能使用到的类，当该类不存在时，编译异常，当想使用Word但是不使用Excel的时候就不是我们想要的
		//解决办法：使用动态加载解决该问题
		if("Word".equals(args[0])){
			Word word = new Word();
			word.start();
		}
		
		if("Excel".equals(args[0])){
			Excel excel = new Excel();
			excel.start();
		}

	}

}
