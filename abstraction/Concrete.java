package abstraction;

public class Concrete implements DatabseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concrete c=new Concrete();
		c.connect();
		c.disconnect();
		c.executeUpdate();

	}

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connect to the data");
	}

	public void disconnect() {
		System.out.println("Disconnect the data if its invalid");
		// TODO Auto-generated method stub
		
	}

	public void executeUpdate() {
		System.out.println("finish the update");
		// TODO Auto-generated method stub
		
	}

}
