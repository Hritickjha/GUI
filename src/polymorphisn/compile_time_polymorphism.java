package polymorphisn;

public class compile_time_polymorphism {
	void add() {
		int a = 10, b=20, c;
		c =a+b;
		System.out.println(c);
	}
	void add(int x, int y)
	{
		int c;
		c=x+y;
		System.out.println(c);
	}
	void add(int x, double y) {
		double c;
		c=x+y;
		System.out.println(c);
	}
	public static void main(String[]args) {
		A r=new A();
		r.add(); r.add(100,200); r.add(50,45.32);
		
	}
	

}
