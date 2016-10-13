package k_bridgemode;

public class OracleDriver implements DriverI {

	@Override
	public void connectDataBase() {
		System.out.println("connect Oracle DataBase");
	}

	@Override
	public void disConnectDataBase() {
		System.out.println("disConnect Oracle DataBase");
	}

}
