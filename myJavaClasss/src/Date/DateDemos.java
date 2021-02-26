package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemos {

	public static void main(String[] args) throws ParseException {
		/*Date引用的jar包是import java.util.Date;而不是import java.sql.Data;*/
		Date date =new Date();
		System.out.println(date);
		//Mon Feb 22 14:30:46 CST 2021
		//星期 月份 日期 时间    时间区 年份
		
		/* 时间差，毫秒数 */
		long time1=date.getTime();
		System.out.println("time1："+date);
		System.out.println("自1970.1.1 00：00:000到现在的毫秒数time1："+time1);
		for(int i=0; i<100000;i++) {
			Math.sin(Math.abs((double)i));
		}
		Long time2= new Date().getTime();
		System.out.println("自1970.1.1 00：00:000到现在的毫秒数time2："+time2);
		System.out.println("走了多少秒？？"+(time2-time1));
		
		/*毫秒转换成日期格式*/
		long time =1613984785390L;
		System.out.println("time:"+new Date(time1));
		
		/* 字符串转日期格式 */
		String str ="2021年02月23日 10：43：21";//日期格式必须和simple中的格式一样
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH：mm：ss");
		//把字符串解析成Date对象
		Date date2= sdf.parse(str);
		System.out.println(date2);
		System.out.println(date2.getTime());
		
		/* 计算自己来到这个世界多少天？ */
		String birthday ="1986-02-22";
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");
		Date birthdayDate= sdf2.parse(birthday);
		long timeDifference=new Date().getTime()-birthdayDate.getTime();
		System.out.println("我从出生到现在总共毫秒数="+timeDifference);
		System.out.println("我从出生到现在总共秒数="+timeDifference/1000);
		System.out.println("我从出生到现在总共分钟数="+timeDifference/1000/60);
		System.out.println("我从出生到现在总共小时数="+timeDifference/1000/60/60);
		System.out.println("我从出生到现在总共天数="+timeDifference/1000/60/60/24);
		System.out.println("我从出生到现在总共年数="+timeDifference/1000/60/60/24/365);
		

	}

}
