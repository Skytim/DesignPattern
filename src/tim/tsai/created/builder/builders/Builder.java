package tim.tsai.created.builder.builders;

import tim.tsai.created.builder.cars.CarType;
import tim.tsai.created.builder.components.Engine;
import tim.tsai.created.builder.components.GPSNavigator;
import tim.tsai.created.builder.components.Transmission;
import tim.tsai.created.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
