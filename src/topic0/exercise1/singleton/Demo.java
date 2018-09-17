package topic0.exercise1.singleton;

/*1-Create a singleton example for a database connection.*/


public class Demo {

	public static void main(String[] args) {
		Database exampleDb = Database.getConnection("mysql", "localhost", "3306", "mockDB", "globant", "123456");
		exampleDb.connect();
		System.out.println("Using database");
		exampleDb.disconnect();
	}

}
