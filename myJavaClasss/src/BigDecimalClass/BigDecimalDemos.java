package BigDecimalClass;

import java.math.BigDecimal;
import java.util.Date;


public class BigDecimalDemos {

	public static void main(String[] args) {
		/*
		 * 由于double和float在运算的时候很容易丢失精度 所以在做金钱计算的时候尽量使用BigDecimal处理
		 */
		System.out.println("2.0-1.1="+(2.0-1.1));
		BigDecimal bd1=new BigDecimal("1.0");
		BigDecimal bd2=new BigDecimal("0.3");
		System.out.println("BigDecimal计算2.2-1.1="+bd1.subtract(bd2));
//		System.out.println("BigDecimal计算1.0/0.3="+bd1.divide(bd2));//报错
		System.out.println("BigDecimal计算1.0/0.3="+1.0/0.3);
		
		
		
		
		

	}

}
