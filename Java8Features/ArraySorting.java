package Java8Features;

import java.util.Arrays;
import java.util.Iterator;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a []= {16,28,54,25,8,53,89,13};
		
		System.out.println("Before Sorting");
		for(int i :a) {
			System.out.println(i+"");
		}
		
		//Arrays.parallelSort(a);
		Arrays.parallelSort(a, 0, 6);
		System.out.println("/nAfter Sorting");
		for (int i : a) {
			System.out.println(i+"");
		}

	}

}
