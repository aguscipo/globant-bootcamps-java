package topic0.exercise3.proxy;

public class MySqlDatabase implements Database {

	@Override
	public void connect() {
		System.out.println("Connection to MySql database was stablished");

	}

}
