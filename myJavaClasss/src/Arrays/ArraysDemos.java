package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysDemos {

	public static void main(String[] args) {
		Integer[] arr = {1,4,6,7,2,0,45};
		System.out.println("原始顺序："+Arrays.toString(arr));//原始顺序
		Arrays.sort(arr,Collections.reverseOrder());//降序排列方法一
		//Arrays.sort(arr,new MyComparator());//降序排列方法二
		System.out.println("降序排列："+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("升序排列："+Arrays.toString(arr));
		int index= Arrays.binarySearch(arr, 2);
		System.out.println("2在arr数组中的索引为："+index);
		
		int a=12;
		Integer integer=a;
		System.out.println(integer.compareTo(11));
	}

	
	
}

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;
	}
	
}