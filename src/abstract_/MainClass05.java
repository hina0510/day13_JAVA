package abstract_;

class A지상군05 implements Army{
	public void 총알장전() {
		System.out.println("총알을 장전합니다");
	}
	
	public void 방패설치() {
		System.out.println("방패를 설치합니다");
	}
	
	public void attack() {
		총알장전();
		System.out.println("지상군이 공격합니다");
	}

	public void defense() {
		방패설치();
		System.out.println("지상군이 방어합니다");
	}
	
}
public class MainClass05 {
public static void main(String[] args) {
	Army a = new A지상군05();//업캐스팅 : 상속받는 인터페이스를 통해 메소드 사용
	a.attack();
	a.defense();
}
}
