package Anonymity;

interface Inter {
	void show();
}

class Outer {
	static Inter method() {
		return new Inter() {
			@Override
			public void show() {
				System.out.println("helloWorld");
			}
		};
	}
}

public class OuterDemo {
	public static void main(String[] args) {
		//调用Outer类的static方法method，这个方法返回一个class，然后调用这个class的show方法
		Outer.method().show();
	}
}
