import java.util.function.Predicate;

public class MyClass {
	Predicate<MyClass> p1 = (MyClass instance) -> this.equals(instance);
	Predicate<MyClass> p2 = this::equals;
	int x = 1;
	String y = "A";
	public MyClass(int x, String y) {
		this.x = x;
		this.y = y;
	}
	public void myMethod(MyClass cl) {
		System.out.println("Is this instance equal to cl? " + p2.test(cl));
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(ob.getClass() != getClass()) return false;
		MyClass mc = (MyClass)ob;
		return mc.x == x && mc.y.equals(y);
	}

	public static void main(String[] args) {
		MyClass myclass = new MyClass(1, "A");
		MyClass myclass1 = new MyClass(1,"B");
		myclass.myMethod(myclass);
		myclass.myMethod(myclass1);

	}

}
