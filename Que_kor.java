package Java2021_11_01_ArrayList2;

import java.util.ArrayList;

public class Que_kor {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add("이순신");
		list.add("황진이");
		list.add("임꺽정");
		list.add("강감찬");
		list.add("을지문덕");
		
		System.out.println(list.size());
		
		System.out.println("===============");
		
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		System.out.println("===============");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("===============");
		
		list.remove("홍길동");
		list.remove("이순신");
		
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		System.out.println("===============");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("===============");
		
		list.add("정약용");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("===============");
		
		list.set(1, "신사임당");
		list.set(3, "유관순");
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == "황진이" || list.get(i) == "신사임당" || list.get(i) == "유관순") {
				System.out.println(list.get(i));
			}
		}
		
		System.out.println("===============");
		
		
		
		
		
		
		

	}

}
