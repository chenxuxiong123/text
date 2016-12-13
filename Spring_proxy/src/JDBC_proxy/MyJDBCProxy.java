package JDBC_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyJDBCProxy implements InvocationHandler{

	private UserDao userDao;
	public UserDao userDao(UserDao userDao){
		return this.userDao = userDao;
	}
	
	
	public UserDao MyJDBCProxy(){
		UserDao proxy = (UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), this);
		return proxy;
		
	}

	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		if("add".equals(method.getName())){
			return method.invoke(proxy, args);
		}
		
		return method.invoke(proxy, args);
	}
}
