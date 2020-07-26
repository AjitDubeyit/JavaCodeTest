
class Base{
	private int data;
	
	public Base() {
		data = 5;
	}
	
	public int getData() {
		return this.data;
	}
}
public class Test2 extends Base {

	private int data;
	public Test2() {
		data = 6;
	}
	public int getData() {
		return this.data;
	}
	
	public static void main(String[] args) {
		
		int x = 3 &5;
		int y = 3|5;
		System.out.println(x+","+y);
		Test2 t = new Test2();
		System.out.println(t.getData());
	}
	
}
