package inheritance;

public class LoginTestData extends TestDatasi {
	public void enterUsername() {
		System.out.println("priya");
		
	}
	public void enterPassword() {
		System.out.println("12345");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData si=new LoginTestData();
		si.enterCredentials();
		si.enterUsername();
		si.enterPassword();
		si.navigateToHomePage();

	}

}
