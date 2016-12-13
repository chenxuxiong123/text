package JDBC_proxy;

import org.junit.Test;

public class test {

	@Test
	public void test(){
		UserDao userDao = new UserDaoImpl();
		
		UserDao proxy  = (UserDao) new MyJDBCProxy().MyJDBCProxy();
		
		proxy.add();
		proxy.update();
		proxy.delete();
		proxy.find();
		
				
	}
}
