package k_bridgemode;

public class MySQLDriver implements DriverI {

	@Override
	public void connectDataBase() {
		System.out.println("connect MySQL DataBase");
	}

	@Override
	public void disConnectDataBase() {
		System.out.println("disConnect MySQL DataBase");
	}

}
