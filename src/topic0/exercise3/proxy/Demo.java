package topic0.exercise3.proxy;

public class Demo {

	public static void main(String[] args) {
		Database myDatabase = new DatabaseProxy();
		myDatabase.connect();
	}

}
