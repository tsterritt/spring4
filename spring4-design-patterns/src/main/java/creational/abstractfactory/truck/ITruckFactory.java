package creational.abstractfactory.truck;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public interface ITruckFactory {
    public ITruck farmTruck();
    public ITruck fastTruck();
}
