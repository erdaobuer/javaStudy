package Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemos {

	public static void main(String[] args) {
		
		
		/* Vector是同步的，加锁的，所以性能比较低 */
		Vector<String> vector = new Vector<String>();
		vector.addElement("aa");
		vector.addElement("bb");
		vector.addElement("cc");
		vector.addElement("dd");
		
		//根据索引取元素
		//System.out.println(vector.elementAt(2));//cc
		
		//遍历Vector集合方法一
//		Enumeration<String> enumeration = vector.elements();
//		while(enumeration.hasMoreElements()) {
//			String obj = enumeration.nextElement();
//			System.out.println(obj);
//		}
		
		//遍历Vector集合方法二迭代器
		
		ListIterator<String> mIterator = vector.listIterator();
		while(mIterator.hasNext()) {
			System.out.println(mIterator.next());
		}

	}

}
