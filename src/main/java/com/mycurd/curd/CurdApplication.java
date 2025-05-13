package com.mycurd.curd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CurdApplication {

	public static void main(String[] args) {
		// SpringApplication.run(CurdApplication.class, args);
		// MyComponent myComponent = new MyComponent();
		// myComponent.display();

		ApplicationContext context = SpringApplication.run(CurdApplication.class, args);
		MyApp myApp = context.getBean(MyApp.class);
		myApp.run(args);
		// MyComponent myComponent = context.getBean(MyComponent.class);
		// myComponent.componentDisplay();
	}

}
