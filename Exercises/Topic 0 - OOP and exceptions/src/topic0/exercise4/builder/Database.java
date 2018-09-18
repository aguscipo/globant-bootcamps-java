package topic0.exercise4.builder;

public class Database {
	private String username;
	private String password;
	private String url;

	private Database(DatabaseBuilder builder) {
		this.setUrl(builder.url);
		this.setUsername(builder.username);
		this.setPassword(builder.password);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public static class DatabaseBuilder {
		private String username;
		private String password;
		private String url;

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public DatabaseBuilder(String url) {
			this.setUrl(url);
		}

		public DatabaseBuilder withUsername(String username) {
			this.setUsername(username);
			return this; // By returning the builder each time, we can create a fluent interface.
		}

		public DatabaseBuilder andPassword(String password) {
			this.setPassword(password);
			return this;
		}

		public Database build() {
			return new Database(this);
		}

	}

	public void connect() {
		System.out.println("Connecting to " +this.getUrl()+"...");
	}

}
