package topic0.exercise2.abstractfactory;

public abstract class AbstractFactory {
	abstract SqlConnection getSqlConnection(String dbType);

	abstract NoSqlConnection getNoSqlConnection(String dbType);

}
