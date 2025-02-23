package com.demo.springconcepts;

import com.demo.springconcepts.beans.EmployeeBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptsApplication {

	public static void main(String[] args) {

	    ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);

	    // Retrieving EmployeeBean from ApplicationContext
	    EmployeeBean employee = context.getBean(EmployeeBean.class);
	    System.out.println(" Employee Details: " + employee);
	}

}
