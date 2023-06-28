package abstract_;

interface Test09{
	public void test();
}
class TestClass09 implements Test09{
	public void test() {
		System.out.println("test 실행");
	}
}
public class MainClass09 {
public static void main(String[] args) {
	Test09 t01 = new TestClass09();
	t01.test();
	System.out.println("=============");
	Test09 t02 = new Test09() {
		public void test() {
			System.out.println("interface");
		}
	};
	t02.test();
	
	System.out.println("=============");
	Test09 t03 = () ->System.out.println("람다가 실행됩니다");//람다
	t03.test();
	
}
}
