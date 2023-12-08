package week3.Assignment;

import java.util.Arrays;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] split = text.split(" ");
		System.out.println(Arrays.toString(split));
		for (int i = 0; i < split.length; i++)
		{
			//if(split[i]!="")
			for (int j = 1; j < i; j++)
			{
				if(split[i].equals(split[j]))
				{
					count++;
				//split[j]="";
				
				if(count>=1) {
					split[i]=" ";
				}
					}
			
		}
			}
		System.out.print(Arrays.toString(split));
		
	}
}
					
					
				

				
		
		
		


