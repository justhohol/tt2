package m_flyweightmode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

public class ConnectionPool {

	private Vector<Connection> pool;
	/* 公有属性 */
	private String user;
	private String password;
	private String url;
	private String driverName;
	private int maxPoolSize;
	private int minPoolSize;

	public ConnectionPool(boolean f) {
		/**FOR TEST*/
	}

	/* 构造方法，做一些初始化工作 */
	public ConnectionPool() {
		pool = new Vector<Connection>(maxPoolSize);
		try {
			for (int x = 0; x < minPoolSize; x++) {
				Class.forName(driverName);
				Connection con = DriverManager.getConnection(url, user,
						password);
				pool.add(con);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/* 返回连接到连接池 */
	public synchronized void release(Connection con) {
		pool.add(con);
	}

	/* 返回连接池中的一个数据库连接 */
	public synchronized Connection getConnection() {
		if (pool != null) {
			if (pool.size() > 0) {
				Connection con = pool.get(0);
				pool.remove(con);
				return con;
			} else {
				return null;
			}
		} else {
			System.out.println("ConnectionPool异常");
			return null;
		}
	}

	public static void main(String[] args) {
		ConnectionPool p = new ConnectionPool(false);
		p.getConnection();
	}
}
