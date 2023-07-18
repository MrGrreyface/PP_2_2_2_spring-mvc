package web.service;

import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService{

    private final List<Car> carList = Arrays.asList(new Car("BMW", "X6", 1),
            new Car("Lada", "Granta", 2),
            new Car("Mercedes","W168", 3),
            new Car("Chevrolet", "Tahoe", 4),
            new Car("Ford", "Focus", 5));
    @Override
    public List<Car> getCarList(int count) {
        if (count < 5) {
            return carList.stream().limit(count).collect(Collectors.toList());
        }
        return carList;
    }
}
