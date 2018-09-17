package topic0.exercise4.builder;

/*4-Create a builder example for database connection.*/

public class Demo {

	public static void main(String[] args) {

		Database mySql = new Database.DatabaseBuilder("jdbc:mysql://localhost:3306/mockDb")
									  .withUsername("globant")
	            					  .andPassword("1234567")
	            					  .build();

		mySql.connect();

	}

}
