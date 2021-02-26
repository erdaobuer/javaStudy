package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemos {

	public static void main(String[] args) {
		
		/* 数组集合 
		 * 原理：
		 * 定义一个对象数组，给初始容量，当超过最大容量时，就自动创建一个1.5倍容量的数组
		 * 将原数组复制进去，然后把原数组删除掉
		 * */
		Collection collection= collectionFun();
		
		/* 集合的遍历方法一，转换成数组 */
		Object[] objs= collection.toArray();
		for (Object obj : objs) {
			System.out.println(obj);
		}
		
		
		/* 集合的遍历方法二，迭代器 */
		Iterator iterable= collection.iterator();
		while (iterable.hasNext()) {
			System.out.println(iterable.next());
		}
		
		
		Collection coll= collectionOperation();
		System.out.println(coll);
		
		

	}
	
	public static Collection collectionFun() {
		/* add元素 */
		Collection coll =new ArrayList();
		coll.add("张三");
		coll.add("李四");
		coll.add("王五");
		coll.add("赵六");
		//System.out.println(coll);
		
		/* remove移除元素 */
		coll.remove("王五");
		//System.out.println(coll);
		
		/* clear清除元素 */
//		coll.clear();
//		System.out.println(coll);
		
		/* contains包含元素 */
		boolean isContains= coll.contains("赵六");
		//System.out.println("赵六是否存在集合中？"+isContains);
		
		/* isEmpty是否为空 */
		//System.out.println("是否为空？"+coll.isEmpty());
		
		/* size */
		//System.out.println("集合元素个数="+coll.size());
		return coll;
		
	}

	/**
	 * 集合之间的交集，并集，差集
	 * @return
	 */
	public static Collection collectionOperation() {
		
		Collection coll1 = new ArrayList();
		coll1.add(1);
		coll1.add(3);
		coll1.add(4);
		coll1.add(6);
		Collection coll2 = new ArrayList();
		coll2.add(1);
		coll2.add(2);
		coll2.add(4);
		coll2.add(5);
		
		/*将集合2合并到集合1中，合并重复*/
		//coll1.addAll(coll2);
		
		/*判断是否包含另一个集合*/
		System.out.println("coll1="+coll1);
		System.out.println("coll2="+coll2);
		boolean isContains= coll1.containsAll(coll2);
		System.out.println("coll1包含coll2中的所有元素？"+isContains);
		
		/*判断两个集合是否相等*/
		System.out.println("coll1和coll2是否相同？"+coll1.equals(coll2));
		
		/* 从集合1中删除包含所有集合2的元素 */
		//coll1.removeAll(coll2);
		
		/* 移除集合中符合条件的元素 */
		//coll1.removeIf(item->(int)item%2==0);
		
		/* 求两个集合的交集,赋值给第一个集合 */
		coll1.retainAll(coll2);
		
		
		return coll1;
		
	}
}
