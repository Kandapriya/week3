package week3.Assignment;

public class Uppercase {

	public static void main(String[] args) {
		String test="changeme";
		char[] odd = test.toCharArray();
		for (int i = 0; i < odd.length; i++) {
			
			if(i%2!=0) 
			{
			//char c = odd[i];
			odd[i]=Character.toUpperCase(odd[i]);
			}
			System.out.print(odd[i]);
			//break;
			
		}
	}
		
	    		
	    		
	    
	    		
	    	
			
		

	
	
	
	
	
	
	
		}
		


