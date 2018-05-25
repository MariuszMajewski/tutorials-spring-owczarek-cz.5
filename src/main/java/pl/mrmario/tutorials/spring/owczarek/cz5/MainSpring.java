package pl.mrmario.tutorials.spring.owczarek.cz5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.zip.DataFormatException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author MrMario108
 *		Fabrykuj¹ce metody statyczne
 */
public class MainSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		User user = context.getBean("someUser",User.class);
		System.out.println(user);
		
	}
}