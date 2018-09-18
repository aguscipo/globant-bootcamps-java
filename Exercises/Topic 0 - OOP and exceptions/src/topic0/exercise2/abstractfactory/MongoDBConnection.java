package topic0.exercise2.abstractfactory;

public class MongoDBConnection implements NoSqlConnection {

	public void connect() {
		System.out.println("Connection to MongoDB was stablished");
	}

	
	public void disconnect() {
		System.out.println("Connection to MongoDB was closed");

	}

}
