package javaDemo;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @ClassName: SomeGameDemos
 * @author Tate
 * @date Feb 3, 2021
 * @Description: TODO
 * @version V1.0
 *
 * 用几个小时来制定计划，可以节省几周的编程时间。
 * 在软件可以被重用前，它必须先可以被用。
 */
public class SomeGameDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		guessNum();
	}

	/**
	 * 
	 * @author Tate
	 * 给用户三次机会猜1-100之间的某个数
	 */
	static void guessNum() {
		int a = new Random().nextInt(100);// 生成一个0~100的随机数,包含0，不包含100
		a += 1;//生成一个1~100的随机数,都包含
//		int aa = -1;
//		for (int i=0;i<100000;i++) {
//			//System.out.println(i);
//			aa = (int) (Math.random() * 100);// 生成0-100的随机数，包含0，不包含100
//			if (aa == 0) {
//				System.out.println("生成的随机数是" + aa);
//				break;
//			}
//		}
		System.out.println("生成的随机数是" + a);
		Scanner scanner=null;
		int left=1;
		int right=100;
		for (int i = 0; i < 3; i++) {
			 scanner = new Scanner(System.in);
			System.out.println("请输入一个"+left+"~"+right+"的数字___你只有3次机会，这是你第" + (i + 1) + "次机会");
			int keyIn= scanner.nextInt();
			if (keyIn < a) {
				System.out.println("你输入的数字有点小。。。");
				left=keyIn;
				if (i == 2)
					System.out.println("sorry,你的次数用完了");
			} else if (keyIn > a) {
				System.out.println("你输入的数字有点大。。。");
				right=keyIn;
				if (i == 2)
					System.out.println("sorry,你的次数用完了");
			} else {
				System.out.println("恭喜你，猜对了！！！");
				break;
			}
			//scanner.close();//一旦关闭，再次唤醒没有用，必须方法重新加载才可以

		}
		scanner.close();
	}

}
