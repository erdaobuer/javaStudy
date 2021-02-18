package javaDemo;

public class AbstractDemo2 {
	public static void main(String[] args) {

//		//子类没有构造方法，默认会调用父类的构造方法
//		Employee employee = new Programmer();
		// 子类没有有参构造方法，不会调用父类有参构造方法，编译报错
		Employee employee = new Programmer("张三", 35, 3000.00d);
		employee.say();
		System.err.println(employee.name + " " + employee.age + " " + employee.salary);
	}

}

abstract class Employee {
	String name;
	int age;
	double salary;

	abstract void say();

	public Employee() {
		super();

	}

	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		System.out.println("父亲");
	}

}

class Programmer extends Employee {
	public Programmer(String string, int i, double d) {
		// TODO Auto-generated constructor stub
		super(string, i, d);
	}

	@Override
	void say() {
		System.out.println("我是" + name);
		System.out.println("我" + age);
		System.out.println("我的工资是" + salary);

	}

}
