package uts.pkg1;

public class MisteriMain {
	public static void main(String[] args) {
		//1
		Misterius xx = new Misterius();
		System.out.println("======");
		
		//2
		Misterius xy = new Asing(4, 5);
		System.out.println("======");
		
		//3
		Asing zz = new Suram(0);
		
		System.out.println("======");
		//4
		Asing vv = (Asing) xy;
		System.out.println(vv.x);
		System.out.println("======");
		//5
		xy.hush();
		System.out.println("======");
		//6
		System.out.println(zz.x);
		System.out.println("======");
		//7
		Suram xz = (Suram) zz;
		xz.hush();
		System.out.println("======");
		//8
		xx.hush();
		System.out.println("======");
		//9
		Asing dd = new Asing();
		System.out.println("======");
		//10
		Suram gg = new Suram();
		System.out.println("======");
	}
}

class Misterius{
	static int main = 1;
	int x;
	
	public Misterius() {
		main++;
		x = 2;
		System.out.println(x);
	}
	
	public Misterius(int x) {
		this();
		this.x = x + 2;
		System.out.println(x);
	}
	
	public void hush() {
		System.out.println(main);
	}
}

class Asing extends Misterius{
	int x;
	int y;
	
	public Asing() {
		super(7);
		System.out.println(x);
	}
	
	public Asing(int x, int y) {
		super();
		this.x = x+y;
		this.y = x*y;
		System.out.println(super.x);
	}
	
	public void hush() {
		System.out.println(x + "-" + y);
	}
}

class Suram extends Asing{
	int x = 9;
	
	public Suram() {
		super();
		System.out.println(main);
	}
	
	public Suram(int x) {
		super();
		super.x = x;
		System.out.println(main);
	}
}
