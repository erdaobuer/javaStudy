package DuoTai;

public class AAAADemos {

	public static void main(String[] args) {
		int a=123;//局部内部类访问局部变量，该变量必须使用final修饰
		 
		 class Inner{
			 public void printA() {
				 System.out.println("a="+a);
			 }
		}
		
		
		
		Fu z=new Zi();
		System.out.println("z="+z.b);//变量：编译看左，运行看左
		System.out.println("static="+z.FuStatic());//变量：编译看左，运行看左
		System.out.println("fuFun="+z.fuFun());//变量：编译看左，运行看右

	}

}



class Fu{
	int b=10;
	static int FuStatic() {
		return 111;
	}
	int fuFun() {
		return 1000;
	}
}

class Zi extends Fu{
	int b=12;
	static int FuStatic() {
		return 222;
	}
	int fuFun() {
		return 2000;
	}
}
