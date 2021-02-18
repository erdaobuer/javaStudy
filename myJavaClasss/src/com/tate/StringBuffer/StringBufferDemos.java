package com.tate.StringBuffer;

import java.util.Scanner;

public class StringBufferDemos {

	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer();//默认长度16
		StringBuffer sb1 =new StringBuffer(23);//定义长度23
//		System.out.println(sb.capacity());//StringBuffer 默认长度
//		System.out.println(sb.length());//StringBuffer 默认长度
//		sb.append("abcdefghijklmnopq");
//		System.out.println(sb.capacity());//默认16+17=34
//		System.out.println(sb.length());
		sb.append("abcdef");
		sb.insert(2, "def");//插入
		System.out.println(sb.toString());//在某个位置插入字符串
		sb.deleteCharAt(2);//删除
		System.out.println(sb.toString());
		sb.delete(2, 4);//包含下标，不包含上标
		System.out.println(sb.toString());
		sb.replace(0, 2, "zz");//替换，包含下标，不包含上标
		System.out.println(sb.toString());
		sb.reverse();//反转
		System.out.println(sb.toString());
		String subString =sb.substring(4);
		System.out.println("subString="+subString);
		String subString2 =sb.substring(4,5);
		System.out.println("subString2="+subString2);
		CharSequence cSequence= sb.subSequence(4, 6);//截取，包含下标，不包含上标
		System.out.println("cSequence="+cSequence.toString());
		
		String string="jjj";
		StringBuffer sb2 =new StringBuffer(string);
		System.out.println("sb2="+sb2);
		String string2 =new String(sb2);
		System.out.println("string2="+string2);
		
		//字符串反转
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入要反转的字符串：");
		String inString= scanner.nextLine();
		System.out.println("字符串反转后为"+reverseString(inString));

	}
	
	public static String reverseString(String s) {
		StringBuffer sBuffer =new StringBuffer(s);
		sBuffer.reverse();
		return sBuffer.toString();
	}

}
