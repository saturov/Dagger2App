package ru.saturov.dagger2app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import ru.saturov.dagger2app.model.Vehicle;
import ru.saturov.dagger2app.module.VehicleComponent;
import ru.saturov.dagger2app.module.DaggerVehicleComponent;
import ru.saturov.dagger2app.module.VehicleModule;

public class MainActivity extends AppCompatActivity {

    private Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VehicleComponent component = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();
        vehicle = component.provideVehicle();

        Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();
    }
}
