package javaDemo;

public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmallStudent student = new SmallStudent("dsas",232);
//		student.name = "aa";
//		student.age = 23;
		student.say();
	}

}

class Person {
	String name;
	int age;
	int money;
	{
		System.out.println("父类的构造方法块。。。");
	}
	public Person() {
		this("小李", 12);
		this.money=1000;
		System.out.println("父亲无参构造。。。。");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("父亲有参构造。。。。");
	}

	public void sing() {
		System.out.println("父亲在唱歌。。。。");
	}
}


//子类中有参无参的构造方法默认都会调用父类的无参构造方法
class SmallStudent extends Person {
	String name;
	int age;
	{
		System.out.println("子类的构造方法块。。。");
	}
	public SmallStudent() {
		//super();//系统默认会添加
	}
	public SmallStudent(String name,int age) {
		//super();//系统默认会添加
		this.name=name;
		this.age=age;
	}

	public void say() {
		// super指明使用父类的成员属性
		System.out.println("我是" + super.name + ",我今年" + super.age + " 岁了");
		super.sing();
		// 调用自己的方法
		this.sing();
	}

	public void sing() {
		System.out.println("儿子在唱歌。。。"+money);
	}
	
}