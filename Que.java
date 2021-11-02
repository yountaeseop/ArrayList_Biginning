package Java2021_11_01_ArrayList2;

import java.util.ArrayList;

public class Que {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
		list1.add(5);
		list1.add(4);
		list1.add(3);
		list1.add(2);
		list1.add(1);
		list1.add(0);
		
		System.out.println(list1.size());
		
		System.out.println("==================");
		
		System.out.println(list1.get(2));
		System.out.println(list1.get(3));
		
		System.out.println("==================");
		
		list1.remove(0);
		list1.remove(0);
		
		System.out.println(list1.get(2));
		System.out.println(list1.get(3));
		
		System.out.println("==================");
		
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		

	}

}

