package ListMianShiTi;

import java.util.ArrayList;
import java.util.List;

public class ListDemos {

	public static void main(String[] args) {
//		fun1();
		fun2();

	}

	/**
	 * 去除ArrayList中重复字符串元素的方式，也就是去重
	 */
	public static void fun1() {
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("aaa");
		System.out.println("list=" + list);

		List<String> newList = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			String objString = list.get(i);
			if (!newList.contains(objString)) {
				newList.add(objString);
			}
		}

		System.out.println("newList=" + newList);

	}

	/**
	 * 去除ArrayList中重复的自定义对象元素 Contains判断：如果是字符串，比较内容；如果是引用类型，比较的是地址 new一个对象就会有一个新的地址
	 * 所有用Contains判断引用类型不正确 解决办法：因为Contains底层是使用equals方法进行判断，
	 * 所以可以在对象类中重写equals方法，判断每一个元素是否相等
	 */
	public static void fun2() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("张三", 23, "男", "北京"));
		list.add(new Student("李四", 45, "男", "上海"));
		list.add(new Student("王五", 76, "男", "天津"));
		list.add(new Student("赵六", 373, "女", "成都"));
		list.add(new Student("张三", 23, "男", "北京"));
		System.out.println("list=" + list);

		List<Student> newList = new ArrayList<Student>();
		for (int i = 0; i < list.size(); i++) {
			Student objString = list.get(i);
			if (!newList.contains(objString)) {
				newList.add(objString);
			}
		}

		System.out.println("newList=" + newList);
	}

}
