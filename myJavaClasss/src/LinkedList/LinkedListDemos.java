package LinkedList;

import java.util.LinkedList;

public class LinkedListDemos {
	/* 其实LinkedList本身就已经提供了栈的功能，push入栈， pop出栈 */
	public static void main(String[] args) {
		// fun1();//模拟入栈出栈
		fun2();// LinkedList自带的栈功能

	}

	/**
	 * LinkedList模拟栈
	 */
	public static void fun1() {
		LinkedList<String> list = new LinkedList<String>();
		// 进栈
		in(list, "a");
		in(list, "b");
		in(list, "c");
		in(list, "d");
		System.out.println("入栈后集合=" + list);
		// 出栈
		String outString = out(list);
		System.out.println("出栈的元素是:" + outString);
		System.out.println("出栈后集合=" + list);
	}

	
	/**
	 * LinkedList自带的栈功能
	 */
	public static void fun2() {
		LinkedList<String> stack = new LinkedList<>();
		stack.push("aa");
		stack.push("bb");
		stack.push("cc");
		stack.push("dd");
		System.out.println("入栈后集合=" + stack);
		String str =stack.pop();
		System.out.println("出栈的元素是："+str);
		System.out.println("出栈后集合="+stack);
		
	}

	/**
	 * 进栈
	 * 
	 * @param list
	 * @param str
	 */
	public static void in(LinkedList<String> list, String str) {
		list.addFirst(str);
	}

	/**
	 * 出栈
	 * 
	 * @param list
	 * @param str
	 */
	public static String out(LinkedList<String> list) {
		return list.removeFirst();
	}

}
