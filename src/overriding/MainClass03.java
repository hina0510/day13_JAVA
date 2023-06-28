package overriding;

final class Test03{//클래스 앞에 final이 붙으면 상속이 불가능함. overriding X (변경 불가능)
	public void test() {
		System.err.println("부모의 기능");
	}
}
class TestClass03{
	public void test() {
		Test03 t = new Test03();//상속받지 못하면 new로 만들어 사용
		System.err.println("자식의 기능");
	}
}

public class MainClass03 {
public static void main(String[] args) {
	
}
}
