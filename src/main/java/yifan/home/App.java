package yifan.home;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.apache.log4j.Logger;

import yifan.home.bo.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("conf/spring-app-context.xml");
		
		PlannedJobService plannedJobService = ctx.getBean("plannedJobService", PlannedJobService.class);
		
		plannedJobService.save(args[0]);

    }
}
