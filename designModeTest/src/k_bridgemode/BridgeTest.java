package k_bridgemode;

public class BridgeTest {

	public static void main(String[] args) {
		DriverManager manager = new DriverManager("MySQL");
		manager.connectDataBase();
		manager.disConnectDataBase();
		DriverManager manager2 = new DriverManager("Oracle");
		manager2.connectDataBase();
		manager2.disConnectDataBase();
	}

}
