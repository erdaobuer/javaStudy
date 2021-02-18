package javaDemo;

public class InterfaceDemo {

	public static void main(String[] args) {
//		AnimalI animal = null;// 接口可以用来声明一个变量，成为一个空指针
//		animal = new CatAnimal();
//		animal.run();
//		animal.sleep();
//		CatAnimal cat =(CatAnimal)animal;
//		cat.catchMouse();
//		AnimalI.eat();
		CatI cat =new CatAnimal();
		cat.run();
		cat.sleep();
		cat.catchMouse();
		AnimalI.eat();
	}

}

/**
 * 
 *
 * @Description: Animal接口
 * @ClassName: AnimalI
 * @author Tate
 * @date Feb 5, 2021
 * @version V1.0
 *
 *          用几个小时来制定计划，可以节省几周的编程时间。 在软件可以被重用前，它必须先可以被用。
 */
interface AnimalI {
	// 接口不能成员变量，除非static和final
	public static final String name = "";
	void run();
	void sleep();
	static void eat() {
		System.out.println("我是接口中的static Method");
	}
}

/* 接口可以被接口继承 */
interface CatI extends AnimalI{
	void catchMouse();
}
class CatAnimal implements AnimalI,CatI {

	@Override
	public void run() {
		System.out.println("猫在跑步。。。");

	}

	@Override
	public void sleep() {
		System.out.println("猫在睡觉。。。");

	}

	@Override
	public void catchMouse() {
		System.out.println("猫抓老鼠。。。");
		
	}

}
