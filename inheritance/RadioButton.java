package inheritance;
//Child Class for button Parent Class
public class RadioButton extends Button{
	public void selectRadioButton() {
		System.out.println("cilck on the Radiobutton");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButton rb=new RadioButton();
		rb.click();
		rb.setText(null);
		rb.submit();
		rb.selectRadioButton();
		
	}

}
