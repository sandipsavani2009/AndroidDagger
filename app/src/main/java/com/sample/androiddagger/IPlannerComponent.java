package com.sample.androiddagger;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by sandip on 9/1/17.
 */

@Singleton
@Component(modules = {PicnicPlannerModule.class})
public interface IPlannerComponent {
    Vehicle providerVehicle();
    RouteProvider provideRoute();
}
