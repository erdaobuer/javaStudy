package BigInteger;

import java.math.BigInteger;

public class BigIntegerDemos {

	public static void main(String[] args) {
		/* int最大值相加减超出范围结果出错 */
//		int aInt=Integer.MAX_VALUE;
//		int bInt=Integer.MAX_VALUE;
//		long cInt=aInt+bInt;
//		System.out.println(cInt);
//		
		/* long最大值相加减超出范围结果出错 */
//		long aLong=Long.MAX_VALUE;
//		long bLong=Long.MAX_VALUE;
//		long cLong=aLong+bLong;
//		System.out.println(cLong);
		
		/* int最大值相加相减运算 */
		int a =Integer.MAX_VALUE;
		System.out.println(a);
		BigInteger bi1=new BigInteger("2147483647");
		BigInteger bi2=new BigInteger("2147483647");
		//相加
		BigInteger sum=bi1.add(bi2);
		System.out.println("bi1+bi2="+sum);
		//相减
		BigInteger subtract=bi1.subtract(bi2);
		System.out.println("bi1-bi2="+subtract);
		//相乘
		BigInteger multiply=bi1.multiply(bi2);
		System.out.println("bi1*bi2="+multiply);
		//相除
		BigInteger divide=bi1.divide(bi2);
		System.out.println("bi1/bi2="+divide);
		//求摸
		BigInteger[] bis=bi1.divideAndRemainder(bi2);
		System.out.println("bi1/bi2="+bis[0]);//商
		System.out.println("bi1%bi2="+bis[1]);//余
	}

}
