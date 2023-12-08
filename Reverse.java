package week3.Assignment;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		//String out="";
		//String rev="";
		String[] split = test.split(" ");
		for (int i = 0; i < split.length; i++) {
			if (i%2!=0) {
				char[] charArray = split[i].toCharArray();
			for (int j =charArray.length-1; j >=0; j--) {
				
				//rev=rev+charArray[j];
				System.out.print(charArray[j]);
				}	}	
					
			else {
               // out=out+rev+" ";
				//out=out+split[i]+" ";
				System.out.print(" ");
				System.out.print(split[i]+" ");
				}
			
			
			
		}
		
			}
			
		
}
	

	

