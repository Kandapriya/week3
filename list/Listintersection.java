package list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listintersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a= {3, 2, 11, 4, 6, 7};
		Integer[] b= {1, 2, 8, 4, 9, 7};
		Arrays.sort(b);
		Arrays.sort(a);
		List<Integer> a1 =new ArrayList<Integer>(Arrays.asList(a));
		List<Integer> b1=new ArrayList<Integer>(Arrays.asList(b));
		a1.retainAll(b1);{
			System.out.println(b1);
		}
		}
		}

	

