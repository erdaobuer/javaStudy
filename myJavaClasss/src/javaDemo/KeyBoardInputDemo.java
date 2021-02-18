package javaDemo;
import java.util.Scanner;

/**
 * 
 * @author Tate
 * 注意：java文件不能取中文名字作为路径
 */
public class KeyBoardInputDemo {

	public static void main(String[] args) {
		try {
			//录入键盘输入
//			Scanner scan =new Scanner(System.in);
//			System.out.print("请输入第一个数：");
//			int first = scan.nextInt();
//			System.out.print("请输入第一个数：");
//			int second = scan.nextInt();
//			System.out.println("两数之和为："+(first+second));
//			System.out.println("两数之差为："+(first-second));
//			System.out.println("两数之积为："+(first*second));
//			System.out.println("两数之商为："+(first/second));
			System.out.println("********************获取两个数字最大值********************");
			Scanner scan =new Scanner(System.in);
			System.out.print("请输入第一个数：");
			int first = scan.nextInt();
			System.out.print("请输入第一个数：");
			int second = scan.nextInt();
			if(first==second) 
			{
				System.out.println("两个数相等，请重新输入！！！"); 
				System.out.print("请重新输入第一个数：");
				first = scan.nextInt();
				System.out.print("请重新输入第一个数：");
				second = scan.nextInt();
			}
		
			System.out.println("两数较大的为："+(first>second?first:second));
			System.out.println("两数较小的为："+(first<second?first:second));
			//关闭Scanner 
			scan.close();
		
		}catch(Exception ex) {
			throw ex;
		}
		
	}

}
