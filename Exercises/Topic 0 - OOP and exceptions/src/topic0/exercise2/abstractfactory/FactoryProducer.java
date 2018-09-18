package topic0.exercise2.abstractfactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String dbType) {

		if (dbType.equalsIgnoreCase("SQL")) {
			return new SqlConnectionFactory();

		} else if (dbType.equalsIgnoreCase("NOSQL")) {
			return new NoSqlConnectionFactory();
		}

		return null;
	}

}
