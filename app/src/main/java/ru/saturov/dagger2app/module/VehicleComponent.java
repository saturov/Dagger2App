package ru.saturov.dagger2app.module;

import javax.inject.Singleton;

import dagger.Component;
import ru.saturov.dagger2app.model.Vehicle;

@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {

    Vehicle provideVehicle();
}
