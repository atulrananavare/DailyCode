package com.daily.leetcodes.march24;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class demo{
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Employee> constructor = Employee.class.getConstructor();
        Employee emp1 = constructor.newInstance();
        emp1.setName("atul");
        System.out.println( emp1.getName());

        B b = new B();
        System.out.println(b);


    }
}

class A {
    int i;

    public A(int i) {
        System.out.println("class A construtor");
    }
}

class B extends A {
    int j;

    public B() {
        super(10);
        System.out.println("Clss B constructor");
    }
}
