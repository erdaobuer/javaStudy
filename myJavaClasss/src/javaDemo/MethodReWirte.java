package javaDemo;


public class MethodReWirte {

	public static void main(String[] args) {
		Zi zi=new Zi();
		zi.sing();
		
	}

}

class Fu{
	public void sing() {
		System.out.println("父亲在唱歌。。。");
	}
}

class Zi extends Fu{
	
	/**
	 * 方法的重写，既有父类功能，又有子类功能
	 */
	@Override
	public void sing() {
		super.sing();
		System.out.println("儿子在唱歌。。。");
	}
}

