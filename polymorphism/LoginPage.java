package polymorphism;

public class LoginPage extends BasePage {
	public void performCommonTasks() {
		System.out.println("perform th task on Loginpage");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage lp=new LoginPage();
		lp.findElement();
		lp.clickElement();
		lp.enterText();
		lp.performCommonTasks();
	}

}
