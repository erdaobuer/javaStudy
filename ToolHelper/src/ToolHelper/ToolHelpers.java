package ToolHelper;

/**
 * 
 * @ClassName: ToolHelpers
 * @author Tate
 * @date Feb 2, 2021
 * @Description: TODO
 * @version V1.0
 *
 * 用几个小时来制定计划，可以节省几周的编程时间。
 * 在软件可以被重用前，它必须先可以被用。
 */
public class ToolHelpers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		//int max =GetMaxNum(arr);
		//float[] arr1= {1f,4999f,44f,743f};
		//float max1 =GetMaxNum(arr1);
		//System.out.println("arr中的最大数为："+max);
		System.out.println("arr反转：");
		arr =reverse(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	/**
	 * 获取int数组最大值
	 * @param arr
	 * @return
	 */
	public static int GetMaxNum(int[] arr) {
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			temp=arr[i]>temp?arr[i]:temp;
		}
		return temp;
		
	}
	
	/**
	 * 获取float数组最大值
	 * @param arr
	 * @return
	 */
	public static float GetMaxNum(float[] arr) {
		float temp = 0;
		for(int i=0;i<arr.length;i++) {
			temp=arr[i]>temp?arr[i]:temp;
		}
		return temp;
		
	}
	/**
	 * 数组反转
	 * @param arr 数组参数
	 * @return 反转后的数组
	 */
	//  数组 123 4 567
	//  下标 012 3 456
	public static int[] reverse(int[] arr) {
		for(int i=0;i<arr.length/2;i++) {
			int temp;
			int left=i;
			int right=arr.length-i-1;
			
			//方法一
//			temp=arr[left];
//			arr[left]=arr[right];
//			arr[right]=temp;
			
			//方法二
			arr[left]=arr[left]^arr[right];
			arr[right]=arr[left]^arr[right];
			arr[left]=arr[left]^arr[right];
		}
		return arr;
		
	}
	
	
	

}

