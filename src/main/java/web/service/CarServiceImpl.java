package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("bmw", "red", 500));
        cars.add(new Car("mercedes", "grey", 550));
        cars.add(new Car("audi", "white", 450));
        cars.add(new Car("volkswagen", "black", 400));
        cars.add(new Car("volvo", "blue", 500));
    }

    @Override
    public List<Car> getCarList(int count) {
        return cars.stream().limit(Math.max(count, 0)).toList();
    }
}
