package com.firstSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Patient patientBean = applicationContext.getBean(Patient.class,"patientBean");
		
		patientBean.fun();
	}
}
