package com.sample.androiddagger;

/**
 * Created by sandip on 9/1/17.
 */

public class RouteProvider {

    private String routeName;

    public RouteProvider(String routeName) {
        this.routeName = routeName;
        System.out.println(" RouteProvider created with Name : " + routeName);
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }
}
