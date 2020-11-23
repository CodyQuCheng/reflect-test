
import com.qucheng.reflectpj.dao.IBookDao;
import com.qucheng.reflectpj.dao.IUserDao;
import com.qucheng.reflectpj.reflect.ApplicationContext;

public class BootStrap {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		ApplicationContext applicationContext = new ApplicationContext();
		applicationContext.initContext();
		
		System.out.println(applicationContext.getBean(IBookDao.class));
		
	} 

}