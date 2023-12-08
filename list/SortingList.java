package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] value= {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> v1=new ArrayList<String>(Arrays.asList(value));
		Collections.sort(v1,Collections.reverseOrder());
		System.out.println(v1);
		
		
		

	}

}
