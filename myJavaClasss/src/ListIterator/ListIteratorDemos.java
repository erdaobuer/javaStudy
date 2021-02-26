package ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemos {

	public static void main(String[] args) {

		/*
		 * 遍历集合，如果有c这个元素，就在c后面添加一个tate的元素 如何需要一边遍历，一边修改集合，就需要用到ListIterator迭代器
		 */

		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		//System.out.println(list);
		// 遍历元素
//		for (int i = 0; i < list.size(); i++) {
//			String str = list.get(i);
//			if (str=="c") {
//				list.add("tate");
//			}
//		}
//		
//		System.out.println(list);

		ListIterator<String> mIterator = list.listIterator();
		while (mIterator.hasNext()) {
			if(mIterator.hasPrevious()) {
				String item = mIterator.next();
				if (item.equals("c")) {
					mIterator.add("tate");
				}
			}else {//开头添加
				mIterator.add("start");
			}
		}
		//此时游标在末尾
		while(mIterator.hasPrevious()) {
			String str= mIterator.previous();
			System.out.println(str);
		}
		//System.out.println(list);
	}

}
