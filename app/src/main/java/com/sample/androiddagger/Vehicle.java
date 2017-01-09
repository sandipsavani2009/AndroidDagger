package com.sample.androiddagger;

/**
 * Created by sandip on 9/1/17.
 */

public class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
        System.out.println(" Vehicle created with Name : " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
