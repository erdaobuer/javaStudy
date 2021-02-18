package javaDemo;


public class StaticDemo {

	public static void main(String[] args) {
		Cat.variety = "中华田园猫";
		Cat cat = new Cat();
		cat.name = "小白";
		cat.run();
		//Cat.sleep();
		System.out.println("***********************************************************************");
		Dog dog = new Dog("小白","中华田园犬");
//		var name=dog.getName();
//		var variety =dog.getVariety();
		dog.setName("小黑");
		dog.setVariety("贵妇");
		dog.run();
		dog.sleep();

	}

}

class Cat {
	String name;// 猫的名字
	static String variety;// 品种

	// 非静态方法可以访问静态成员变量和静态成员方法
	public void run() {
		System.out.println(this.name + "在跑步。。。品种是："+this.variety);
		this.sleep();
	}

	// 静态
	public static void sleep() {
		System.out.println("在睡觉。。。品种是："+variety);
	}
}

class Dog {
	private String name;// 狗的名字
	private String variety;// 品种

	public Dog() {
		super();
	}

	public Dog(String name, String variety) {
		super();
		this.name = name;
		this.variety = variety;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	// 非静态
	public void run() {
		System.out.println(this.name + "在跑步。。。品种为：" + this.variety);
	}

	// 静态
	public void sleep() {
		System.out.println(name + "在睡觉。。。品种为："+this.variety);
	}
}
