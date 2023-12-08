package inheritance;
//DerivedClass or ParentClass
public class TextField extends  WebElement{
	public void getText() {
		System.out.println("WebElement text is:");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextField we=new TextField();
		we.click();
		we.getText();
		we.setText(null);
	}

}
