package com.starter.autoconfigure;

/**
 * @author tzxx
 */
public class HelloHandler {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sayHello(){
        return getName()+" say Hello";
    }
}
