package topic0.exercise3.proxy;

public class DatabaseProxy implements Database {
	/**
	 * Reference to RealSubject
	 */
	private MySqlDatabase proxifiedDatabase;

	@Override
	public void connect() {
		// Optional functionality (e.g check some permissions or do something before the
		// connection

		// Create the Database Object only when is required
		proxifiedDatabase = new MySqlDatabase();

		// Now call connect on realSubject (mysql database)
		proxifiedDatabase.connect();

	}

}
