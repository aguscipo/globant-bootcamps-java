package topic0.exercise2.abstractfactory;

public class CassandaConnection implements NoSqlConnection {

	public void connect() {
		System.out.println("Connection to Cassandra was stablished");
	}

	public void disconnect() {
		System.out.println("Connection to Cassandra was closed");

	}
}
