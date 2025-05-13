package com.mycurd.curd;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    public MyComponent() {
        System.out.println("MyComponent constructor");
    }
    public void componentDisplay() {
        System.out.println("Hello World from MyComponent");
    }
}
