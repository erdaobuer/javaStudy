package javaDemo;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		System.out.println(10+10);
		System.out.println(10/2);
		System.out.println(10/2.5d);
		System.out.println(getType(10.4f/2));
		System.out.println(4<5&4>3);
		System.out.println(4>5|4>6);
		//逻辑异或
		System.out.println(4>5^4>6);//相同false,不同true
		System.out.println(4>5^4>3);
		System.out.println("______________________");
		int a=1;
		int b=5;
		System.out.print("a="+a);
		System.out.println(" b="+b);
		a=a^b;//a=1^5
		b=a^b;//b=1^5^5,此时b=1
		a=a^b;//a=1^5^1,此时a=5
		System.out.print("a="+a);
		System.out.println(" b="+b);
		System.out.println(2*8);
		System.out.println("______________________");
		System.out.println("5^0="+(5<<0));
		System.out.println("5^1="+(5<<1));
		System.out.println("5^2="+(5<<2));
		System.out.println("5^3="+(5<<3));
		System.out.println("5^4="+(5<<4));
		System.out.println("______________________");
//		System.out.println("______________________");
//		System.out.println(a++>1&&b++>4);
//		System.out.println("a="+a+"  b="+b);//b没有自增
//		System.out.println(a++==1&&b++>4);
//		System.out.println("a="+a+"  b="+b);//b自增
//		System.out.println(a++==1||b++>4);
//		System.out.println("a="+a+"  b="+b);//b没有自增
//		System.out.println(a++>1||b++>4);
//		System.out.println("a="+a+"  b="+b);//b自增
//		System.out.println("______________________");
//		System.out.println(5&6);
//		System.out.println(5|6);
//		System.out.println(5^6);
//		System.out.println(~6);
//		System.out.println(2<<2);
//		System.out.println(2>>2);
//		System.out.println(8>>>2);
//		System.out.println(-8>>>2);
	
		
	}
	
	/**
	 * 
	 * @param o 要获取类型的数据
	 * @return 返回数据的类型
	 */
	public static String getType(Object o) {
		return o.getClass().toString();
	}

}
