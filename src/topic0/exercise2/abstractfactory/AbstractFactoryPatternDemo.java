package topic0.exercise2.abstractfactory;

/*2-Create a abstract factory example for diferent type of SQL connections. See this example. */

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {

		/*
		 * Get an sql factory wich allows connections to any SQL database defined(MYSQL,
		 * POSTGRE, etc)
		 */
		AbstractFactory sqlConnectionFactory = FactoryProducer.getFactory("SQL");

		// Get a MYSQL connection
		SqlConnection sqlConnection1 = sqlConnectionFactory.getSqlConnection("MYSQL");

		sqlConnection1.connect();
		sqlConnection1.disconnect();

		// Get a POSTGRE connection
		SqlConnection sqlConnection2 = sqlConnectionFactory.getSqlConnection("POSTGRE");

		sqlConnection2.connect();
		sqlConnection2.disconnect();

		/*
		 * Get an nosql factory (allow connections to any NOSQL database
		 * defined(MONGODB, CASSANDRA, etc)
		 */
		AbstractFactory noSqlConnectionFactory = FactoryProducer.getFactory("NOSQL");

		// Get a MONGODB connection
		NoSqlConnection noSqlConnection1 = noSqlConnectionFactory.getNoSqlConnection("MONGODB");

		noSqlConnection1.connect();
		noSqlConnection1.disconnect();

		// Get a CASSANDRA connection
		NoSqlConnection noSqlConnection2 = noSqlConnectionFactory.getNoSqlConnection("CASSANDRA");

		noSqlConnection2.connect();
		noSqlConnection2.disconnect();

	}
}
