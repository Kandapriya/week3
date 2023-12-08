package abstraction;

public class JavaConnection extends MySqlConnection {
	public static void main(String[] args) {
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();

	}

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println(" connect data");
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println(" Disconnet it");
	}

	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println(" execute it");
		
	}

}
