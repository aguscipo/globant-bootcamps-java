package topic0.exercise1.singleton;

public class Database {

	private static Database dbConnection = null;
	private String username;
	private String dbName;
	private String password;
	private String dbType;
	private String port;
	private String host;

	public Database(String dbType, String host, String port, String dbName, String username, String password) {
		this.username = username;
		this.dbName = dbName;
		this.password = password;
		this.dbType = dbType;
		this.port = port;
		this.host = host;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDbType() {
		return dbType;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public static Database getConnection(String dbType, String host, String port, String dbName, String username,
			String password) {
		if (dbConnection == null) {
			dbConnection = new Database(dbType, host, port, dbName, username, password);
		}
		return dbConnection;
	}

	public void connect() {
		System.out.println("Connecting...");
		System.out.println("Succesful connection to: " + this.getDbType() + "://" + this.getHost() + ":"
				+ this.getPort() + "/" + this.getDbName() + " by user:" + this.getUsername());
	}

	public void disconnect() {
		if (dbConnection != null) {
			System.out.println("Closing connection...");
			System.out.println("Connection was closed");
		}
	}

}