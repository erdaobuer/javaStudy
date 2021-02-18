package Suanfa;

public class suanfaDemos {

	public static void main(String[] args) {

		// 用冒泡排序对数组进行排序
		{
			int[] arr = { 34, 53, 23, 52, 0, 3, 78, 99 };
			int[] resultArray = 冒泡排序(arr);
			// 遍历
			for (int item : resultArray) {
				System.out.print(item + " ");
			}
			System.out.println();
			int[] resultArray2 = 数组的高级选择排序(arr);
			// 遍历
			for (int ite: resultArray2) {
				System.out.print(ite + " ");
			}
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
}
