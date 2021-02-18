import java.util.Iterator;

import com.ds.Student.Student;

public class TestDemo {

	public static void main(String[] args) {
//		Student student =new Student("王五",24);
//		Student student1=new Student("王五",24);
//		Student student2=student1;
//		System.out.println("是否相同："+student.equals(student1));//重写了父类的equals方法
//		System.out.println("是否相同："+student1.equals(student2));//重写了父类的equals方法
//		System.out.println(student.hashCode());
//		System.out.println(Integer.toHexString(student.hashCode()));
//		System.out.println(student.getClass());
//		System.out.println(student.toString());
		
		
		/* equals和==的区别 */
//		
//		Student s1=new Student("张三",24);
//		Student s2=new Student("张三",24);
//		
//		System.out.println(s1.equals(s2));
//		System.out.println(s1==s2);
		
		String aString ="abcdefg";
		char[] abc =new char[10];
		aString.getChars(0, 2, abc, 1);
		for(char element:abc) {
			System.out.print(element+"   ");
		}
		
	}

}
