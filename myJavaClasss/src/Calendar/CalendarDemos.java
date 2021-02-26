package Calendar;

import java.util.Calendar;

public class CalendarDemos {

	public static void main(String[] args) {
		/*Calendar是一个抽象类*/
		//Calendar calendar =new GregorianCalendar();//公历
		Calendar calendar =Calendar.getInstance();//和上面一行代码等同
		System.out.println(calendar);
		System.out.println("年："+calendar.get(Calendar.YEAR));
		System.out.println("月："+(calendar.get(Calendar.MONTH)+1));//月份+1，因为0代表1月
		System.out.println("日："+calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("小时："+calendar.get(Calendar.HOUR));
		System.out.println("分钟："+calendar.get(Calendar.MINUTE));
		System.out.println("秒："+calendar.get(Calendar.SECOND));
		System.out.println("毫秒："+calendar.get(Calendar.MILLISECOND));
		System.out.println("周几："+(calendar.get(Calendar.DAY_OF_WEEK)-1));//一周从周天开始计算，要-1
		System.out.println(calendar.get(Calendar.YEAR)+"-"+(calendar.get(Calendar.MONTH)+1)+"-"+
				calendar.get(Calendar.DAY_OF_MONTH)+" "+calendar.get(Calendar.HOUR)+":"+
				calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND)+":"+
				calendar.get(Calendar.MILLISECOND));
                           
	}

}
