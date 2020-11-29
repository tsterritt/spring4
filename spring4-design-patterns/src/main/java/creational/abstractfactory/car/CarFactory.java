package creational.abstractfactory.car;

import creational.abstractfactory.engines.FastEngine;
import creational.abstractfactory.engines.HybridEngine;
import creational.abstractfactory.transmissions.AutomaticTransmission;
import creational.abstractfactory.transmissions.ManualTransmission;
import creational.abstractfactory.trimoptions.ClothTrim;
import creational.abstractfactory.trimoptions.LeatherTrim;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarFactory implements ICarFactory {

    @Override
    @Bean
    public ICar luxuryHybrid() {
        AutomaticTransmission transmission = new AutomaticTransmission();
        HybridEngine engine = new HybridEngine();
        LeatherTrim trim = new LeatherTrim();
        return new Car(engine, transmission, trim);
    }

    @Override
    @Bean
    public ICar fastCar() {
        ManualTransmission transmission = new ManualTransmission();
        FastEngine engine = new FastEngine();
        ClothTrim trim = new ClothTrim();
        return new Car(engine, transmission, trim);
    }
}
