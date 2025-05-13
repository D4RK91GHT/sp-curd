package com.mycurd.curd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyApp {

    // private MyComponent myComponent;

    // @Autowired
    // public MyApp(MyComponent myComponent) {
    //     this.myComponent = myComponent;
    // }

    // public void run(String[] args) {
    //     System.out.println("Hello from My App");
    //     myComponent.componentDisplay();
    // }

    private MyExternalComponent myExternalComponent;
    
    @Autowired
    public MyApp(MyExternalComponent myExternalComponent) {
        this.myExternalComponent = myExternalComponent;
    }

    public void run(String[] args) {
        System.out.println("Hello from My App");
        myExternalComponent.externalDisplay();
    }
}
