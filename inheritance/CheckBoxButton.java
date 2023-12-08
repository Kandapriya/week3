package inheritance;
//Child Class for Button parent class 
public class CheckBoxButton extends Button {
	public void clickCheckButton() {
		System.out.println("Click on the checkbutton");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxButton bb=new CheckBoxButton();
		bb.click();
		bb.setText(null);
		bb.submit();
		bb.clickCheckButton();
		

	}

}
