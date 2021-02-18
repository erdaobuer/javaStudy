package javaDemo;

import org.graalvm.compiler.core.common.alloc.SingleBlockTraceBuilder;

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		a=4;
		System.out.println("a="+a);
		final int b;
		b=45;
		System.out.println("b="+b);
		b=34;//final修饰的变量就成了常量，只能赋值一次
		
		Father f=new Father("aaa",34);
		f=new Father("bbb",24);
		final Father ff=new Father("aaa",34);
		ff=new Father("bbb",24);//finale修饰的引用类型变量不能改变其地址
		
		
	}

}

final class Father{
	
	public final void doSomeThing(){//final修饰的方法不能被Override
	}
	
	public Father(String a,int b) {
		
	}
}

//被finnal修飾后的類不能被繼承
//class Son extends Father{
//	
//}