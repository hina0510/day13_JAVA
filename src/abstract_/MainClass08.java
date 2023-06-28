package abstract_;

import java.util.*;

interface Test08{
	public int num = 100;
	public static final String name = "홍길동";
	public static String name1 = "홍길동";
	public final String name2 = "홍길동";
}
public class MainClass08 implements Test08{
public static void main(String[] args) {
	List<String> arr = new ArrayList<>();
	Map<String, String> map = new HashMap<>();
	Set<String> set = new HashSet<>();
	System.out.println(num);
	System.out.println(name);
	System.out.println(name1);
	System.out.println(name2);
	
}
}
