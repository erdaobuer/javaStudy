package InterfaceDemo;

public class InterfaceDemos {

	public static void main(String[] args) {
//		Animal animal = new Cat();
//		animal.name = "貓";// 这个name修改的是Cat的成员变量name
//		animal.variety = "波斯";// 这个variety修改的是Cat的成员变量variety
//		animal.eat();// 编译左，运行右
//		animal.sleep();// 编译左，运行右
//		Cat cat =(Cat) animal;
//		System.out.println(cat.name);//出错了，null
//		cat.jump();//出错了，null
		
		Cat cat =new Cat();
		cat.name="猫";
		cat.variety="波斯";
		cat.eat();
		cat.sleep();
		cat.jump();

	}

}

/* 不是共性用接口 */
interface JumpInterface {
	void jump();

}


/* 共性用抽象类 */
abstract class Animal {
	String name;
	String variety;

	abstract void eat();

	abstract void sleep();
}

class Cat extends Animal implements JumpInterface {
	String name;
	String variety;

	@Override
	void eat() {
		System.out.println(variety + name + "在吃饭");

	}

	@Override
	void sleep() {
		System.out.println(variety + name + "在睡觉");

	}

	@Override
	public void jump() {
		System.out.println(variety + name + "跳火圈");

	}

}