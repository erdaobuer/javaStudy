package javaDemo;

public class SuperDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



/*
 * 
 * 父類只有一個有參構造方法，子類沒有構造方法報錯，怎麽處理？
 * 
 */


class Person1 {
	String name;
	int age;

	// 方法3
	public Person1() {
	}

	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

//	Person1(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
}

class Student1 extends Person1 {
	// 方法1
//	public Student1() {
//		super("小王", 12);
//	}
	// 方法2
//	public Student1(String name,int age) {
//		super(name, age);
//	}

}