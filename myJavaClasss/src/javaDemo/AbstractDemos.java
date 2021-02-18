package javaDemo;

public class AbstractDemos {

	public static void main(String[] args) {
//		Color color =new RedColor();
//		color.Draw();
//		color.aaa();//多态，父类必须有aa这个方法
		
		
		//抽象类练习
		自宫(new 岳不群());
		自宫(new 林平之());
		自宫(new 东方不败());
		
				

	}
	
	public static void 自宫(葵花宝典 somebody){
		somebody.自宫();
	}

}



/**
 * 抽象类，抽象方法
 * @ClassName: Color
 * @author Tate
 * @date Feb 4, 2021
 * @Description: TODO
 * @version V1.0
 *
 * 用几个小时来制定计划，可以节省几周的编程时间。
 * 在软件可以被重用前，它必须先可以被用。
 */
abstract class Color {
	String chinaName;
	String englishName;
	final int NUM=142;

	abstract void Draw();
	void aaa() {
		
	}
}


class RedColor extends Color{

	@Override
	void Draw() {
		System.out.println("I am Red Color...");
	}
	void aaa() {
		System.out.println("aa");
	}
	
}



abstract class 葵花宝典{
	public abstract void 自宫();
}

class 岳不群 extends 葵花宝典{
	final String NAME="岳不群";
	@Override
	public void 自宫() {
		System.out.println(NAME+"用剑自宫。。。");
	}
}
class 林平之 extends 葵花宝典{
	final String NAME="林平之";
	@Override
	public void 自宫() {
		System.out.println(NAME+"用刀自宫。。。");
	}
}
class 东方不败 extends 葵花宝典{
	final String NAME="东方不败";
	@Override
	public void 自宫() {
		System.out.println(NAME+"用天魔琴自宫。。。");
	}
}
