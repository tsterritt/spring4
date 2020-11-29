package creational.abstractfactory.truck;

import creational.abstractfactory.engines.FastEngine;
import creational.abstractfactory.transmissions.AutomaticTransmission;
import creational.abstractfactory.transmissions.ManualTransmission;
import creational.abstractfactory.trimoptions.ClothTrim;
import creational.abstractfactory.trimoptions.LeatherTrim;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TruckFactory implements ITruckFactory {

    @Override
    @Bean
    public ITruck farmTruck() {
        ManualTransmission transmission = new ManualTransmission();
        FastEngine engine = new FastEngine();
        ClothTrim trim = new ClothTrim();
        LongBed bed = new LongBed();
        return new Truck(engine, trim, bed, transmission);
    }

    @Override
    @Bean
    public ITruck fastTruck() {
        AutomaticTransmission transmission = new AutomaticTransmission();
        FastEngine engine = new FastEngine();
        LeatherTrim trim = new LeatherTrim();
        ShortBed bed = new ShortBed();
        return new Truck(engine, trim, bed, transmission);
    }
}
