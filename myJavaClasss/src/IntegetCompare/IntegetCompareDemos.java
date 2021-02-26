package IntegetCompare;

public class IntegetCompareDemos {

	public static void main(String[] args) {

		/*
		 * 在-128~127的Integer值并且以Integer x = value; 的方式赋值的Integer值在进行==和equals比较时，
		 * 都会返回true，因为Java里面对处在在-128127之间的Integer值， 用的是原生数据类型int，会在内存里供重用，
		 * 也就是说这之间的Integer值进行==比较时只是进行int原生数据类型的数值比较
		 */
		Integer a = 127;
		Integer b = 127;
		System.out.println("a==b:" + (a == b));// true
		System.out.println("a.query(b):" + a.equals(b));// true

		
		/*而超出-128~127的范围，进行==比较时是进行地址及数值比较。*/
		Integer c = 128;
		Integer d = 128;
		System.out.println("c==d:" + (c == d));// false
		System.out.println("c.query(d):" + c.equals(d));// true

	}

}
