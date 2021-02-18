package Anonymity;

/**
 * 
 *
 * @Description: 匿名类练习
 * @ClassName: AnonymityDemo
 * @author Tate
 * @date Feb 8, 2021
 * @version V1.0
 *
 * 用几个小时来制定计划，可以节省几周的编程时间。
 * 在软件可以被重用前，它必须先可以被用。
 */
public class AnonymityDemo {

	public static void main(String[] args) {
		// 抽象类匿名类,其实是一个继承了该抽象类或者实现了该接口的一个子类匿名对象
		Animal animal = new Animal() {
			@Override
			void eat() {
				System.out.println("猫在吃。。。");
				super.eat();
			}
			@Override
			void sleep() {
				System.out.println("猫在睡觉。。。");
			}
		};
		animal.eat();
		animal.sleep();
		
//		//接口匿名类
		Person person =new Person() {
			
			@Override
			public void speak() {
				System.out.println("我是妞妞。。。");
				
			}
			
			@Override
			public void cry() {
				System.out.println("我爱哭泣。。。");
				
			}
		};
		
		person.speak();
		person.cry();
		/*
		 * 接口匿名类只有一个方法的时候可以用这种方法
		 * new Person() {
		 * 
		 * @Override public void speak() { System.out.println("我是妞妞。。。");
		 * 
		 * }
		 * 
		 * @Override public void cry() { System.out.println("我爱哭泣。。。");
		 * 
		 * } }.cry();
		 */
	}

}


abstract class Animal{
	void eat() {
	}
	void sleep() {
	}
}

interface Person{
	void speak();
	void cry();
}