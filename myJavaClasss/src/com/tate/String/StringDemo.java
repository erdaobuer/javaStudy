package com.tate.String;

public class StringDemo {

	public static void main(String[] args) {
		byte[] bytes = { 97, 98, 99, 100, 101 };// byte最大127
		char[] chars = {'a','b','c','d'};
		String s1 = new String(bytes);
		String s2=new String(bytes, 1, 4);
		String s3=new String(chars, 1, 2);
		System.out.println("s1=" + s1);
		System.out.println("s2=" + s2);
		System.out.println("s3=" + s3);
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		String a1=new String("abc");
		String a2="abc";
		System.out.println(a1==a2);  //false
		System.out.println(a1.equals(a2));  //true
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		String m1="a"+"b"+"c";//编译的时候已经是abc了
		String m2="abc";
		System.out.println(m1==m2);
		System.out.println(m1.equals(m2));

		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		String n1="ab"+"c";//编译的时候已经是abc了
		String n2="Abc";
		String n3="A";
		System.out.println(n1==n2);//false
		System.out.println(n1.equals(n2));//false
		System.out.println(n1.equalsIgnoreCase(n2));//true  忽略大小写
		System.out.println("n2是否包含n3？  "+n2.contains(n3));//包含
		System.out.println("n2是否以A开始？  "+n2.startsWith(n3));//以xxx开始
		System.out.println("n2是否以c结尾？  "+n2.endsWith("c"));//以xxx结尾
		System.out.println("n2是否为空？  "+n2.isEmpty());//字符串是否为空
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		String userId=null;
		String pwd="123";
		//判断id和pwd是否正确，避免字符串为null,无法调用equals方法
		if ("admin".equals(userId)&&"123".equals(pwd)) {
			System.out.println("登陆成功。。。");
		}else {
			System.out.println("账号或密码错误，请重新输入。。。");
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		String d="abcdefgcdsjjcd";
		char c =d.charAt(1);
		System.out.println(c);
		System.out.println(d.indexOf("cd"));//cd在字符串中的位置
		System.out.println(d.indexOf("cd",3));//从下标为3的位置开始找cd，如果没有，返回-1；如果有，返回第一个的下标
		System.out.println(d.lastIndexOf('c'));//c在字符串中最后出现的位置
		System.out.println(d.substring(2));//截取字符串， 从下表为2的位置开始截取
		System.out.println(d.substring(2,5));//截取字符串， 从下表为2的位置开始,下标为5的位置结束截取
	}

}
