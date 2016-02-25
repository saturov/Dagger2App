package ru.saturov.dagger2app.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.saturov.dagger2app.model.Motor;
import ru.saturov.dagger2app.model.Vehicle;

@Module
public class VehicleModule {

    @Provides @Singleton
    Motor provideMotor() {
        return new Motor();
    }

    @Provides @Singleton
    Vehicle provideVehicle() {
        return new Vehicle(new Motor());
    }
}
