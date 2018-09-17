package topic0.exercise2.abstractfactory;

public class MySqlConnection implements SqlConnection {

	public void connect() {
		System.out.println("Connection to MySql was stablished");
	}

	public void disconnect() {
		System.out.println("Connection to MySql was closed");
	}

}
