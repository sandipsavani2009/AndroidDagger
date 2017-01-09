package com.sample.androiddagger;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PicnicPlannerModule {

    private Vehicle vehicle;
    private RouteProvider routeProvider;

    public PicnicPlannerModule(String vehicleName, String routeName) {
        vehicle = new Vehicle(vehicleName);
        routeProvider = new RouteProvider(routeName);
    }

    /**
     * Providers dependency object of Vehicle
     * @return
     */
    @Provides
    @Singleton
    public Vehicle providerVehicle() {
        return vehicle;
    }

    /**
     * Provides dependency instance / object of RouteProvider
     */
    @Provides
    @Singleton
    public RouteProvider provideRoute() {
        return routeProvider;
    }

}
