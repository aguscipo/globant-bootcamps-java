package topic0.exercise2.abstractfactory;

public class PostgreConnection implements SqlConnection {
	public void connect() {
		System.out.println("Connection to Postgre was stablished");
	}
	
	public void disconnect() {
		System.out.println("Connection to Postgre was closed");
	}
}
