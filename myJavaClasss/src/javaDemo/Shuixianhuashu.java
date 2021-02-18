package javaDemo;

/**
 * 100-999水仙花数
 * @author Tate
 *
 */
public class Shuixianhuashu {

	public static void main(String[] args) {
		System.out.println("********************for循环********************");
		/*
		 * for循环
		 */
		// 水仙花数：
		//举例：153= 1*1*1 + 5*5*5 + 3*3*3 = 1+125+27 =153
		int count=0;
		for(int i=100;i<999;i++) {
			int a=i/100;
			int b=i%100/10;
			int c=i%10;
			int sum =a*a*a+b*b*b+c*c*c;
			if(sum==i) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("100~999之间总共有"+count+"个水仙花数");
		System.out.println("********************while循环********************");
		/*
		 * while循环
		 */
		int j=1;
		while(j<=10) {
			System.out.print(j+" ");
			j++;
		}
		System.out.println();
		System.out.println("********************do while循环********************");
		/*
		 * do while循环
		 */
		int m=10;
		do {
			System.out.print(m+" ");
			m--;
		}while(m>=1);
		
		System.out.println("********************输出直角三角形********************");
		/*
		 * 		*           * * * *       * * * *           *
		 * 		* *           * * *       * * *           * *  
		 * 		* * *           * *       * *           * * *    
		 * 		* * * *           *       *           * * * *    
		 */
		
		for(int i=1;i<=4;i++) {
			for(int k=i;k>=1;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//第二种
		System.out.println();
		for(int i=1;i<=4;i++) {
			//System.out.print("i="+i);
			for(int k=i-1;k>=1;k--)
			System.out.print(" ");
			
			for(int g=i;g<=4;g++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//高级写法
		int num=5;
		for(int i=num;i>0;i--) {
			//打印空格
			for(int k=0;k<num-i;k++) {
				System.out.print("  ");
			}
			
			//打印*
			for(int q=1;q<=i;q++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//第三种
		System.out.println();
		for(int i=1;i<=4;i++) {
			//System.out.print("i="+i);
			for(int k=i-1;k>=1;k--)
			System.out.print(" ");
			
			for(int g=i;g<=4;g++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//第四种
		System.out.println();
		for(int i=1;i<=4;i++) {
			for(int g=i;g<=4;g++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//第五种
		System.out.println();
		for(int i=1;i<=4;i++) {
			
			for(int k=i-1;k<4;k++) {
				System.out.print(" ");
			}
			for(int g=i;g>=1;g--) {
				System.out.print("*");
			}
			System.out.println();
		}


	}

}
