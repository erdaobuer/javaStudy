package javaDemo;

public class DuoTaiDemos {

	public static void main(String[] args) {
		/*
		 * 多态必备三要素 a.继承 b.重写 c.父类引用子类对象
		 */

		// 例1
		// Animal tiger =new Tiger();
		// tiger.run();

		// 例2
		run(new Tiger());

	}

	public static void run(Animal animal) {
		animal.run();
	}

}

class Animal {
	String name = "Animal";
	int age = 13;

	public void run() {
		System.out.println("Animal is running...");
	}
	public static void sleep() {
		System.out.println("Animal is sleeping...");
	}
}

class Tiger extends Animal {
	String name = "Tiger";
	int age = 23;

	@Override
	public void run() {
		super.run();
		System.out.println("Tiger is running...");
	}
	
	public static void sleep() {
		System.out.println("Animal is sleeping...");
	}
}
