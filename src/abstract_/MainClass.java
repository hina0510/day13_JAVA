package abstract_;

abstract class TestClass01{
	public abstract void function();//추상화 : 상속받는 클래스에서 오버라이딩 필요함
	public void test() {
		System.out.println("test 기능");
	}
}
class Test01 extends TestClass01{
	public void function() {
		System.out.println("aaaa");
	}
	public void test01() {
		System.out.println("새로운 기능");
	}
}

public class MainClass {
public static void main(String[] args) {
	Test01 t = new Test01();
}
}
