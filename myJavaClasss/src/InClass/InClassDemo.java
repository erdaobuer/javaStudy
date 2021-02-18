package InClass;

import InClass.Outer.Inner;

public class InClassDemo {

	public static void main(String[] args) {
		//内部类的访问调用
//		Outer.Inner inner=new Outer().new Inner();
//		inner.test();
//		
//		 Outer.Inner inner2=new Outer.Inner();
//		 inner2.test();
//		 
//		 inner2.aaa();
		
		Outer.Inner inner = new Outer().new Inner();
		inner.show();
		
		
		 
	}

}


//外部类
class Outer{
	public int num=10;
	class Inner{
		public int num=20;
		public void show() {
			class A{
				void AAA() {
					System.out.println("AAA");
				}
			}
			A aaA = new A();
			aaA.AAA();
			int num=30;
			System.out.println(num);//30
			System.out.println(this.num);//20
			System.out.println(Outer.this.num);//10
		}
	}
	
//	static int a=12;
//	//内部类：类的内部声明一个类
//	static class Inner{
//		void test() {
//			System.out.println("a="+a);
//		}
//		static void aaa() {
//			System.out.println("aaa静态方法");
//		}
//	}
}