package com.husq.test.reflect;

public class ClassTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foo foo1 = new Foo();
		Foo foo2 = null;
		Class c1 = Foo.class;
		
		Class c2 = foo1.getClass();
		
		System.out.println(c1==c2);
		Class c3 = null;
		try {
			c3 = Class.forName("com.husq.test.reflect.Foo");
			foo2 = (Foo)c1.newInstance();
		} catch (Exception e) {
		}
		
		System.out.println(c1==c2);
		System.out.println(c2==c3);
	}

}


class Foo{}
