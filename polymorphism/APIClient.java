package polymorphism;

public class APIClient {
  public void sendRequest(String End) {
	  //End="you are at the EndPoint ";
	  System.out.println("With one Argument :"+End);
	
}
public void sendRequest(String End,String req, boolean Status) {
	//End=" you are at the end point with request ";
	//req="Requesting";
	System.out.println("With Three Argument :" +End+" , "+req+" , " +Status );
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient ac=new APIClient ();
		ac.sendRequest("End point");
		ac.sendRequest("End Point", "Requestbody", false);
		
		
		
	}

}
