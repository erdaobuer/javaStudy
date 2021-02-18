package com.System.Scanner;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
//		System.out.println("请输入一个int类型的数字。。。");
//		Scanner scanner=new Scanner(System.in);
//		if (scanner.hasNextInt()) {//判断键盘输入的是否为int类型的数字
//			int x = scanner.nextInt();
//			System.out.println(x);
//		} else {
//			System.err.println("你输入的不是int类型的数字");
//		}
		
		System.out.println("请输入一行文字。。。");
		Scanner scanner=new Scanner(System.in);
		String x=scanner.nextLine();//遇到回车换行就结束
		System.out.println(x);

	}

}
