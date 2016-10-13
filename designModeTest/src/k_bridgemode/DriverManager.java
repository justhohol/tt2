package k_bridgemode;

public class DriverManager implements DriverI{
	private DriverI driver = null;
	public DriverManager(String database){
		if("Oracle".equals(database)){
			driver=new OracleDriver();
		}else if("MySQL".equals(database)){
			driver=new MySQLDriver();
		}
	}
	@Override
	public void connectDataBase() {
		driver.connectDataBase();
	}
	@Override
	public void disConnectDataBase() {
		driver.disConnectDataBase();
	}
	
}
