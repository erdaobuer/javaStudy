package Suanfa;

import java.util.Arrays;

public class suanfaDemos {

	public static void main(String[] args) {

		// 用冒泡排序对数组进行排序
		{
			int[] arr = { 34, 53, 23, 52, 0, 3, 78, 99 };
//			int[] resultArray = 冒泡排序(arr);
//			// 遍历
//			for (int item : resultArray) {
//				System.out.print(item + " ");
//			}
//			System.out.println();
//			int[] resultArray2 = 数组的高级选择排序(arr);
//			// 遍历
//			for (int ite: resultArray2) {
//				System.out.print(ite + " ");
//			}
			int num = 34;
			Arrays.sort(arr);// 数组排序
			System.out.println(Arrays.toString(arr));// 数组以字符串格式输出
			System.out.println(num + "在数组中的的索引是：" + 数组的二分查找(arr, num));
		}
	}

	/**
	 * 
	 * @author Tate
	 * @Description: 轻的上浮，重的下降。相邻两个比较，前面>后面，就换位置
	 */
	public static int[] 冒泡排序(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				int left = j;
				int right = j + 1;
				if (arr[left] > arr[right]) {// 互换位置
					arr[left] = arr[left] ^ arr[right];
					arr[right] = arr[left] ^ arr[right];
					arr[left] = arr[left] ^ arr[right];
				}
			}
		}
		return arr;
	}

	/**
	 * 
	 * @author Tate
	 * @param arr 要排序的数组
	 * @return
	 * @Description: 用每个数去跟后面的所有的数比较，如果大，就互换位置
	 */
	public static int[] 数组的高级选择排序(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i; j < arr.length - 1; j++) {
				if (arr[i] > arr[j]) {// 互换位置
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}

	/**
	 * 注意：二分查找的数组必须是有序的
	 * 
	 * @Description:二分查找，也叫折半查找，
	 * @param 要排序的数组
	 * @return 找寻的数字在数组中的下标
	 */
	public static int 数组的二分查找(int[] arr, int num) {
		// int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int min = 0, max = arr.length - 1, mid = (min + max) / 2;
		int index = -1;// 如果没有变，就表示没找到

		/** 一种写法 */
//		while (true) {
//			if (arr[mid] == num) {// 找到了
//				index = mid;
//				break;
//			}
//			if (arr[mid] > num) {// num在左边
//				max = mid - 1;
//			}
//			if (arr[mid] < num) {// num在右边
//				min = mid + 1;
//			}
//				mid = (min + max) / 2;
//			if (min > max) {//没找到，跳出循环
//				break;
//			}
//		}
		while (num != arr[mid]) {
			if (arr[mid] > num) {// num在左边
				max = mid - 1;

			}
			if (arr[mid] < num) {// num在右边
				min = mid + 1;
			}
			mid = (min + max) / 2;
			if (min > max) {// 没找到，跳出循环
				break;
			}
		}
//		return index;
		return mid;
	}
}
