package abstraction;

public abstract class MySqlConnection implements DatabseConnection {
	public void executeQuery() {
		System.out.println("Execute the Query");
		
	}

}
