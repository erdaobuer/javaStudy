package javaDemo;

public class Shuzu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] arr = {{1,2},{1,2},{1,2}};
//		int [] d=arr[1];
//		for(int i=0;i<d.length;i++)
//		System.out.println(d[i]);
//		
//		shuiChiPaiShui();
		
		int result=sheiShuoHuang();
		System.out.println(result);
		
	}

	/**
	 * 一个三位数abc小于等于500
	 * 甲：它可以被2整除3次
	 * 乙：它可以被3整除2次
	 * 丙：它可以被7整除
	 * 丁：它的个十百数字之和=15
	 * 判断谁说谎？
	 * 计算2a+b+c=？
	 */
	private static int sheiShuoHuang() {
		int result=0;
		for(int i=100;i<=500;i++) {
			int a=i/100,b=i%100/10,c=i%10;//百位，十位，个位
			int jia=i%8;
			int yi=i%9;
			int bing=i%7;
			int ding=a+b+c;
			
			
			if(yi==0 && bing==0 && ding==15) {
				System.out.println("甲说谎。。。");
				result=2*a+b-c;
			}else if(jia==0 && bing==0 && ding==15) {
				System.out.println("乙说谎。。。");
				result=2*a+b-c;
			}else if(jia==0 && yi==0 && ding==15) {
				System.out.println("丙说谎。。。");
				result=2*a+b-c;
			}else if(jia==0 && yi==0 && bing==0) {
				System.out.println("丁说谎。。。");
				result=2*a+b-c;
			}
			
		}
		return result;
	}
	
	/**
	 * a水池有154吨水，b水池有82吨水，两水池每小时都排2吨水，多少小时后，a是b的四倍？
	 */
	private static void shuiChiPaiShui() {
		
		int a=154,b=82;
		int count=1;
		while(true){
			a-=2;
			b-=2;
			if(a==b*4) break;
			count++;
		}
		
		System.out.println(count);
	}

}
