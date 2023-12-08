package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a= {3, 2, 11, 4, 6, 7};
		//int total=a.length;
		
		List<Integer> a1=new ArrayList<Integer>(Arrays.asList(a));
		Collections.sort(a1);
		System.out.println(a1);
		Integer large = a1.get(a1.size()-2);
		System.out.println("Second Largest Number is :"+large);
		
		
		
	

	}

}
