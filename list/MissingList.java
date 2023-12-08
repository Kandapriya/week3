package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MissingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a= {1, 2, 3, 4, 7, 6, 8};
		Arrays.sort(a);
		//System.out.println(Arrays.toString(a));
		List<Integer> a1=new ArrayList<Integer>(Arrays.asList(a));
		System.out.println(a1);
		for (int i = 0; i < a1.size(); i++) {
			int n=i+1;
			if (n!= a1.get(i)) {
				System.out.println(n);
				
			}
			
		}
		
		
		

	}

}
