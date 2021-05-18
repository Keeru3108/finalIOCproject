package com.jspiders.pkg1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Zomatoserver 
{
 public static void main(String[] args) 
 {
	 ApplicationContext container=new ClassPathXmlApplicationContext("spring.xml");
	 User userobj=(User)container.getBean("espn");
	 System.out.println(userobj);
	 
}
}
