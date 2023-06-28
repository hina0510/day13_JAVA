package overriding;

class Test{
	public void test111() {}
}
class TestClass05 extends Test{
	
}

public class MainClass05 {
public static void main(String[] args) {
	TestClass05 t = new TestClass05();
	System.out.println(t.getClass());//클래스 경로
	System.out.println(t.toString());//객체 정보 : 위치
	System.out.println(t);
}
}
