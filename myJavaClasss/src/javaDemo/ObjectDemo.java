package javaDemo;

public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student =new Student();
//		student.name="马云";
//		student.study();
//		student.sleep();
//		student.say();
		int a;
		String b;
//		System.out.println(a);//报错
//		System.out.println(b);//报错
		System.out.println("age="+student.age);
		System.out.println("gender="+student.gender);
		
		/*
		 * a++和++a区别一
		 */
		int x=4;
		//int y=(x++)+(++x)+(x);
		//相当于下面
		int l= x++;//l=4,x=5
		int m=++x;//m=5,x=6
		int n=x;//x=6,n=6
		int y=(l)+(m)+(n);//4+6+6
		System.out.println("y="+y);//16
		
		/*
		 * a++和++a区别二
		 */
		
		int k=4,h=6;
		System.out.println(--k>3&&h++>5);
		System.out.println("k="+k+"  h="+h);
	}
	
	

}
 class Student{
	String name;
	int age;
	char gender;
	
	
	public void study() {
		System.out.println(name+"正在学习Java。。。");
	}
	
	public void sleep() {
		System.out.println(name+"趴在桌子上睡觉。。。");
	}
	public void say() {
		System.out.println(name+"说：大家好。。。");
	}
}
