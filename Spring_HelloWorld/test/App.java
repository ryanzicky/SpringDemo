import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pack1.Customer;
import pack5.CustomerService;



public class App {

	/*public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Customer customer = (Customer) context.getBean("customerBean");
		
		System.out.println(customer);
	}*/
	
	/*public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService customer = (CustomerService) context.getBean("customerService");
		
		System.out.println(customer);
	}*/
	
	/**
	 * pack5
	 */
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		
		CustomerService customerService = (CustomerService) appContext.getBean("customerServiceProxy");
		
		System.out.println("*************************");
		customerService.printName();
		System.out.println("*************************");
		customerService.printURL();
		System.out.println("*************************");
		try {
			customerService.printThrowException();
		} catch (Exception e) {
		}
	}
}
